package g2801_2900.s2856_minimum_array_length_after_pair_removals

// #Medium #Array #Hash_Table #Greedy #Binary_Search #Two_Pointers #Counting
// #2023_12_18_Time_647_ms_(100.00%)_Space_61.8_MB_(100.00%)

class Solution {
    fun minLengthAfterRemovals(nums: List<Int>): Int {
        val n = nums.size
        var i = 0
        var j = if (n % 2 == 0) {
            n / 2
        } else {
            n / 2 + 1
        }
        var count = 0
        while (i < n / 2 && j < n) {
            if (nums[i] < nums[j]) {
                count += 2
            }
            i++
            j++
        }
        return n - count
    }
}
