package com_github_leetcode.random

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun constructor() {
        val node = Node(0)
        assertThat(node.`val`, equalTo(0))
        assertThat(node.toString(), equalTo("[[0,null]]"))
    }

    @Test
    fun constructor2() {
        val node = Node(1)
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[[1,null]]"))
    }

    @Test
    fun constructor3() {
        val node = Node(1)
        node.next = Node(2)
        node.random = Node(3)
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[[1,3],[2,null]]"))
    }

    @Test
    fun constructor4() {
        val next = Node(2)
        next.next = Node(21)
        next.random = Node(22)
        val random = Node(3)
        random.random = Node(32)
        val node = Node(1)
        node.next = next
        node.random = random
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[[1,3],[2,2],[21,null]]"))
    }
}
