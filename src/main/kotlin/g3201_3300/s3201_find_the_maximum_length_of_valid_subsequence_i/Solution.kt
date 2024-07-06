package g3201_3300.s3201_find_the_maximum_length_of_valid_subsequence_i

// #Medium #Array #Dynamic_Programming #2024_07_06_Time_512_ms_(89.36%)_Space_62.1_MB_(76.60%)

import kotlin.math.max

class Solution {
    fun maximumLength(nums: IntArray): Int {
        val n = nums.size
        var alter = 1
        var odd = 0
        var even = 0
        if (nums[0] % 2 == 0) {
            even++
        } else {
            odd++
        }
        var lastodd = nums[0] % 2 != 0
        for (i in 1 until n) {
            val flag = nums[i] % 2 == 0
            if (flag) {
                if (lastodd) {
                    alter++
                    lastodd = false
                }
                even++
            } else {
                if (!lastodd) {
                    alter++
                    lastodd = true
                }
                odd++
            }
        }
        return max(alter, max(odd, even))
    }
}
