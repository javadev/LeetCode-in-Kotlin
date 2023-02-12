package g0601_0700.s0648_replace_words

// #Medium #Array #String #Hash_Table #Trie #2023_02_11_Time_392_ms_(100.00%)_Space_62.4_MB_(25.00%)

import java.util.function.Consumer

class Solution {
    fun replaceWords(dictionary: List<String>, sentence: String): String {
        val trie = Trie()
        dictionary.forEach(Consumer { word: String -> trie.insert(word) })
        val allWords = sentence.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in allWords.indices) {
            allWords[i] = trie.getRootForWord(allWords[i])
        }
        return java.lang.String.join(" ", *allWords)
    }

    internal class Node {
        var links = arrayOfNulls<Node>(26)
        var isWordCompleted = false

        fun containsKey(ch: Char): Boolean {
            return links[ch.toInt() - 'a'.toInt()] != null
        }

        fun put(ch: Char, node: Node?) {
            links[ch.toInt() - 'a'.toInt()] = node
        }

        operator fun get(ch: Char): Node? {
            return links[ch.toInt() - 'a'.toInt()]
        }
    }

    internal class Trie {
        var root: Node

        init {
            root = Node()
        }

        fun insert(word: String) {
            var node: Node? = root
            for (i in 0 until word.length) {
                if (!node!!.containsKey(word[i])) {
                    node.put(word[i], Node())
                }
                node = node[word[i]]
            }
            node!!.isWordCompleted = true
        }

        fun getRootForWord(word: String): String {
            var node: Node? = root
            val rootWord = StringBuilder()
            for (i in 0 until word.length) {
                if (node!!.containsKey(word[i])) {
                    rootWord.append(word[i])
                    node = node[word[i]]
                    if (node!!.isWordCompleted) {
                        return rootWord.toString()
                    }
                } else {
                    return word
                }
            }
            return word
        }
    }
}
