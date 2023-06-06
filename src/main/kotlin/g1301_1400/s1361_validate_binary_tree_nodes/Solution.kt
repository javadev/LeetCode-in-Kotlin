package g1301_1400.s1361_validate_binary_tree_nodes

import java.util.ArrayDeque
import java.util.Deque

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Graph #Union_Find
class Solution {
    fun validateBinaryTreeNodes(n: Int, leftChild: IntArray, rightChild: IntArray): Boolean {
        val inDeg = IntArray(n)
        for (i in 0 until n) {
            if (leftChild[i] >= 0) {
                inDeg[leftChild[i]] += 1
            }
            if (rightChild[i] >= 0) {
                inDeg[rightChild[i]] += 1
            }
        }
        val queue: Deque<Int> = ArrayDeque()
        for (i in 0 until n) {
            if (inDeg[i] == 0) {
                if (queue.isEmpty()) {
                    queue.offer(i)
                } else {
                    // Violate rule 1.
                    return false
                }
            }
            if (inDeg[i] > 1) {
                // Violate rule 2.
                return false
            }
        }
        var tpLen = 0
        while (!queue.isEmpty()) {
            val curNode = queue.poll()
            tpLen++
            val left = leftChild[curNode]
            val right = rightChild[curNode]
            if (left > -1 && --inDeg[left] == 0) {
                queue.offer(left)
            }
            if (right > -1 && --inDeg[right] == 0) {
                queue.offer(right)
            }
        }
        return tpLen == n
    }
}
