package com_github_leetcode.random

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun constructor() {
        val node = Node()
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
        val node = Node(1, Node(2), Node(3))
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[[1,3],[2,null]]"))
    }

    @Test
    fun constructor4() {
        val node = Node(
            1,
            Node(2, Node(21), Node(22)),
            Node(3, null, Node(32)),
        )
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[[1,3],[2,2],[21,null]]"))
    }
}
