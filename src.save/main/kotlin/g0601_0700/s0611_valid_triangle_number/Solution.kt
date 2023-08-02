package g0601_0700.s0611_valid_triangle_number

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers #Binary_Search_II_Day_1
// #2023_02_06_Time_203_ms_(100.00%)_Space_35.5_MB_(100.00%)

class Solution {
    fun triangleNumber(nums: IntArray): Int {
        val n: Int
        var max = 0
        val count = IntArray(1001)
        for (i in nums) {
            count[i]++
            max = Math.max(max, i)
        }
        count[0] = 0
        var idx = 0
        for (i in 1..max) {
            var j = 0
            while (j < count[i]) {
                nums[idx] = i
                ++j
                ++idx
            }
            count[i] += count[i - 1]
        }
        n = idx
        var r = 0
        for (i in 0 until n - 2) {
            for (j in i + 1 until n - 1) {
                if (nums[i] + nums[j] > max) {
                    r += (n - j) * (n - j - 1) / 2
                    break
                }
                r += count[nums[i] + nums[j] - 1] - j - 1
            }
        }
        return r
    }
}
