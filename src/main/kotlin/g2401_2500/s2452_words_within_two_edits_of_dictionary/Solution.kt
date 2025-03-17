package g2401_2500.s2452_words_within_two_edits_of_dictionary

// #Medium #Array #String #2023_07_04_Time_256_ms_(100.00%)_Space_40.8_MB_(100.00%)

class Solution {
    private var root: Node? = null

    internal class Node {
        var childs = HashMap<Char, Node>()
    }

    private fun insert(s: String) {
        var curr = root
        for (ch in s.toCharArray()) {
            if (curr!!.childs[ch] == null) {
                curr.childs[ch] = Node()
            }
            curr = curr.childs[ch]
        }
    }

    private fun search(word: String, curr: Node?, i: Int, edits: Int): Boolean {
        // if reached the end with less than or equal 2 edits then return truem
        if (i == word.length) {
            return edits <= 2
        }
        // more than 2 mismatch don't go further
        if (edits > 2) {
            return false
        }
        // there might be a case start is matching but others are diff and that's a edge case to
        // handle
        var ans = false
        for (ch in curr!!.childs.keys) {
            ans = ans or search(
                word,
                curr.childs[ch],
                i + 1,
                if (ch == word[i]) edits else edits + 1,
            )
        }
        return ans
    }

    fun twoEditWords(queries: Array<String>, dictionary: Array<String>): List<String> {
        root = Node()
        for (s in dictionary) {
            insert(s)
        }
        val ans: MutableList<String> = ArrayList()
        for (s in queries) {
            val found = search(s, root, 0, 0)
            if (found) {
                ans.add(s)
            }
        }
        return ans
    }
}
