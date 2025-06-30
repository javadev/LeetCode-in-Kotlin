package g3501_3600.s3597_partition_string

// #Medium #String #Hash_Table #Simulation #Trie
// #2025_06_30_Time_43_ms_(100.00%)_Space_61.32_MB_(100.00%)

class Solution {
    private class Trie {
        var tries: Array<Trie?> = arrayOfNulls<Trie>(26)
    }

    fun partitionString(s: String): List<String> {
        val trie = Trie()
        val res: MutableList<String> = ArrayList()
        var node: Trie = trie
        var i = 0
        var j = 0
        while (i < s.length && j < s.length) {
            val idx = s[j].code - 'a'.code
            if (node.tries[idx] == null) {
                res.add(s.substring(i, j + 1))
                node.tries[idx] = Trie()
                i = j + 1
                j = i
                node = trie
            } else {
                node = node.tries[idx]!!
                j++
            }
        }
        return res
    }
}
