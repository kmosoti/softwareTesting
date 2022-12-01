import java.util.Scanner;

//Quick Sort Algorithm
public class SortingAlgorithms{
	public static void main(String[] args) {
        
        //Scanner object to read input from user in the form of integers: [1,2, ... , n] where n is the maximum number of elements in the array
        Scanner sc = new Scanner(System.in);
        
        //User input string of array elements separated by a comma
        System.out.println("Enter the array elements separated by a comma: ");
        String input = sc.nextLine();
        
        //Split the input string into an array of strings
        String[] inputArray = input.split(",");
        
        //Create an array of integers to store the input array elements
        int[] array = new int[inputArray.length];
        
        //Convert the array of strings to an array of integers
        for(int i = 0; i < inputArray.length; i++){
            array[i] = Integer.parseInt(inputArray[i]);
        }

        //prompt the user for type of sorting algorithm to use
        System.out.println("*****************");
        System.out.println("Enter the type of sorting algorithm to use: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Heap Sort");
        System.out.println("*****************");
        
        //Read the user input
        int choice = sc.nextInt();

        //Switch case to call the appropriate sorting algorithm
        switch(choice){
            case 1:
                bubbleSort(array);
                break;
            case 2:
                insertionSort(array);
                break;
            case 3:
                selectionSort(array);
                break;
            case 4:
                mergeSort(array, 0, array.length - 1);
                break;
            case 5:
                quickSort(array, 0, array.length - 1);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        //Print the sorted array
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //Close the scanner object
        sc.close();
        
    }

    // QuickSort sort algo
    public static int[] quickSort(int[] arr, int l, int r) {
        if (l < r) {
            // partition the array w.r.t pivot element
            int p = partition(arr, l, r);

            // Divide the array
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
        }
        return arr;
    }

    public static int partition(int[] arr, int l, int r) {
        int i = l;
        // Choose last element as pivot element
        int pivot = arr[r];

        for (int j = l; j < r; ++j) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    //iterative merge sort no recursion
    public static void mergeSort(int[] arr, int l, int r) {
        int n = arr.length;
        int curr_size; // For current size of subarrays to be merged curr_size varies from 1 to n/2
        int left_start; // For picking starting index of left subarray to be merged

        // Merge subarrays in bottom up manner. First merge subarrays of size 1 to create sorted subarrays of size 2, then merge subarrays of size 2 to create sorted subarrays of size 4, and so on.
        for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {
            // Pick starting point of different subarrays of current size
            for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {
                // Find ending point of left subarray. mid+1 is starting point of right
                int mid = Math.min(left_start + curr_size - 1, n - 1);
                int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

                // Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
                merge(arr, left_start, mid, right_end);
            }
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    //bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    //selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    //heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    //heapify
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }


    //print array
    public static void printArray(String msg, int[] arr) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}