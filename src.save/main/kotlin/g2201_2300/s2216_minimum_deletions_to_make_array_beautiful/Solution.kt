package g2201_2300.s2216_minimum_deletions_to_make_array_beautiful

// #Medium #Array #Greedy #Stack #2023_06_27_Time_567_ms_(66.67%)_Space_55.4_MB_(100.00%)

class Solution {
    fun minDeletion(nums: IntArray): Int {
        var offset = 0
        var res = 0
        var i = 0
        while (i < nums.size) {
            var j = i
            while (j < nums.size - 1 && nums[j + 1] == nums[j] && (j - offset) % 2 == 0) {
                offset++
                res++
                j++
            }
            i = j + 2
        }
        if ((nums.size - offset) % 2 != 0) {
            res++
        }
        return res
    }
}
