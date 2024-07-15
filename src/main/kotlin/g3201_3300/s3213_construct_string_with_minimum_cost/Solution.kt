package g3201_3300.s3213_construct_string_with_minimum_cost

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_15_Time_1176_ms_(46.67%)_Space_78.1_MB_(33.33%)

import kotlin.math.min

class Solution {
    private class ACAutomaton {
        class Node {
            var key: Char = 0.toChar()
            var `val`: Int? = null
            var len: Int = 0
            val next: Array<Node?> = arrayOfNulls(26)
            var suffix: Node? = null
            var output: Node? = null
            var parent: Node? = null
        }

        fun build(patterns: Array<String>, values: IntArray): Node {
            val root = Node()
            root.suffix = root
            root.output = root
            for (i in patterns.indices) {
                put(root, patterns[i], values[i])
            }
            for (i in root.next.indices) {
                if (root.next[i] == null) {
                    root.next[i] = root
                } else {
                    root.next[i]!!.suffix = root
                }
            }
            return root
        }

        private fun put(root: Node, s: String, `val`: Int) {
            var node: Node? = root
            for (c in s.toCharArray()) {
                if (node!!.next[c.code - 'a'.code] == null) {
                    node.next[c.code - 'a'.code] = Node()
                    node.next[c.code - 'a'.code]!!.parent = node
                    node.next[c.code - 'a'.code]!!.key = c
                }
                node = node.next[c.code - 'a'.code]
            }
            if (node!!.`val` == null || node.`val`!! > `val`) {
                node.`val` = `val`
                node.len = s.length
            }
        }

        fun getOutput(node: Node?): Node? {
            if (node!!.output == null) {
                val suffix = getSuffix(node)
                node.output = if (suffix!!.`val` != null) suffix else getOutput(suffix)
            }
            return node.output
        }

        fun go(node: Node?, c: Char): Node? {
            if (node!!.next[c.code - 'a'.code] == null) {
                node.next[c.code - 'a'.code] = go(getSuffix(node), c)
            }
            return node.next[c.code - 'a'.code]
        }

        private fun getSuffix(node: Node?): Node? {
            if (node!!.suffix == null) {
                node.suffix = go(getSuffix(node.parent), node.key)
                if (node.suffix!!.`val` != null) {
                    node.output = node.suffix
                } else {
                    node.output = node.suffix!!.output
                }
            }
            return node.suffix
        }
    }

    fun minimumCost(target: String, words: Array<String>, costs: IntArray): Int {
        val ac = ACAutomaton()
        val root = ac.build(words, costs)
        val dp = IntArray(target.length + 1)
        dp.fill(Int.MAX_VALUE / 2)
        dp[0] = 0
        var node: ACAutomaton.Node? = root
        for (i in 1 until dp.size) {
            node = ac.go(node, target[i - 1])
            var temp = node
            while (temp != null && temp !== root) {
                if (temp.`val` != null && dp[i - temp.len] < Int.MAX_VALUE / 2) {
                    dp[i] = min(dp[i], (dp[i - temp.len] + temp.`val`!!))
                }
                temp = ac.getOutput(temp)
            }
        }
        return if (dp[dp.size - 1] >= Int.MAX_VALUE / 2) -1 else dp[dp.size - 1]
    }
}
