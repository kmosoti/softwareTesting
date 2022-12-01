//import assert library
import org.junit.Assert;
//import test library
import org.junit.Test;

import java.util.Arrays;

public class SortingAlgorithmsTests {
    //This class is used to to test the sorting algorithms using vscode junit tests and the vscode debugger
    //The test methods are named test<numberID> and are annotated with @Test
    //The test methods are called by the vscode debugger
    //The test methods are called in the order they are defined in the class

    //This class contains 4 different mutations for each of the 5 sorting algorithms of SortingAlgorithms.java
    //The types of mutations are:
    //1. Relational Operator Replacement (ROR)
    //2. Statement Deletion (SDL)
    //3. Constant Replacement (CRP)
    //4. Arithmetic Operator Replacement (AOR)

    /*************Bubble Sort Algorithm*************/
    /*
    Test 1: Relational Operator Replacement (ROR)
    Description: Replace the relational operator < with > in the first for loop
    Expected Output: The array should be sorted in descending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the bubble sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test1() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the relational operator from > to < to test the ROR mutation
        int n = arr.length;
        for (int i = 0; i > n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 2: Statement Deletion (SDL)
    Description: Delete the if statement in the second for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the bubble sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test2() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //delete the for loop to test the SDL mutation
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                // if (arr[j] > arr[j + 1]) {
                //     // swap arr[j+1] and arr[i]
                //     int temp = arr[j];
                //     arr[j] = arr[j + 1];
                //     arr[j + 1] = temp;
                // }
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 3: Constant Replacement (CRP)
    Description: Replace the constant 1 with 2 in the first for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the bubble sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test3() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the constant 1 to 2 to test the CRP mutation
        int n = arr.length;
        for (int i = 0; i < n - 2; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 4: Arithmetic Operator Replacement (AOR)
    Description: Replace the arithmetic operator + with - in the second for loop if statement on line 189
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the bubble sort algorithm
    Infection: The program enters an error state when the for loops tries to access an index that is out of bounds
    Propagation statement: The program crashes when the for loops tries to access an index that is out of bounds
    */
    @Test
    public void test4() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the arithmetic operator + to - to test the AOR mutation
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j - 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        Assert.assertArrayEquals(expected, arr);
    }

    /*************Selection Sort Algorithm*************/
    /*
    Test 5: Relational Operator Replacement (ROR)
    Description: Replace the relational operator < with > in the first for loop
    Expected Output: The array should be sorted in descending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the selection sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test5() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the relational operator from > to < to test the ROR mutation
        int n = arr.length;
        for (int i = 0; i > n - 1; i++) {
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
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 6: Statement Deletion (SDL)
    Description: Delete the if statement in the second for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the selection sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test6() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //delete the if statement to test the SDL mutation
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                // if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        Assert.assertArrayEquals(expected, arr);
    }
    
    /*
    Test 7: Constant Replacement (CRP)
    Description: Replace the constant 1 with 2 in the first for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the selection sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test7() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the constant 1 to 2 to test the CRP mutation
        int n = arr.length;
        for (int i = 0; i < 2; i++) {
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
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 8: Statement Replacement (STR)
    Description: Replace the arithmetic operator + with - in the second for loop if statement 
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the selection sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test8() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the arithmetic operator + to - to test the AOR mutation
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                //change conditionnn statement to test the STR mutation
                if (arr[j] - arr[min_idx] > 0)
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        Assert.assertArrayEquals(expected, arr);
    }

    /*************Insertion Sort Algorithm*************/
    /*
    Test 9: Relational Operator Replacement (ROR)
    Description: Replace the relational operator < with > in the first for loop
    Expected Output: The array should be sorted in descending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the insertion sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test9() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the relational operator from > to < to test the ROR mutation
        int n = arr.length;

        for (int i = 1; i > n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 10: Statement Deletion (SDL)
    Description: Delete the while statement in the second for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the insertion sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test10() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //delete the if statement to test the SDL mutation
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            // while (j >= 0 && arr[j] > key) {
            //     arr[j + 1] = arr[j];
            //     j = j - 1;
            // }
            arr[j + 1] = key;
        }
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 11: Constant Replacement (CRP)
    Description: Replace the constant 1 with 2 in the first for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the insertion sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test11() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the constant 1 to 2 to test the CRP mutation
        int n = arr.length;
        for (int i = 5; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        //print 
        System.out.println("\nTest 11: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 12: Statement Replacement (STR)
    Description: Replace the arithmetic operator + with - in the second for loop if statement on line 189
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the insertion sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test12() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the arithmetic operator + to - to test the AOR mutation
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        Assert.assertArrayEquals(expected, arr);
        System.out.println("\nTest 12: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
    }
    
    /*************Merge Sort Algorithm*************/
    //These tests only tests the mergeSort method
    /*
    Test 13: Relational Operator Replacement (ROR)
    Description: Replace the relational operator <= with >= in the first for loop
    Expected Output: The array should be sorted in descending order
    Reachability: The for loop is reachable when the array is not sorted and the user chooses the merge sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order    
    Propagation statement: The program displays an incorrectly sorted array
    */
    @Test
    public void test13() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the relational operator from > to < to test the ROR mutation
        int n = arr.length;
        int curr_size; // For current size of subarrays to be merged curr_size varies from 1 to n/2
        int left_start; // For picking starting index of left subarray to be merged

        // Merge subarrays in bottom up manner. First merge subarrays of size 1 to create sorted subarrays of size 2, then merge subarrays of size 2 to create sorted subarrays of size 4, and so on.
        for (curr_size = 1; curr_size >= n - 1; curr_size = 2 * curr_size) {
            // Pick starting point of different subarrays of current size
            for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {
                // Find ending point of left subarray. mid+1 is starting point of right
                int mid = Math.min(left_start + curr_size - 1, n - 1);
                int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

                // Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
                SortingAlgorithms.merge(arr, left_start, mid, right_end);
            }
        }
        System.out.println("\nTest 13: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 14: Statement Deletion (SDL)
    Description: Delete the merge method call in the second for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the merge sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test14() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //delete the if statement to test the SDL mutation
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
                //SortingAlgorithms.merge(arr, left_start, mid, right_end);
            }
        }
        System.out.println("\nTest 14: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 15: Relational Operator Replacement (ROR)
    Description: Replace the arithmetic operator + with - in the second for loop if statement
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the merge sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test15() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the arithmetic operator + to - to test the AOR mutation
        int n = arr.length;
        int curr_size; // For current size of subarrays to be merged curr_size varies from 1 to n/2
        int left_start; // For picking starting index of left subarray to be merged

        // Merge subarrays in bottom up manner. First merge subarrays of size 1 to create sorted subarrays of size 2, then merge subarrays of size 2 to create sorted subarrays of size 4, and so on.
        for (curr_size = 1; curr_size <= n + 1; curr_size = 2 * curr_size) {
            // Pick starting point of different subarrays of current size
            for (left_start = 0; left_start > n - 1; left_start += 2 * curr_size) {
                // Find ending point of left subarray. mid+1 is starting point of right
                int mid = Math.min(left_start + curr_size - 1, n - 1);
                int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

                // Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
                SortingAlgorithms.merge(arr, left_start, mid, right_end);
            }
        }
        System.out.println("\nTest 15: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 16: Constant Replacement (COR)
    Description: Replace the constant 2 with 3 in the second for loop if statement
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the merge sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program enters an error state when the array is not sorted in ascending order
    */
    @Test
    public void test16() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the constant 2 to 3 to test the COR mutation
        int n = -1;
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
                SortingAlgorithms.merge(arr, left_start, mid, right_end);
            }
        }
        System.out.println("\nTest 16: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*******************************************************************************************************************
     * Test 17-20: Testing the Heap Sort Algorithm
     ******************************************************************************************************************/
    
    /*
    Test 17: Relational Operator Replacement (ROR)
    Description: Replace the relational operator >= with > in the second for loop if statement
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the heap sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The programs returns the an unsorted array
    */
    @Test
    public void test17() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the relational operator < to > to test the ROR mutation
        int n = arr.length;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            SortingAlgorithms.heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i < 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            SortingAlgorithms.heapify(arr, i, 0);
        }
        System.out.println("\nTest 17: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 18: Statement Deletion (SDL)
    Description: Skip the build heap for loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The function will reach this fault and continue to execute the rest of the program
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program returns an unsorted array
    */
    @Test
    public void test18() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //delete the build heap for loop to test the SDL mutation
        int n = arr.length;
        // Build heap (rearrange array)
        //for (int i = n / 2 - 1; i >= 0; i--)
            //SortingAlgorithms.heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i <= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            SortingAlgorithms.heapify(arr, i, 0);
        }
        System.out.println("\nTest 18: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 19: Relational Operator Replacement (ROR)
    X Description: Replace the constant 1 with 2 in the second for loop if statement
    Expected Output: The array should be sorted in ascending order
    Reachability: The if statement is reachable when the array is not sorted and the user chooses the heap sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program returns an unsorted array
    */
    @Test
    public void test19() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the constant 1 to 2 to test the CRP mutation
        int n = arr.length;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i < 0; i--)
            SortingAlgorithms.heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i <= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            SortingAlgorithms.heapify(arr, i, 0);
        }
        System.out.println("\nTest 19: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

    /*
    Test 20: Statement Replacement (STR)
    Description: Replace the second for loop with a while loop
    Expected Output: The array should be sorted in ascending order
    Reachability: The while loop is reachable when the array is not sorted and the user chooses the heap sort algorithm
    Infection: The program enters an error state when the array is not sorted in ascending order
    Propagation statement: The program returns an unsorted array
    */
    @Test
    public void test20() {
        int[] arr = { 1, 99, 55, 8, 12, -1  };
        int[] expected = { -1, 1, 8, 12, 55, 99 };
        //change the second for loop to a while loop to test the STR mutation
        int n = arr.length;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            SortingAlgorithms.heapify(arr, n, i);

        // One by one extract an element from heap
        //for (int i = n - 1; i <= 0; i--) {
        int i = n - 1;
        while (i <= 0) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            SortingAlgorithms.heapify(arr, i, 0);
            i--;
        }
        System.out.println("\nTest 20: " + Arrays.toString(arr));
        System.out.println("-> Expected: " + Arrays.toString(expected));
        System.out.println("-> Actual: " + Arrays.toString(arr));
        Assert.assertArrayEquals(expected, arr);
    }

}
