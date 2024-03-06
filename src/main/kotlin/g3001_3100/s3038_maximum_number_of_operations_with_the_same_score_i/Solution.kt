package g3001_3100.s3038_maximum_number_of_operations_with_the_same_score_i

// #Easy #Array #Simulation #2024_03_06_Time_142_ms_(100.00%)_Space_34.9_MB_(57.78%)

class Solution {
    fun maxOperations(nums: IntArray): Int {
        var c = 1
        var i = 2
        val s = nums[0] + nums[1]
        val l = nums.size - (if (nums.size % 2 == 0) 0 else 1)
        while (i < l) {
            if (nums[i] + nums[i + 1] == s) {
                c++
            } else {
                break
            }
            i += 2
        }
        return c
    }
}
