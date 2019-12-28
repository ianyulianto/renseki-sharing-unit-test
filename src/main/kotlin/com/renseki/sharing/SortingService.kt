package com.renseki.sharing

/**
 * Sorting Service
 *
 * @since 2019-12-28
 * @author Ian Yulianto
 */
class SortingService {

    private fun swap(arr: Array<Long>, i: Int, j: Int) : Array<Long>{
        val tmp : Long = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    fun bubbleSort(arr: Array<Long>): Array<Long> {
        var swappedElements : Boolean;
        do {
            swappedElements = false;
            for (i in 0..arr.size - 2){
                if (arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                    swappedElements = true;
                }
            }
        } while (swappedElements);
        return arr;
    }
}