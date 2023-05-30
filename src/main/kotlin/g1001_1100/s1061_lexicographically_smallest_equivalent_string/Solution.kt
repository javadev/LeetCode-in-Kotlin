package g1001_1100.s1061_lexicographically_smallest_equivalent_string

// #Medium #String #Union_Find #2023_05_30_Time_166_ms_(100.00%)_Space_50.7_MB_(25.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    lateinit var parent: IntArray

    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String? {
        parent = IntArray(26)
        val n = s1.length
        var result = ""
        for (i in 0..25) parent[i] = i
        for (i in 0 until n) {
            union(s1[i].code - 'a'.code, s2[i].code - 'a'.code)
        }
        val base = 'a'.code
        for (element in baseStr) {
            result += (base + find(element.code - 'a'.code)).toChar()
        }
        return result
    }

    private fun union(a: Int, b: Int) {
        val parentA = find(a)
        val parentB = find(b)
        if (parentA != parentB) {
            if (parentA < parentB) {
                parent[parentB] = parentA
            } else {
                parent[parentA] = parentB
            }
        }
    }

    private fun find(x: Int): Int {
        var x = x
        while (parent[x] != x) {
            x = parent[x]
        }
        return x
    }
}
