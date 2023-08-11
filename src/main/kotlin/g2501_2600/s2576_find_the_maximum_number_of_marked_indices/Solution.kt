package g2501_2600.s2576_find_the_maximum_number_of_marked_indices

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers
// #2023_07_10_Time_610_ms_(100.00%)_Space_64.4_MB_(50.00%)

class Solution {
    fun maxNumOfMarkedIndices(nums: IntArray): Int {
        nums.sort()
        var count = 0
        var i = 0
        var j = nums.size / 2

        while (j < nums.size && i < nums.size / 2) {
            if (nums[i] * 2 <= nums[j]) {
                count += 2
                i++
                j++
            } else {
                j++
            }
        }

        return count
    }
}
