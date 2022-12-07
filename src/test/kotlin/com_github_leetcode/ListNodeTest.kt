package com_github_leetcode

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class ListNodeTest {
    @Test
    fun constructor() {
        val listNode = ListNode()
        MatcherAssert.assertThat(listNode.toString(), CoreMatchers.equalTo("0"))
    }

    @Test
    fun constructor2() {
        val listNode = ListNode(1)
        MatcherAssert.assertThat(listNode.toString(), CoreMatchers.equalTo("1"))
    }

    @Test
    fun constructor3() {
        val listNode = ListNode(3, ListNode(4))
        MatcherAssert.assertThat(listNode.toString(), CoreMatchers.equalTo("3, 4"))
    }

    @Test
    fun constructor4() {
        val listNode = ListNode(3, ListNode(4, ListNode(5)))
        MatcherAssert.assertThat(listNode.toString(), CoreMatchers.equalTo("3, 4, 5"))
    }
}
