package g0101_0200.s0126_word_ladder_ii

// #Hard #String #Hash_Table #Breadth_First_Search #Backtracking
// #2022_10_08_Time_418_ms_(51.45%)_Space_41.1_MB_(65.94%)

import java.util.Collections
import java.util.LinkedList
import java.util.Queue

class Solution {
    fun findLadders(beginWord: String, endWord: String, wordList: List<String>): List<List<String>> {
        val ans: MutableList<List<String>> = ArrayList()
        // reverse graph start from endWord
        val reverse: MutableMap<String, MutableSet<String>> = HashMap()
        // remove the duplicate words
        val wordSet: MutableSet<String> = HashSet(wordList)
        // remove the first word to avoid cycle path
        wordSet.remove(beginWord)
        // store current layer nodes
        val queue: Queue<String> = LinkedList()
        // first layer has only beginWord
        queue.add(beginWord)
        // store nextLayer nodes
        val nextLevel: MutableSet<String> = HashSet()
        // find endWord flag
        var findEnd = false
        // traverse current layer nodes
        while (queue.isNotEmpty()) {
            val word = queue.remove()
            for (next in wordSet) {
                // is ladder words
                if (isLadder(word, next)) {
                    // construct the reverse graph from endWord
                    val reverseLadders = reverse.computeIfAbsent(
                        next
                    ) { _: String? -> HashSet() }
                    reverseLadders.add(word)
                    if (endWord == next) {
                        findEnd = true
                    }
                    // store next layer nodes
                    nextLevel.add(next)
                }
            }
            // when current layer is all visited
            if (queue.isEmpty()) {
                // if find the endWord, then break the while loop
                if (findEnd) {
                    break
                }
                // add next layer nodes to queue
                queue.addAll(nextLevel)
                // remove all next layer nodes in wordSet
                wordSet.removeAll(nextLevel)
                nextLevel.clear()
            }
        }
        // if can't reach endWord from startWord, then return ans.
        if (!findEnd) {
            return ans
        }
        val path: MutableSet<String> = LinkedHashSet()
        path.add(endWord)
        // traverse reverse graph from endWord to beginWord
        findPath(endWord, beginWord, reverse, ans, path)
        return ans
    }

    private fun findPath(
        endWord: String,
        beginWord: String,
        graph: Map<String, MutableSet<String>>,
        ans: MutableList<List<String>>,
        path: MutableSet<String>
    ) {
        val next = graph[endWord] ?: return
        for (word in next) {
            path.add(word)
            if (beginWord == word) {
                val shortestPath: List<String> = ArrayList(path)
                // reverse words in shortest path
                Collections.reverse(shortestPath)
                // add the shortest path to ans.
                ans.add(shortestPath)
            } else {
                findPath(word, beginWord, graph, ans, path)
            }
            path.remove(word)
        }
    }

    private fun isLadder(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        var diffCount = 0
        val n = s.length
        for (i in 0 until n) {
            if (s[i] != t[i]) {
                diffCount++
            }
            if (diffCount > 1) {
                return false
            }
        }
        return diffCount == 1
    }
}
