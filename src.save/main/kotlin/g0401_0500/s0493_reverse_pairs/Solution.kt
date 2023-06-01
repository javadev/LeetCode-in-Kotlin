package g0401_0500.s0493_reverse_pairs

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2023_01_04_Time_887_ms_(66.67%)_Space_73.9_MB_(66.67%)

class Solution {
    fun reversePairs(nums: IntArray): Int {
        return mergeSort(nums, 0, nums.size - 1)
    }

    private fun mergeSort(nums: IntArray, start: Int, end: Int): Int {
        if (start >= end) {
            return 0
        }
        val mid = start + (end - start) / 2
        var cnt = mergeSort(nums, start, mid) + mergeSort(nums, mid + 1, end)
        var j = mid + 1
        for (i in start..mid) {
            // it has to be 2.0 instead of 2, otherwise it's going to stack overflow, i.e. test3 is
            // going to fail
            while (j <= end && nums[i] > nums[j] * 2.0) {
                j++
            }
            cnt += j - (mid + 1)
        }
        nums.sort(start, end + 1)
        return cnt
    }
}
