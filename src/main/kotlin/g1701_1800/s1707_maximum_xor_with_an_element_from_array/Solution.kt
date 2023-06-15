package g1701_1800.s1707_maximum_xor_with_an_element_from_array

import java.util.*

// #Hard #Array #Bit_Manipulation #Trie
class Solution {
    internal class QueryComparator : Comparator<IntArray> {
        override fun compare(a: IntArray, b: IntArray): Int {
            return Integer.compare(a[1], b[1])
        }
    }

    internal class Node {
        var zero: Node? = null
        var one: Node? = null
    }

    fun maximizeXor(nums: IntArray, queries: Array<IntArray>): IntArray {
        Arrays.sort(nums)
        val len = queries.size
        val queryWithIndex = Array(len) { IntArray(3) }
        for (i in 0 until len) {
            queryWithIndex[i][0] = queries[i][0]
            queryWithIndex[i][1] = queries[i][1]
            queryWithIndex[i][2] = i
        }
        Arrays.sort(queryWithIndex, QueryComparator())
        var numId = 0
        val ans = IntArray(len)
        val root = Node()
        for (i in 0 until len) {
            while (numId < nums.size && nums[numId] <= queryWithIndex[i][1]) {
                addNumToTree(nums[numId], root)
                numId++
            }
            ans[queryWithIndex[i][2]] = maxXOR(queryWithIndex[i][0], root)
        }
        return ans
    }

    private fun addNumToTree(num: Int, node: Node) {
        var node: Node? = node
        for (i in 31 downTo 0) {
            val digit = num shr i and 1
            if (digit == 1) {
                if (node!!.one == null) {
                    node.one = Node()
                }
                node = node.one
            } else {
                if (node!!.zero == null) {
                    node.zero = Node()
                }
                node = node.zero
            }
        }
    }

    private fun maxXOR(num: Int, node: Node): Int {
        var node: Node? = node
        if (node!!.one == null && node.zero == null) {
            return -1
        }
        var ans = 0
        var i = 31
        while (i >= 0 && node != null) {
            val digit = num shr i and 1
            if (digit == 1) {
                if (node.zero != null) {
                    ans += 1 shl i
                    node = node.zero
                } else {
                    node = node.one
                }
            } else {
                if (node.one != null) {
                    ans += 1 shl i
                    node = node.one
                } else {
                    node = node.zero
                }
            }
            i--
        }
        return ans
    }
}
