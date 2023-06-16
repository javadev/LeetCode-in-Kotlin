package g1701_1800.s1754_largest_merge_of_two_strings

// #Medium #String #Greedy #Two_Pointers
@Suppress("NAME_SHADOWING")
class Solution {
    fun largestMerge(word1: String, word2: String): String {
        val a = word1.toCharArray()
        val b = word2.toCharArray()
        val sb = StringBuilder()
        var i = 0
        var j = 0
        while (i < a.size && j < b.size) {
            if (a[i] == b[j]) {
                val first = go(a, i, b, j)
                if (first) {
                    sb.append(a[i])
                    i++
                } else {
                    sb.append(b[j])
                    j++
                }
            } else {
                if (a[i] > b[j]) {
                    sb.append(a[i])
                    i++
                } else {
                    sb.append(b[j])
                    j++
                }
            }
        }
        while (i < a.size) {
            sb.append(a[i++])
        }
        while (j < b.size) {
            sb.append(b[j++])
        }
        return sb.toString()
    }

    private fun go(a: CharArray, i: Int, b: CharArray, j: Int): Boolean {
        var i = i
        var j = j
        while (i < a.size && j < b.size && a[i] == b[j]) {
            i++
            j++
        }
        if (i == a.size) {
            return false
        }
        return if (j == b.size) {
            true
        } else a[i] > b[j]
    }
}
