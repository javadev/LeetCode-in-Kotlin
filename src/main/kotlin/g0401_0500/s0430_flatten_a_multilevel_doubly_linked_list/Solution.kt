package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list

// #Medium #Depth_First_Search #Linked_List #Doubly_Linked_List
// #2022_12_12_Time_194_ms_(97.44%)_Space_35.5_MB_(87.18%)

import com_github_leetcode.prev_next.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var prev: Node? = null
 *     var next: Node? = null
 *     var child: Node? = null
 * }
 */

class Solution {
    fun flatten(root: Node?): Node? {
        var currentNode = root
        while (currentNode != null) {
            if (currentNode.child != null) {
                appendToParent(currentNode, currentNode.next)
            }
            currentNode = currentNode.next
        }
        return root
    }

    private fun appendToParent(parent: Node, parentNext: Node?) {
        var currentNode = parent.child
        while (currentNode?.next != null) {
            if (currentNode.child != null) {
                appendToParent(currentNode, currentNode.next)
            }
            currentNode = currentNode.next
        }
        parent.next = parent.child
        parent.child?.prev = parent
        currentNode?.next = parentNext
        parentNext?.prev = currentNode
        parent.child = null
    }
}
