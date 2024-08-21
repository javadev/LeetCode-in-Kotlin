package g3201_3300.s3258_count_substrings_that_satisfy_k_constraint_i

// #Easy #String #Sliding_Window #2024_08_21_Time_155_ms_(92.86%)_Space_34.7_MB_(85.71%)

class Solution {
    fun countKConstraintSubstrings(s: String, k: Int): Int {
        val n = s.length
        var sum = n
        var i = 0
        var j = 0
        var one = 0
        var zero = 0
        var ch: Char
        while (j < n) {
            ch = s[j++]
            if (ch == '0') {
                zero++
            } else {
                one++
            }
            while (i <= j && one > k && zero > k) {
                ch = s[i++]
                if (ch == '0') {
                    zero--
                } else {
                    one--
                }
            }
            val len = (zero + one - 1)
            sum += len
        }
        return sum
    }
}
