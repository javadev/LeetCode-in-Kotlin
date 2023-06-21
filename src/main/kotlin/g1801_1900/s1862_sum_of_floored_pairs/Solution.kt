package g1801_1900.s1862_sum_of_floored_pairs

// #Hard #Array #Math #Binary_Search #Prefix_Sum
class Solution {
    fun sumOfFlooredPairs(nums: IntArray): Int {
        val mod: Long = 1000000007
        nums.sort()
        val max = nums[nums.size - 1]
        val counts = IntArray(max + 1)
        val qnts = LongArray(max + 1)
        for (k in nums) {
            counts[k]++
        }
        for (i in 1 until max + 1) {
            if (counts[i] == 0) {
                continue
            }
            var j = i
            while (j <= max) {
                qnts[j] += counts[i].toLong()
                j = j + i
            }
        }
        for (i in 1 until max + 1) {
            qnts[i] = (qnts[i] + qnts[i - 1]) % mod
        }
        var sum: Long = 0
        for (k in nums) {
            sum = (sum + qnts[k]) % mod
        }
        return sum.toInt()
    }
}
