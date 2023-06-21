package g1901_2000.s1979_find_greatest_common_divisor_of_array

// #Easy #Array #Math #Number_Theory #2023_06_21_Time_172_ms_(100.00%)_Space_35.9_MB_(87.50%)

class Solution {
    fun findGCD(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        for (num in nums) {
            if (max < num) {
                max = num
            }
            if (min > num) {
                min = num
            }
        }
        return findGCD(max, min)
    }

    private fun findGCD(x: Int, y: Int): Int {
        var r: Int
        var a: Int
        var b: Int
        a = if (x > y) x else y
        b = if (x < y) x else y
        r = b
        while (a % b != 0) {
            r = a % b
            a = b
            b = r
        }
        return r
    }
}
