package g0201_0300.s0297_serialize_and_deserialize_binary_tree

import com_github_leetcode.TreeNode

// #Hard #Top_Interview_Questions #String #Depth_First_Search #Breadth_First_Search #Tree
// #Binary_Tree #Design #Data_Structure_II_Day_18_Tree #Udemy_Tree_Stack_Queue
// #2022_07_06_Time_7_ms_(98.13%)_Space_51.1_MB_(74.13%)
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Codec {
    private var offset = 0

    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        val sb = StringBuilder()
        offset = 0
        serialize(root, sb)
        return sb.toString()
    }

    fun serialize(root: TreeNode?, sb: StringBuilder) {
        // all nodes fit into 4 bits.
        // IFF we offset at 0. So encode(val) = val + min(default - 1000)
        if (root == null) {
            sb.append(DELIM)
            return
        }
        val s = Integer.toHexString(root.`val` + BASE_OFFSET)
        val sb2 = StringBuilder()
        for (i in 0 until 3 - s.length) {
            sb2.append('0')
        }
        sb2.append(s)
        sb.append(sb2)
        serialize(root.left, sb)
        serialize(root.right, sb)
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if (data[offset] == '*') {
            offset++
            return null
        }
        val root = TreeNode(
            data.substring(offset, offset + 3).toInt(16) - BASE_OFFSET
        )
        offset += 3
        root.left = deserialize(data)
        root.right = deserialize(data)
        return root
    }

    companion object {
        private const val BASE_OFFSET = 1000
        private const val DELIM = "*"
    }
}
