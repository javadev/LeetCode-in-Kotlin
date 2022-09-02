package com_github_leetcode

object LinkedListUtils {
    fun contructLinkedList(nums: IntArray?): ListNode? {
        if (nums == null || nums.isEmpty()) {
            return null
        }
        val pre = ListNode(-1)
        var head: ListNode? = ListNode(nums[0])
        pre.next = head
        for (i in 1 until nums.size) {
            head!!.next = ListNode(nums[i])
            head = head.next
        }
        return pre.next
    }

    fun createSinglyLinkedList(listValues: List<Int?>?): ListNode {
        require(!(listValues == null || listValues.isEmpty())) { "Please pass in a valid listValues to create a singly linked list." }
        val head = ListNode(listValues[0]!!)
        var tmp: ListNode? = head
        for (i in 1 until listValues.size) {
            val next = ListNode(listValues[i]!!)
            tmp!!.next = next
            tmp = tmp.next
        }
        return head
    }
}
