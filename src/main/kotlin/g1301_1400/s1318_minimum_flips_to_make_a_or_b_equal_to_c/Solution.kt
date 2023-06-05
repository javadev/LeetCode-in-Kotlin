package g1301_1400.s1318_minimum_flips_to_make_a_or_b_equal_to_c

// #Medium #Bit_Manipulation
class Solution {
    fun minFlips(a: Int, b: Int, c: Int): Int {
        var ans = 0
        val or = a or b
        ans += csb(or xor c)
        val and = a and b
        ans += csb(and and c.inv())
        return ans
    }

    companion object {
        fun csb(n: Int): Int {
            var n = n
            var cnt = 0
            while (n > 0) {
                val rsb = n and -n
                n -= rsb
                cnt++
            }
            return cnt
        }
    }
}
