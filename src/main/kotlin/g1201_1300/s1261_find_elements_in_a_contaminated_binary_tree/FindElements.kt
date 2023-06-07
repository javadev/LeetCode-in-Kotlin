package g1201_1300.s1261_find_elements_in_a_contaminated_binary_tree

import com_github_leetcode.TreeNode

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
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
class FindElements(root: TreeNode?) {
    private val map = HashMap<Int, Int>()

    init {
        helper(root, 0)
    }

    private fun helper(root: TreeNode?, x: Int) {
        if (root == null) {
            return
        }
        root.`val` = x
        map[x] = 0
        helper(root.left, 2 * x + 1)
        helper(root.right, 2 * x + 2)
    }

    fun find(target: Int): Boolean {
        return map.containsKey(target)
    }
}
