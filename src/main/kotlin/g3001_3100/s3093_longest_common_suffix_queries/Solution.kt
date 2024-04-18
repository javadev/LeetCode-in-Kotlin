package g3001_3100.s3093_longest_common_suffix_queries

// #Hard #Array #String #Trie #2024_04_18_Time_860_ms_(89.29%)_Space_171.4_MB_(67.86%)

class Solution {
    fun stringIndices(wc: Array<String>, wq: Array<String>): IntArray {
        var minLength = wc[0].length
        var minIndex = 0
        val n = wc.size
        val m = wq.size
        for (i in 0 until n) {
            if (minLength > wc[i].length) {
                minLength = wc[i].length
                minIndex = i
            }
        }
        val root = Trie(minIndex)
        for (i in 0 until n) {
            var curr: Trie? = root
            for (j in wc[i].length - 1 downTo 0) {
                val ch = wc[i][j]
                if (curr!!.has(ch)) {
                    val next = curr.get(ch)
                    if (wc[next!!.index].length > wc[i].length) {
                        next.index = i
                    }
                    curr = next
                } else {
                    curr.put(ch, i)
                    curr = curr.get(ch)
                }
            }
        }
        val ans = IntArray(m)
        for (i in 0 until m) {
            var curr: Trie? = root
            for (j in wq[i].length - 1 downTo 0) {
                val ch = wq[i][j]
                if (curr!!.has(ch)) {
                    curr = curr.get(ch)
                } else {
                    break
                }
            }
            ans[i] = curr!!.index
        }
        return ans
    }

    private class Trie(var index: Int) {
        var ch: Array<Trie?> = arrayOfNulls(26)

        fun get(ch: Char): Trie? {
            return this.ch[ch.code - 'a'.code]
        }

        fun has(ch: Char): Boolean {
            return this.ch[ch.code - 'a'.code] != null
        }

        fun put(ch: Char, index: Int) {
            this.ch[ch.code - 'a'.code] = Trie(index)
        }
    }
}
