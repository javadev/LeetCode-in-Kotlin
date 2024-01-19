package g2901_3000.s2967_minimum_cost_to_make_array_equalindromic

// #Medium #Array #Math #Sorting #Greedy #2024_01_19_Time_363_ms_(100.00%)_Space_56_MB_(86.49%)

import kotlin.math.abs
import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumCost(nums: IntArray): Long {
        nums.sort()
        val len = nums.size
        val m = if (len % 2 != 0) len / 2 else len / 2 - 1
        val previousPalindrome = getPreviousPalindrome(nums[m])
        val nextPalindrome = getNextPalindrome(nums[m])
        var ans1: Long = 0
        var ans2: Long = 0
        for (num in nums) {
            ans1 += abs((previousPalindrome - num))
            ans2 += abs((nextPalindrome - num))
        }
        return min(ans1.toDouble(), ans2.toDouble()).toLong()
    }

    private fun getPreviousPalindrome(num: Int): Int {
        var previousPalindrome = num
        while (!isPalindrome(previousPalindrome)) {
            previousPalindrome--
        }
        return previousPalindrome
    }

    private fun getNextPalindrome(num: Int): Int {
        var nextPalindrome = num
        while (!isPalindrome(nextPalindrome)) {
            nextPalindrome++
        }
        return nextPalindrome
    }

    private fun isPalindrome(num: Int): Boolean {
        var num = num
        val copyNum = num
        var reverseNum = 0
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10
            num /= 10
        }
        return copyNum == reverseNum
    }
}
