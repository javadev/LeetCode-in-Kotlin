package g0801_0900.s0854_k_similar_strings

// #Hard #String #Breadth_First_Search #2023_03_31_Time_136_ms_(100.00%)_Space_33.6_MB_(100.00%)

class Solution {
    fun kSimilarity(a: String, b: String): Int {
        var ans = 0
        val achars = a.toCharArray()
        val bchars = b.toCharArray()
        ans += getAllPerfectMatches(achars, bchars)
        for (i in achars.indices) {
            if (achars[i] == bchars[i]) {
                continue
            }
            return ans + checkAllOptions(achars, bchars, i, b)
        }
        return ans
    }

    private fun checkAllOptions(achars: CharArray, bchars: CharArray, i: Int, b: String): Int {
        var ans = Int.MAX_VALUE
        for (j in i + 1 until achars.size) {
            if (achars[j] == bchars[i] && achars[j] != bchars[j]) {
                swap(achars, i, j)
                ans = Math.min(ans, 1 + kSimilarity(String(achars), b))
                swap(achars, i, j)
            }
        }
        return ans
    }

    private fun getAllPerfectMatches(achars: CharArray, bchars: CharArray): Int {
        var ans = 0
        for (i in achars.indices) {
            if (achars[i] == bchars[i]) {
                continue
            }
            for (j in i + 1 until achars.size) {
                if (achars[j] == bchars[i] && bchars[j] == achars[i]) {
                    swap(achars, i, j)
                    ans++
                    break
                }
            }
        }
        return ans
    }

    private fun swap(a: CharArray, i: Int, j: Int) {
        val temp = a[i]
        a[i] = a[j]
        a[j] = temp
    }
}
