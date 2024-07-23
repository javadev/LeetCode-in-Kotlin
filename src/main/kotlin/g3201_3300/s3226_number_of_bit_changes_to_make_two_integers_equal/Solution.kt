package g3201_3300.s3226_number_of_bit_changes_to_make_two_integers_equal

// #Easy #Bit_Manipulation #2024_07_23_Time_136_ms_(61.90%)_Space_33.2_MB_(90.48%)

class Solution {
    fun minChanges(n: Int, k: Int): Int {
        var n = n
        var k = k
        if ((n or k) != n) {
            return -1
        }
        var cnt = 0
        while (n > 0 || k > 0) {
            val bitN = n and 1
            val bitK = k and 1
            if (bitN == 1 && bitK == 0) {
                cnt++
            }
            n = n shr 1
            k = k shr 1
        }
        return cnt
    }
}
