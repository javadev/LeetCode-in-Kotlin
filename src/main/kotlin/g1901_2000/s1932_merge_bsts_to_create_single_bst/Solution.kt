package g1901_2000.s1932_merge_bsts_to_create_single_bst

import com_github_leetcode.TreeNode
import java.util.ArrayDeque
import java.util.Queue

// #Hard #Hash_Table #Depth_First_Search #Tree #Binary_Search #Binary_Tree
class Solution {
    fun canMerge(trees: List<TreeNode?>): TreeNode? {
        val root = findRoot(trees) ?: return null
        for (t in trees) {
            ROOT_VALS[t!!.`val`] = t
        }
        bfs(root)
        return if (!isValidBST(root) || ROOT_VALS.size != 1) {
            null
        } else root
    }

    private fun findRoot(trees: List<TreeNode?>): TreeNode? {
        var root: TreeNode? = null
        val valCnts: MutableMap<Int, Int> = HashMap()
        for (t in trees) {
            valCnts[t!!.`val`] = valCnts.getOrDefault(t.`val`, 0) + 1
            if (t.left != null) {
                valCnts[t.left!!.`val`] = valCnts.getOrDefault(t.left!!.`val`, 0) + 1
            }
            if (t.right != null) {
                valCnts[t.right!!.`val`] = valCnts.getOrDefault(t.right!!.`val`, 0) + 1
            }
        }
        for (t in trees) {
            if (valCnts[t!!.`val`] == 1) {
                root = if (root == null) {
                    t
                } else {
                    return null
                }
            }
        }
        return root
    }

    private fun bfs(root: TreeNode) {
        val q: Queue<TreeNode?> = ArrayDeque()
        q.offer(root)
        while (!q.isEmpty()) {
            val size = q.size
            for (i in 0 until size) {
                val parent = q.poll()
                if (parent!!.left != null && ROOT_VALS.containsKey(parent.left!!.`val`)) {
                    val toConnect = ROOT_VALS[parent.left!!.`val`]
                    ROOT_VALS.remove(toConnect!!.`val`)
                    parent.left = toConnect
                    q.offer(parent.left)
                }
                if (parent.right != null && ROOT_VALS.containsKey(parent.right!!.`val`)) {
                    val toConnect = ROOT_VALS[parent.right!!.`val`]
                    ROOT_VALS.remove(toConnect!!.`val`)
                    parent.right = toConnect
                    q.offer(parent.right)
                }
            }
        }
    }

    private fun isValidBST(root: TreeNode): Boolean {
        return isValidBST(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    private fun isValidBST(root: TreeNode?, min: Int, max: Int): Boolean {
        if (root == null) {
            return true
        }
        return if (root.`val` <= min || root.`val` >= max) {
            false
        } else isValidBST(root.left, min, root.`val`) && isValidBST(root.right, root.`val`, max)
    }

    companion object {
        private val ROOT_VALS: MutableMap<Int, TreeNode> = HashMap()
    }
}
