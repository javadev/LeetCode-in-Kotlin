package g2401_2500.s2476_closest_nodes_queries_in_a_binary_search_tree

import com_github_leetcode.TreeNode
import java.util.TreeSet

// #Medium #Array #Depth_First_Search #Tree #Binary_Search #Binary_Tree
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private val set = TreeSet<Int>()
    private fun traverse(root: TreeNode?) {
        if (root == null) {
            return
        }
        traverse(root.left)
        set.add(root.`val`)
        traverse(root.right)
    }

    fun closestNodes(root: TreeNode?, queries: List<Int>): List<List<Int>> {
        traverse(root)
        val ans: MutableList<List<Int>> = ArrayList()
        for (q in queries) {
            val list: MutableList<Int> = ArrayList()
            val min = set.floor(q)
            if (min != null) {
                list.add(min)
            } else {
                list.add(-1)
            }
            val max = set.ceiling(q)
            if (max != null) {
                list.add(max)
            } else {
                list.add(-1)
            }
            ans.add(list)
        }
        return ans
    }
}
