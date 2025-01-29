package g0101_0200.s0108_convert_sorted_array_to_binary_search_tree

// #Easy #Top_Interview_Questions #Array #Tree #Binary_Tree #Binary_Search_Tree #Divide_and_Conquer
// #Data_Structure_II_Day_15_Tree #Level_2_Day_9_Binary_Search_Tree #Udemy_Tree_Stack_Queue
// #Top_Interview_150_Divide_and_Conquer #2023_07_11_Time_167_ms_(80.29%)_Space_36.6_MB_(83.94%)

import com_github_leetcode.TreeNode

/*
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedArrayToBST(num: IntArray): TreeNode? {
        /*1. Set up recursion*/
        return makeTree(num, 0, num.size - 1)
    }

    private fun makeTree(num: IntArray, left: Int, right: Int): TreeNode? {
        /*2. left as lowest# can't be greater than right*/
        if (left > right) {
            return null
        }
        /*3. Set median# as node*/
        val mid = (left + right) / 2
        val midNode = TreeNode(num[mid])
        /*4. Set mid node's kids*/
        midNode.left = makeTree(num, left, mid - 1)
        midNode.right = makeTree(num, mid + 1, right)
        /*5. Sends node back || Goes back to prev node*/
        return midNode
    }
}
