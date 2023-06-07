package g1201_1300.s1268_search_suggestions_system

// #Medium #Array #String
class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        val trie = Trie()
        products.sort()
        for (p in products) {
            trie.insert(p)
        }
        return trie.getResult(searchWord)
    }

    internal class Trie {
        var root: Node

        init {
            root = Node()
        }

        fun insert(word: String) {
            var curr = root
            for (element in word) {
                val c = element
                if (!curr.containsKey(c)) {
                    curr.put(c, Node())
                }
                curr = curr[c]
                curr.addToList(word)
            }
        }

        fun getResult(searchWord: String): List<List<String>> {
            var curr = root
            val res: MutableList<List<String>> = ArrayList()
            for (element in searchWord) {
                val c = element
                val temp: MutableList<String> = ArrayList()
                curr = curr[c]
                var j = 0
                while (j < 3 && j < curr.list.size) {
                    temp.add(curr.list[j])
                    j++
                }
                res.add(ArrayList(temp))
            }
            return res
        }
    }

    internal class Node {
        var links: Array<Node?>
        var list: MutableList<String>

        init {
            links = arrayOfNulls(26)
            list = ArrayList()
        }

        fun containsKey(c: Char): Boolean {
            return links[c.code - 'a'.code] != null
        }

        operator fun get(c: Char): Node {
            return links[c.code - 'a'.code]!!
        }

        fun put(c: Char, node: Node?) {
            links[c.code - 'a'.code] = node
        }

        fun addToList(s: String) {
            list.add(s)
        }
    }
}
