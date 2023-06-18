package g1701_1800.s1755_closest_subsequence_sum

// #Hard #Array #Dynamic_Programming #Two_Pointers #Bit_Manipulation #Bitmask
// #2023_06_18_Time_620_ms_(100.00%)_Space_43.5_MB_(100.00%)

class Solution {
    private var idx = 0
    private var sum = 0
    fun minAbsDifference(nums: IntArray, goal: Int): Int {
        val n = nums.size
        val nFirst = Math.pow(2.0, n.toDouble() / 2).toInt()
        val nSecond = Math.pow(2.0, (n - n / 2).toDouble()).toInt()
        val first = IntArray(nFirst)
        val second = IntArray(nSecond)
        helper(nums, first, 0, n / 2 - 1)
        sum = 0
        idx = sum
        helper(nums, second, n / 2, n - 1)
        first.sort()
        second.sort()
        var low = 0
        var high = nSecond - 1
        var ans = Int.MAX_VALUE
        while (low < nFirst && high >= 0) {
            val localSum = first[low] + second[high]
            ans = Math.min(ans, Math.abs(localSum - goal))
            if (ans == 0) {
                break
            }
            if (localSum < goal) {
                low++
            } else {
                high--
            }
        }
        return ans
    }

    private fun helper(nums: IntArray, arr: IntArray, start: Int, end: Int) {
        for (i in start..end) {
            sum += nums[i]
            arr[idx++] = sum
            helper(nums, arr, i + 1, end)
            sum -= nums[i]
        }
    }
}
