package g1201_1300.s1261_find_elements_in_a_contaminated_binary_tree

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Design
// #2023_06_08_Time_287_ms_(100.00%)_Space_44.7_MB_(100.00%)

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
/*
 * Your FindElements object will be instantiated and called as such:
 * var obj = FindElements(root)
 * var param_1 = obj.find(target)
 */
