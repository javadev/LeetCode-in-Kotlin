package g0401_0500.s0449_serialize_and_deserialize_bst

// #Medium #String #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
// #Binary_Search_Tree #2022_12_24_Time_233_ms_(100.00%)_Space_36.3_MB_(100.00%)

import com_github_leetcode.TreeNode

/*
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec {
    private var cur = 0

    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        val sb = StringBuilder()
        serializeDfs(root, sb)
        return sb.toString()
    }

    private fun serializeDfs(root: TreeNode?, sb: StringBuilder) {
        if (root == null) {
            sb.append(SPLIT)
            return
        }
        sb.append((root.`val` + MIN).toChar())
        serializeDfs(root.left, sb)
        serializeDfs(root.right, sb)
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        cur = 0
        return deserializeDFS(data.toCharArray())
    }

    private fun deserializeDFS(data: CharArray): TreeNode? {
        if (data[cur] == SPLIT) {
            cur++
            return null
        }
        val node = TreeNode(data[cur++].code - MIN)
        node.left = deserializeDFS(data)
        node.right = deserializeDFS(data)
        return node
    }

    companion object {
        private const val SPLIT = 0.toChar()
        private const val MIN = 1
    }
}

/*
 * Your Codec object will be instantiated and called as such:
 * val ser = Codec()
 * val deser = Codec()
 * val tree: String = ser.serialize(root)
 * val ans = deser.deserialize(tree)
 * return ans
 */
