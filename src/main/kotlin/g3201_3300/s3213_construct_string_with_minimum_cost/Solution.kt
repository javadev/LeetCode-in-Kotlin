package g3201_3300.s3213_construct_string_with_minimum_cost

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_15_Time_3201_ms_(6.67%)_Space_114.1_MB_(6.67%)

import java.util.Collections
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    private fun buildKmpPrefix(target: String): List<Int> {
        val w: MutableList<Int> = ArrayList(Collections.nCopies(target.length, 0))
        var k = 0
        var i = 1
        while (i < target.length) {
            if (target[i] == target[k]) {
                k++
                w[i] = k
                i++
            } else {
                if (k != 0) {
                    k = w[k - 1]
                } else {
                    i++
                }
            }
        }
        return w
    }

    fun find(prefix: List<Int>, target: String, w: String): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        val m = target.length
        val n = w.length
        var i = 0
        var k = 0
        while (i < m) {
            if (target[i] == w[k]) {
                i++
                k++
            }
            if (k == n) {
                result.add(listOf(i - k, i))
                k = prefix[k - 1]
            } else if (i < m && target[i] != w[k]) {
                if (k != 0) {
                    k = prefix[k - 1]
                } else {
                    i++
                }
            }
        }
        return result
    }

    fun minimumCost(target: String, words: Array<String>, costs: IntArray): Int {
        val targetPrefix = buildKmpPrefix(target)
        val root = Node()
        for (j in words.indices) {
            val x = words[j]
            if (x.length < 320) {
                var p: Node? = root
                for (i in 0 until x.length) {
                    val c = x[i]
                    p!!.children.putIfAbsent(c, Node())
                    p = p.children[c]
                    if (i == x.length - 1) {
                        if (p!!.cost == null) {
                            p.cost = costs[j]
                        } else {
                            p.cost = min(costs[j], p.cost!!)
                        }
                    }
                }
            }
        }
        val dm =
            getIntegerMapMap(target, words, costs, targetPrefix)
        var d: MutableList<NodeCostPair> = ArrayList()
        d.add(NodeCostPair(root, 0))
        val dp = IntArray(target.length + 1)
        dp.fill(-1)
        dp[0] = 0
        for (i in target.indices) {
            val x = target[i]
            val q: MutableList<NodeCostPair> = ArrayList()
            var t: Int? = null
            for (pair in d) {
                val p = pair.node
                val cost = pair.cost
                if (p!!.children.containsKey(x)) {
                    val w = p.children[x]
                    if (w!!.cost != null) {
                        t = if (t == null) cost + w.cost!! else min(t, (cost + w.cost!!))
                    }
                    q.add(NodeCostPair(w, cost))
                }
            }
            t = getInteger(dm, i, dp, t)
            if (t != null) {
                dp[i + 1] = t
                q.add(NodeCostPair(root, t))
            }
            d = q
        }
        return dp[target.length]
    }

    private fun getInteger(dm: Map<Int, MutableMap<Int, Int>>, i: Int, dp: IntArray, t: Int?): Int? {
        var t = t
        val qm = dm.getOrDefault(i + 1, emptyMap())
        for ((b, value) in qm) {
            if (dp[b] >= 0) {
                t = if (t == null) dp[b] + value else min(t, (dp[b] + value))
            }
        }
        return t
    }

    private fun getIntegerMapMap(
        target: String,
        words: Array<String>,
        costs: IntArray,
        targetPrefix: List<Int>
    ): Map<Int, MutableMap<Int, Int>> {
        val dm: MutableMap<Int, MutableMap<Int, Int>> = HashMap()
        for (i in words.indices) {
            val word = words[i]
            if (word.length >= 320) {
                val q = find(targetPrefix, target, word)
                for (pair in q) {
                    val b = pair[0]
                    val e = pair[1]
                    dm.putIfAbsent(e, HashMap())
                    val qm = dm[e]!!
                    if (qm.containsKey(b)) {
                        qm[b] = min(qm[b]!!, costs[i])
                    } else {
                        qm[b] = costs[i]
                    }
                }
            }
        }
        return dm
    }

    private class Node {
        var children: MutableMap<Char, Node> = HashMap()
        var cost: Int? = null
    }

    private class NodeCostPair(var node: Node?, var cost: Int)
}
