package com_github_leetcode.neighbors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun create() {
        val node = com_github_leetcode.Node(1)
        MatcherAssert.assertThat(node.`val`, equalTo(1))
    }

    @Test
    fun create2() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        val node4 = Node(4)
        val node1and2and4 = Node(1, listOf(node2, node4))
        val node2and1and3 = Node(2, listOf(node1, node3))
        val node3and2and4 = Node(3, listOf(node2, node4))
        val node4and1and3 = Node(4, listOf(node1, node3))
        val node = Node(
            5,
            listOf(node1and2and4, node2and1and3, node3and2and4, node4and1and3)
        )
        MatcherAssert.assertThat(node.toString(), equalTo("[[2,4],[1,3],[2,4],[1,3]]"))
    }
}
