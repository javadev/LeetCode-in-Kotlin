package g3301_3400.s3327_check_if_dfs_strings_are_palindromes

// #Hard #Array #String #Hash_Table #Depth_First_Search #Tree #Hash_Function
// #2024_10_22_Time_165_ms_(100.00%)_Space_88.9_MB_(66.67%)

import kotlin.math.min

class Solution {
    private val e: MutableList<MutableList<Int?>?> = ArrayList<MutableList<Int?>?>()
    private val stringBuilder = StringBuilder()
    private var s: String? = null
    private var now = 0
    private var n = 0
    private lateinit var l: IntArray
    private lateinit var r: IntArray
    private lateinit var p: IntArray
    private lateinit var c: CharArray

    private fun dfs(x: Int) {
        l[x] = now + 1
        for (v in e.get(x)!!) {
            dfs(v!!)
        }
        stringBuilder.append(s!!.get(x))
        r[x] = ++now
    }

    private fun matcher() {
        c[0] = '~'
        c[1] = '#'
        for (i in 1..n) {
            c[2 * i + 1] = '#'
            c[2 * i] = stringBuilder.get(i - 1)
        }
        var j = 1
        var mid = 0
        var localR = 0
        while (j <= 2 * n + 1) {
            if (j <= localR) {
                p[j] = min(p[(mid shl 1) - j], (localR - j + 1))
            }
            while (c[j - p[j]] == c[j + p[j]]) {
                ++p[j]
            }
            if (p[j] + j > localR) {
                localR = p[j] + j - 1
                mid = j
            }
            ++j
        }
    }

    fun findAnswer(parent: IntArray, s: String): BooleanArray {
        n = parent.size
        this.s = s
        for (i in 0 until n) {
            e.add(ArrayList<Int?>())
        }
        for (i in 1 until n) {
            e.get(parent[i])!!.add(i)
        }
        l = IntArray(n)
        r = IntArray(n)
        dfs(0)
        c = CharArray(2 * n + 10)
        p = IntArray(2 * n + 10)
        matcher()
        val ans = BooleanArray(n)
        for (i in 0 until n) {
            val mid = (2 * r[i] - 2 * l[i] + 1) / 2 + 2 * l[i]
            ans[i] = p[mid] - 1 >= r[i] - l[i] + 1
        }
        return ans
    }
}
