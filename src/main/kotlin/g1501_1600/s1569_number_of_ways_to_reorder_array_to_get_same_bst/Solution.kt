package g1501_1600.s1569_number_of_ways_to_reorder_array_to_get_same_bst

// #Hard #Array #Dynamic_Programming #Math #Tree #Binary_Tree #Union_Find #Binary_Search_Tree
// #Divide_and_Conquer #Memoization #Combinatorics
// #2023_06_14_Time_256_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun numOfWays(nums: IntArray): Int {
        val mod: Long = 1000000007
        val fact = LongArray(1001)
        fact[0] = 1
        for (i in 1..1000) {
            fact[i] = fact[i - 1] * i % mod
        }
        val root = TreeNode(nums[0])
        for (i in 1 until nums.size) {
            addInTree(nums[i], root)
        }
        return ((calcPerms(root, fact).perm - 1) % mod).toInt()
    }

    class Inverse(var x: Long, var y: Long)
    class TreeInfo(var numOfNodes: Long, var perm: Long)
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    private fun calcPerms(root: TreeNode?, fact: LongArray): TreeInfo {
        val left: TreeInfo
        val right: TreeInfo
        left = if (root!!.left != null) {
            calcPerms(
                root.left, fact,
            )
        } else {
            TreeInfo(0, 1)
        }
        right = if (root.right != null) {
            calcPerms(
                root.right, fact,
            )
        } else {
            TreeInfo(0, 1)
        }
        val mod: Long = 1000000007
        val totNodes = left.numOfNodes + right.numOfNodes + 1
        val modDiv = getModDivision(
            fact[totNodes.toInt() - 1],
            fact[left.numOfNodes.toInt()],
            fact[right.numOfNodes.toInt()],
            mod,
        )
        val perms = if (totNodes == 1L) 1 else left.perm * right.perm % mod * modDiv % mod
        left.numOfNodes = totNodes
        left.perm = perms
        return left
    }

    private fun getModDivision(a: Long, b1: Long, b2: Long, m: Long): Long {
        val b = b1 * b2
        val inv = getInverse(b, m)
        return inv * a % m
    }

    private fun getInverse(b: Long, m: Long): Long {
        val inv = getInverseExtended(b, m)
        return (inv.x % m + m) % m
    }

    private fun getInverseExtended(a: Long, b: Long): Inverse {
        if (a == 0L) {
            return Inverse(0, 1)
        }
        val inv = getInverseExtended(b % a, a)
        val x1 = inv.y - b / a * inv.x
        val y1 = inv.x
        inv.x = x1
        inv.y = y1
        return inv
    }

    private fun addInTree(x: Int, root: TreeNode?) {
        if (root!!.`val` > x) {
            if (root.left != null) {
                addInTree(x, root.left)
            } else {
                root.left = TreeNode(x)
            }
        }
        if (root.`val` < x) {
            if (root.right != null) {
                addInTree(x, root.right)
            } else {
                root.right = TreeNode(x)
            }
        }
    }
}
