package g4001_4100.s4013_count_subarrays_with_even_odd_ratio_ii

// #Hard #Array #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree #Merge_Sort
// #Senior_Staff #Weekly_Contest_513 #2026_11_17_Time_14_ms_(98.28%)_Space_58.65_MB_(65.52%)

class Solution {
    fun countRatioSubarrays(nums: IntArray, a: Int, b: Int): Long {
        val n = nums.size
        val arr = LongArray(n + 1)
        val temp = LongArray(n + 1)
        var sum: Long = 0
        for (i in 0..<n) {
            sum += (if (nums[i] % 2 == 1) a else -b).toLong()
            temp[i + 1] = sum
            arr[i + 1] = temp[i + 1]
        }
        return mergeSort(0, n, arr, temp)
    }

    private fun mergeSort(l: Int, r: Int, arr: LongArray, temp: LongArray): Long {
        if (l == r) {
            return 0
        }
        val m = (l + r) / 2
        var result = mergeSort(l, m, temp, arr) + mergeSort(m + 1, r, temp, arr)
        var idx = l
        var i = l
        var j = m + 1
        while (i <= m && j <= r) {
            if (temp[i] <= temp[j]) {
                arr[idx++] = temp[i++]
            } else {
                result += (i - l).toLong()
                arr[idx++] = temp[j++]
            }
        }
        while (i <= m) {
            arr[idx++] = temp[i++]
        }
        while (j <= r) {
            result += (i - l).toLong()
            arr[idx++] = temp[j++]
        }
        return result
    }
}
