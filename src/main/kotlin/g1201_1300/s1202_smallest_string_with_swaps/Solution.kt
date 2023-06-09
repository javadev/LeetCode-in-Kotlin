package g1201_1300.s1202_smallest_string_with_swaps

// #Medium #String #Hash_Table #Depth_First_Search #Breadth_First_Search #Union_Find
// #2023_06_09_Time_562_ms_(100.00%)_Space_84.3_MB_(100.00%)

class Solution {
    fun smallestStringWithSwaps(s: String, pairs: List<List<Int>>): String {
        val uf = UF(s.length)
        for (p in pairs) {
            uf.union(p[0], p[1])
        }
        val freqMapPerRoot: MutableMap<Int, IntArray> = HashMap()
        for (i in s.indices) {
            freqMapPerRoot.computeIfAbsent(uf.find(i)) { IntArray(26) }[s[i].code - 'a'.code]++
        }
        val ans = CharArray(s.length)
        for (i in ans.indices) {
            val css = freqMapPerRoot[uf.find(i)]
            for (j in css!!.indices) {
                if (css[j] > 0) {
                    ans[i] = (j + 'a'.code).toChar()
                    css[j]--
                    break
                }
            }
        }
        return String(ans)
    }

    internal class UF(n: Int) {
        var root: IntArray
        var rank: IntArray

        init {
            root = IntArray(n)
            rank = IntArray(n)
            for (i in 0 until n) {
                root[i] = i
                rank[i] = 1
            }
        }

        fun find(u: Int): Int {
            if (u == root[u]) {
                return u
            }
            root[u] = find(root[u])
            return root[u]
        }

        fun union(u: Int, v: Int) {
            val ru = find(root[u])
            val rv = find(root[v])
            if (ru != rv) {
                if (rank[ru] < rank[rv]) {
                    root[ru] = root[rv]
                } else if (rank[ru] > rank[rv]) {
                    root[rv] = root[ru]
                } else {
                    root[rv] = root[ru]
                    rank[ru]++
                }
            }
        }
    }
}
