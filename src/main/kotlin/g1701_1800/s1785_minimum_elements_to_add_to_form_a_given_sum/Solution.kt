package g1701_1800.s1785_minimum_elements_to_add_to_form_a_given_sum

// #Medium #Array #Greedy #2023_06_18_Time_595_ms_(100.00%)_Space_58_MB_(100.00%)

class Solution {
    fun minElements(nums: IntArray, limit: Int, goal: Int): Int {
        var sum: Long = 0
        for (num in nums) {
            sum += num.toLong()
        }
        val diff = Math.abs(goal - sum)
        return if (diff % limit == 0L) (diff / limit).toInt() else (diff / limit + 1).toInt()
    }
}
