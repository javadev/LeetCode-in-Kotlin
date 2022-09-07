package g0101_0200.s0169_majority_element

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Sorting #Counting
// #Divide_and_Conquer #Data_Structure_II_Day_1_Array #Udemy_Famous_Algorithm
// #2022_09_07_Time_242_ms_(97.80%)_Space_42.4_MB_(95.06%)

class Solution {
    /**
     * Moore Voting Algorithm
     * How to understand this:
     * 1. For a number to qualify as a majority element, it needs to occur more than 1/2 times, which
     * means there are a max of only one such element in any given array.
     * 2. E.g. given this array [1,2,3,1,1,1], two of the 1s will be balanced off by 2 and 3, still there are two 1s remaining in the end
     * which is the majority element
     */
    fun majorityElement(nums: IntArray): Int {
        var count = 1
        var majority = nums[0]
        for (i in 1 until nums.size) {
            if (count == 0) {
                count++
                majority = nums[i]
            } else if (nums[i] == majority) {
                count++
            } else {
                count--
            }
        }
        return majority
    }
}
