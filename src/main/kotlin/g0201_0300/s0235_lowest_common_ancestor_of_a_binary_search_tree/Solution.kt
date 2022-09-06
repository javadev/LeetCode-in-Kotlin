package g0201_0300.s0235_lowest_common_ancestor_of_a_binary_search_tree

import com_github_leetcode.TreeNode

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree #Data_Structure_I_Day_14_Tree
// #Level_1_Day_8_Binary_Search_Tree #2022_07_04_Time_4_ms_(100.00%)_Space_43.2_MB_(90.56%)
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode, q: TreeNode): TreeNode? {
        var root = root
        while (true) {
            root = if (root!!.`val` > p.`val` && root.`val` > q.`val`) {
                root.left
            } else if (root.`val` < p.`val` && root.`val` < q.`val`) {
                root.right
            } else {
                break
            }
        }
        return root
    }
}
