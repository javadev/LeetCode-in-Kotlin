package g2601_2700.s2670_find_the_distinct_difference_array

// #Easy #Array #Hash_Table #2023_07_26_Time_320_ms_(94.74%)_Space_47.3_MB_(15.79%)

class Solution {
    fun distinctDifferenceArray(nums: IntArray): IntArray {
        val n = nums.size
        val prefixSet = HashSet<Int>()
        val suffixSet = HashSet<Int>()
        val preList = IntArray(n)
        val sufList = IntArray(n)
        val ans = IntArray(n)

        for (i in 0..nums.lastIndex) {
            prefixSet.add(nums[i])
            suffixSet.add(nums[n - 1 - i])
            preList[i] = prefixSet.size
            sufList[n - 1 - i] = suffixSet.size
        }

        for (i in 0..nums.lastIndex) {
            if (i == nums.lastIndex) {
                ans[i] = preList[i]
            } else {
                ans[i] = preList[i] - sufList[i + 1]
            }
        }
        return ans
    }
}
