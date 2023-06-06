package com_github_leetcode

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class ListNodeTest {
    @Test
    fun constructor() {
        val listNode = ListNode()
        assertThat(listNode.toString(), equalTo("0"))
    }

    @Test
    fun constructor2() {
        val listNode = ListNode(1)
        assertThat(listNode.toString(), equalTo("1"))
    }

    @Test
    fun constructor3() {
        val listNode = ListNode(3, ListNode(4))
        assertThat(listNode.toString(), equalTo("3, 4"))
    }

    @Test
    fun constructor4() {
        val listNode = ListNode(3, ListNode(4, ListNode(5)))
        assertThat(listNode.toString(), equalTo("3, 4, 5"))
    }
}
