package g1301_1400.s1365_how_many_numbers_are_smaller_than_the_current_number

// #Easy #Array #Hash_Table #Sorting #Counting
// #2023_06_06_Time_193_ms_(93.33%)_Space_37.1_MB_(80.00%)

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        val temp = IntArray(101)
        for (num in nums) {
            temp[num]++
        }
        for (i in 1..100) {
            temp[i] += temp[i - 1]
        }
        for (i in ans.indices) {
            if (nums[i] == 0) {
                ans[i] = 0
            } else {
                ans[i] = temp[nums[i] - 1]
            }
        }
        return ans
    }
}
