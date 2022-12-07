package com_github_leetcode

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun constructor() {
        val node = Node()
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(0))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[]"))
    }

    @Test
    fun constructor2() {
        val node = Node(1)
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[]"))
    }

    @Test
    fun constructor3() {
        val node: Node = Node(1, listOf(Node(2)))
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[2]"))
    }

    @Test
    fun constructor4() {
        val node: Node = Node(
            1,
            listOf(
                Node(2, listOf(Node(3)))
            )
        )
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[[3]]"))
    }
}
