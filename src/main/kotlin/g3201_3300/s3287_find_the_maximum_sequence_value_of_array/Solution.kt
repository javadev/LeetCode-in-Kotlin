package g3201_3300.s3287_find_the_maximum_sequence_value_of_array

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
// #2024_09_17_Time_2893_ms_(33.33%)_Space_290.4_MB_(33.33%)

import kotlin.math.max

class Solution {
    fun maxValue(nums: IntArray, k: Int): Int {
        val n = nums.size
        val left: Array<Array<MutableSet<Int>>> =
            Array<Array<MutableSet<Int>>>(n) { Array<MutableSet<Int>>(k + 1) { mutableSetOf() } }
        val right: Array<Array<MutableSet<Int>>> =
            Array<Array<MutableSet<Int>>>(n) { Array<MutableSet<Int>>(k + 1) { mutableSetOf() } }
        left[0][0].add(0)
        left[0][1].add(nums[0])
        for (i in 1 until n - k) {
            left[i][0].add(0)
            for (j in 1..k) {
                left[i][j].addAll(left[i - 1][j])
                for (v in left[i - 1][j - 1]) {
                    left[i][j].add(v or nums[i])
                }
            }
        }
        right[n - 1][0].add(0)
        right[n - 1][1].add(nums[n - 1])
        var result = 0
        if (k == 1) {
            for (l in left[n - 2][k]) {
                result = max(result, (l xor nums[n - 1]))
            }
        }
        for (i in n - 2 downTo k) {
            right[i][0].add(0)
            for (j in 1..k) {
                right[i][j].addAll(right[i + 1][j])
                for (v in right[i + 1][j - 1]) {
                    right[i][j].add(v or nums[i])
                }
            }
            for (l in left[i - 1][k]) {
                for (r in right[i][k]) {
                    result = max(result, (l xor r))
                }
            }
        }
        return result
    }
}
