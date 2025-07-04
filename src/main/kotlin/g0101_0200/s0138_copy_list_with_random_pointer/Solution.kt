package g0101_0200.s0138_copy_list_with_random_pointer

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Linked_List
// #Programming_Skills_II_Day_14 #Udemy_Linked_List #Top_Interview_150_Linked_List
// #Big_O_Time_O(N)_Space_O(N) #2025_07_04_Time_123_ms_(90.70%)_Space_43.99_MB_(97.67%)

import com_github_leetcode.random.Node

/*
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */
class Solution {
    fun copyRandomList(head: Node?): Node? {
        val hashMap: MutableMap<Node?, Node> = HashMap()
        var cur = head
        while (cur != null) {
            hashMap.put(cur, Node(cur.`val`))
            cur = cur.next
        }
        cur = head
        while (cur != null) {
            val copy: Node = hashMap.get(cur)!!
            copy.next = hashMap[cur.next]
            copy.random = hashMap[cur.random]
            cur = cur.next
        }
        return hashMap[head]
    }
}
