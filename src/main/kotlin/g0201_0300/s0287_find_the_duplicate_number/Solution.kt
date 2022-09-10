package g0201_0300.s0287_find_the_duplicate_number

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Two_Pointers
// #Bit_Manipulation #Binary_Search_II_Day_5
// #2022_09_10_Time_656_ms_(66.21%)_Space_78.6_MB_(66.89%)

class Solution {
    fun findDuplicate(nums: IntArray): Int {
        val arr = IntArray(nums.size + 1)
        for (num in nums) {
            arr[num] += 1
            if (arr[num] == 2) {
                return num
            }
        }
        return 0
    }
}
