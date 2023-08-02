package g1401_1500.s1477_find_two_non_overlapping_sub_arrays_each_with_target_sum

// #Medium #Array #Hash_Table #Dynamic_Programming #Binary_Search #Sliding_Window
// #2023_06_13_Time_746_ms_(100.00%)_Space_50.7_MB_(100.00%)

class Solution {
    fun minSumOfLengths(arr: IntArray, target: Int): Int {
        var l = 0
        var r = 0
        var sum = 0
        val idx = IntArray(arr.size)
        idx.fill(arr.size + 1)
        var ans = 2 * arr.size + 1
        while (r < arr.size || sum >= target) {
            if (sum < target) {
                sum += arr[r]
                r++
            } else if (sum > target) {
                sum -= arr[l]
                l++
            } else {
                val length = r - l
                idx[r - 1] = length
                if (l > 0 && idx[l - 1] < arr.size + 1) {
                    ans = Math.min(ans, length + idx[l - 1])
                }
                sum -= arr[l]
                l++
            }
            if (r > 1) {
                idx[r - 1] = Math.min(idx[r - 1], idx[r - 2])
            }
        }
        return if (ans <= 2 * arr.size) ans else -1
    }
}
