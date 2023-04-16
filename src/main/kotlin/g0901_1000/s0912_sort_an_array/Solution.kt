package g0901_1000.s0912_sort_an_array

// #Medium #Array #Sorting #Heap_Priority_Queue #Divide_and_Conquer #Merge_Sort #Bucket_Sort
// #Counting_Sort #Radix_Sort #Udemy_Sorting_Algorithms
// #2023_04_16_Time_606_ms_(98.48%)_Space_47.6_MB_(57.11%)

class Solution {
    fun sortArray(nums: IntArray): IntArray {
        return mergeSort(nums, 0, nums.size - 1)
    }

    private fun mergeSort(arr: IntArray, lo: Int, hi: Int): IntArray {
        if (lo == hi) {
            val sortedArr = IntArray(1)
            sortedArr[0] = arr[lo]
            return sortedArr
        }
        val mid = (lo + hi) / 2
        val leftArray = mergeSort(arr, lo, mid)
        val rightArray = mergeSort(arr, mid + 1, hi)
        return mergeSortedArray(leftArray, rightArray)
    }

    private fun mergeSortedArray(a: IntArray, b: IntArray): IntArray {
        val ans = IntArray(a.size + b.size)
        var i = 0
        var j = 0
        var k = 0
        while (i < a.size && j < b.size) {
            if (a[i] < b[j]) {
                ans[k++] = a[i++]
            } else {
                ans[k++] = b[j++]
            }
        }
        while (i < a.size) {
            ans[k++] = a[i++]
        }
        while (j < b.size) {
            ans[k++] = b[j++]
        }
        return ans
    }
}
