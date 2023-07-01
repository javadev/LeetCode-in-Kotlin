package g2301_2400.s2341_maximum_number_of_pairs_in_array

// #Easy #Array #Hash_Table #Sorting #2023_07_01_Time_160_ms_(100.00%)_Space_36.9_MB_(36.36%)

class Solution {
    fun numberOfPairs(nums: IntArray): IntArray {
        nums.sort()
        var pairs = 0
        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                nums[i] = -1
                nums[i - 1] = -1
                pairs++
            }
        }
        return intArrayOf(pairs, nums.size - 2 * pairs)
    }
}
