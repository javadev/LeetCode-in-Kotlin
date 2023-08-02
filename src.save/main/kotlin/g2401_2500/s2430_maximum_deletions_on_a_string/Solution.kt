package g2401_2500.s2430_maximum_deletions_on_a_string

// #Hard #String #Dynamic_Programming #Hash_Function #String_Matching #Rolling_Hash
// #2023_07_05_Time_280_ms_(100.00%)_Space_38.5_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private var s: String? = null
    private lateinit var hash: IntArray
    private lateinit var pows: IntArray
    private var visited: HashMap<Int, Int>? = null

    fun deleteString(s: String): Int {
        this.s = s
        if (isBad) {
            return s.length
        }
        visited = HashMap()
        fill()
        return helper(0, 1, 0, 1)
    }

    private fun helper(a: Int, b: Int, id1: Int, id2: Int): Int {
        var a = a
        var b = b
        var id2 = id2
        val mask = (id1 shl 12) + id2
        var ans = 1
        if (visited!!.containsKey(mask)) {
            return visited!![mask]!!
        }
        while (b < s!!.length) {
            if ((hash[a + 1] - hash[id1]) * pows[id2] == (hash[b + 1] - hash[id2]) * pows[id1]) {
                ans = if (id2 + 1 == s!!.length) {
                    ans.coerceAtLeast(2)
                } else {
                    ans.coerceAtLeast(1 + helper(id2, id2 + 1, id2, id2 + 1))
                }
            }
            a++
            id2++
            b += 2
        }
        visited!![mask] = ans
        return ans
    }

    private fun fill() {
        val n = s!!.length
        hash = IntArray(n + 1)
        pows = IntArray(n)
        pows[0] = 1
        hash[1] = s!![0].code
        for (i in 1 until n) {
            pows[i] = pows[i - 1] * 1000000007
            val temp = pows[i]
            hash[i + 1] = s!![i].code * temp + hash[i]
        }
    }

    private val isBad: Boolean
        get() {
            var i = 1
            while (i < s!!.length) {
                if (s!![0] != s!![i++]) {
                    return false
                }
            }
            return true
        }
}
