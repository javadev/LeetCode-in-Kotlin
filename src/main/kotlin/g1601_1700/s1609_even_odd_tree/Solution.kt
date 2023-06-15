package g1601_1700.s1609_even_odd_tree

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2023_06_15_Time_497_ms_(100.00%)_Space_72.4_MB_(50.00%)

import com_github_leetcode.TreeNode

class Solution {
    private val comp: MutableList<Int> = ArrayList()
    fun isEvenOddTree(root: TreeNode?): Boolean {
        return find(root, 0)
    }

    private fun find(root: TreeNode?, height: Int): Boolean {
        if (root == null) {
            return true
        }
        if (height % 2 == 0 && root.`val` % 2 == 0 || height % 2 == 1 && root.`val` % 2 == 1) {
            return false
        }
        if (comp.size == height) {
            comp.add(root.`val`)
        } else {
            if (height % 2 == 0) {
                if (comp[height] >= root.`val`) {
                    return false
                } else {
                    comp[height] = root.`val`
                }
            } else {
                if (comp[height] <= root.`val`) {
                    return false
                } else {
                    comp[height] = root.`val`
                }
            }
        }
        return find(root.left, height + 1) && find(root.right, height + 1)
    }
}
