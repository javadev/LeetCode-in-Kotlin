package g3601_3700.s3684_maximize_sum_of_at_most_k_distinct_elements

// #Easy #Array #Hash_Table #Sorting #Greedy #Weekly_Contest_467
// #2025_09_20_Time_12_ms_(92.59%)_Space_50.11_MB_(90.74%)

class Solution {
    fun maxKDistinct(nums: IntArray, k: Int): IntArray {
        nums.sort()
        val arr = IntArray(k)
        var j = 1
        arr[0] = nums[nums.size - 1]
        if (nums.size > 1) {
            var i = nums.size - 2
            while (j < k && i >= 0) {
                if (i < nums.size - 1 && nums[i] != nums[i + 1]) {
                    arr[j] = nums[i]
                    j++
                }
                i--
            }
        }
        var cnt = 0
        var n = 0
        while (n < arr.size) {
            if (arr[n] != 0) {
                cnt++
            }
            n++
        }
        val finl = IntArray(cnt)
        System.arraycopy(arr, 0, finl, 0, cnt)
        return finl
    }
}
