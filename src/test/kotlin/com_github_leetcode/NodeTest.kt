package com_github_leetcode

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun constructor() {
        val node = Node()
        assertThat(node.`val`, equalTo(0))
        assertThat(node.toString(), equalTo("[]"))
    }

    @Test
    fun constructor2() {
        val node = Node(1)
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[]"))
    }

    @Test
    fun constructor3() {
        val node = Node(1, listOf(Node(2)))
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[2]"))
    }

    @Test
    fun constructor4() {
        val node = Node(
            1,
            listOf(
                Node(2, listOf(Node(3))),
            ),
        )
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("[[3]]"))
    }
}
