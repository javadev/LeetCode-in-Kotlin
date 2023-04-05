package g0701_0800.s0792_number_of_matching_subsequences

// #Medium #String #Hash_Table #Sorting #Trie
// #2023_03_13_Time_346_ms_(100.00%)_Space_41.7_MB_(40.00%)

class Solution {
    fun numMatchingSubseq(s: String, words: Array<String>): Int {
        val buckets: Array<MutableList<Node>?> = arrayOfNulls(26)
        for (i in buckets.indices) {
            buckets[i] = ArrayList()
        }
        for (word in words) {
            val start = word[0]
            buckets[start.code - 'a'.code]?.add(Node(word, 0))
        }
        var result = 0
        for (c in s.toCharArray()) {
            val currBucket: MutableList<Node>? = buckets[c.code - 'a'.code]
            buckets[c.code - 'a'.code] = ArrayList()
            for (node in currBucket!!) {
                node.index++
                if (node.index == node.word.length) {
                    result++
                } else {
                    val start = node.word[node.index]
                    buckets[start.code - 'a'.code]?.add(node)
                }
            }
        }
        return result
    }

    private class Node(var word: String, var index: Int)
}
