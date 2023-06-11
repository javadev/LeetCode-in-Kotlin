package g1501_1600.s1525_number_of_good_ways_to_split_a_string

// #Medium #String #Dynamic_Programming #Bit_Manipulation
class Solution {
    fun numSplits(s: String): Int {
        val hs = HashSet<Char>()
        val dp1 = IntArray(s.length - 1)
        val dp2 = IntArray(s.length - 1)
        for (i in 0 until s.length - 1) {
            val ch = s[i]
            hs.add(ch)
            dp1[i] = hs.size
        }
        val hm = HashSet<Char>()
        for (i in s.length - 1 downTo 1) {
            val ch = s[i]
            hm.add(ch)
            dp2[i - 1] = hm.size
        }
        var count = 0
        for (i in 0 until s.length - 1) {
            if (dp1[i] == dp2[i]) {
                count++
            }
        }
        return count
    }
}
