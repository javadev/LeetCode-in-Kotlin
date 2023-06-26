package g2201_2300.s2223_sum_of_scores_of_built_strings

// #Hard #String #Binary_Search #Hash_Function #String_Matching #Rolling_Hash #Suffix_Array
class Solution {
    fun sumScores(s: String): Long {
        val n = s.length
        val ss = s.toCharArray()
        val z = IntArray(n)
        var l = 0
        var r = 0
        for (i in 1 until n) {
            if (i <= r) {
                z[i] = Math.min(z[i - l], r - i + 1)
            }
            while (i + z[i] < n && ss[z[i]] == ss[i + z[i]]) {
                z[i]++
            }
            if (i + z[i] - 1 > r) {
                l = i
                r = i + z[i] - 1
            }
        }
        var sum = n.toLong()
        for (i in 0 until n) {
            sum += z[i].toLong()
        }
        return sum
    }
}
