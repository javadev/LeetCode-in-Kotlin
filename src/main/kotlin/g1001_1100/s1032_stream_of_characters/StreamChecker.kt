package g1001_1100.s1032_stream_of_characters

// #Hard #Array #String #Design #Trie #Data_Stream
// #2023_05_24_Time_733_ms_(100.00%)_Space_158.5_MB_(50.00%)

class StreamChecker(words: Array<String>) {
    internal class Node {
        var child: Array<Node?> = arrayOfNulls(26)
        var isEnd = false
    }

    private val sb: StringBuilder = StringBuilder()
    private val root: Node = Node()
    fun insert(s: String) {
        var curr: Node? = root
        for (i in s.length - 1 downTo 0) {
            val c = s[i]
            if (curr!!.child[c.code - 'a'.code] == null) {
                curr.child[c.code - 'a'.code] = Node()
            }
            curr = curr.child[c.code - 'a'.code]
        }
        curr!!.isEnd = true
    }

    init {
        for (s in words) {
            insert(s)
        }
    }

    fun query(letter: Char): Boolean {
        sb.append(letter)
        var curr: Node? = root
        for (i in sb.length - 1 downTo 0) {
            val c = sb[i]
            if (curr!!.child[c.code - 'a'.code] == null) {
                return false
            }
            if (curr.child[c.code - 'a'.code]!!.isEnd) {
                return true
            }
            curr = curr.child[c.code - 'a'.code]
        }
        return false
    }
}

/*
 * Your StreamChecker object will be instantiated and called as such:
 * var obj = StreamChecker(words)
 * var param_1 = obj.query(letter)
 */
