package g0601_0700.s0677_map_sum_pairs

// #Medium #String #Hash_Table #Design #Trie #2023_02_15_Time_197_ms_(80.00%)_Space_36.1_MB_(55.00%)

class MapSum {
    internal class Node {
        var `val`: Int = 0
        var child: Array<Node?> = arrayOfNulls(26)
    }

    private val root: Node = Node()

    fun insert(key: String, `val`: Int) {
        var curr: Node? = root
        for (c in key.toCharArray()) {
            if (curr!!.child[c.code - 'a'.code] == null) {
                curr.child[c.code - 'a'.code] = Node()
            }
            curr = curr.child[c.code - 'a'.code]
        }
        curr!!.`val` = `val`
    }

    private fun sumHelper(root: Node?): Int {
        var o = 0
        for (i in 0..25) {
            if (root!!.child[i] != null) {
                o += root.child[i]!!.`val` + sumHelper(root.child[i])
            }
        }
        return o
    }

    fun sum(prefix: String): Int {
        var curr: Node? = root
        for (c in prefix.toCharArray()) {
            if (curr!!.child[c.code - 'a'.code] == null) {
                return 0
            }
            curr = curr.child[c.code - 'a'.code]
        }
        val sum = curr!!.`val`
        return sum + sumHelper(curr)
    }
}

/*
 * Your MapSum object will be instantiated and called as such:
 * var obj = MapSum()
 * obj.insert(key,`val`)
 * var param_2 = obj.sum(prefix)
 */
