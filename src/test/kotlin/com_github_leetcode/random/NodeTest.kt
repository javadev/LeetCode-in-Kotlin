package com_github_leetcode.random

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun constructor() {
        val node = Node()
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(0))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[[0,null]]"))
    }

    @Test
    fun constructor2() {
        val node = Node(1)
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[[1,null]]"))
    }

    @Test
    fun constructor3() {
        val node = Node(1, Node(2), Node(3))
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[[1,3],[2,null]]"))
    }

    @Test
    fun constructor4() {
        val node = Node(
            1,
            Node(2, Node(21), Node(22)),
            Node(3, null, Node(32))
        )
        MatcherAssert.assertThat(node.`val`, CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(node.toString(), CoreMatchers.equalTo("[[1,3],[2,2],[21,null]]"))
    }
}
