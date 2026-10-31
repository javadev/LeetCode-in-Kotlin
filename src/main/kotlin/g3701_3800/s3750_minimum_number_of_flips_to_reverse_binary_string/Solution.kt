package g3701_3800.s3750_minimum_number_of_flips_to_reverse_binary_string

// #Easy #String #Math #Two_Pointers #Bit_Manipulation #Mid_Level #Biweekly_Contest_170
// #2026_04_26_Time_1_ms_(100.00%)_Space_42.88_MB_(49.74%)

class Solution {
    fun minimumFlips(n: Int): Int {
        var ans = 0
        var temp = n
        var l = 0
        var r = -1
        while (temp > 0) {
            temp = temp shr 1
            r++
        }
        while (l < r) {
            ans += ((n shr l) and 1) xor ((n shr r) and 1)
            l++
            r--
        }
        return 2 * ans
    }
}
