package g0501_0600.s0567_permutation_in_string

// #Medium #String #Hash_Table #Two_Pointers #Sliding_Window #Algorithm_I_Day_6_Sliding_Window
// #2023_01_23_Time_169_ms_(100.00%)_Space_35.6_MB_(85.86%)

class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val n = s1.length
        val m = s2.length
        if (n > m) {
            return false
        }
        val cntS1 = IntArray(26)
        val cntS2 = IntArray(26)
        for (i in 0 until n) {
            cntS1[s1[i].code - 'a'.code]++
        }
        for (i in 0 until n) {
            cntS2[s2[i].code - 'a'.code]++
        }
        if (check(cntS1, cntS2)) {
            return true
        }
        for (i in n until m) {
            cntS2[s2[i - n].code - 'a'.code]--
            cntS2[s2[i].code - 'a'.code]++
            if (check(cntS1, cntS2)) {
                return true
            }
        }
        return false
    }

    private fun check(cnt1: IntArray, cnt2: IntArray): Boolean {
        for (i in 0..25) {
            if (cnt1[i] != cnt2[i]) {
                return false
            }
        }
        return true
    }
}
