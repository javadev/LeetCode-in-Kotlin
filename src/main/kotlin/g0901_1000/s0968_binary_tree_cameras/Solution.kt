package g0901_1000.s0968_binary_tree_cameras

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2023_05_06_Time_176_ms_(100.00%)_Space_37.2_MB_(100.00%)

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
    private var cameras = 0
    fun minCameraCover(root: TreeNode?): Int {
        cameras = 0
        if (minCameras(root) == -1) {
            // root needs a camera
            cameras++
        }
        return cameras
    }

    //  States =>
    // -1 : Node needs a camera
    //  0 : Node has a camera placed
    //  1 : Node is covered somehow
    private fun minCameras(root: TreeNode?): Int {
        if (root == null) {
            return 1
        }
        val leftChildState = minCameras(root.left)
        val rightChildState = minCameras(root.right)
        // One of the two or both children need a camera
        if (leftChildState == -1 || rightChildState == -1) {
            // installed
            cameras++
            return 0
        }
        // One of the two or both children have a camera placed
        return if (leftChildState == 0 || rightChildState == 0) {
            // gets covered by the children
            1
        } else {
            -1
        }
        // needs a camera
    }
}
