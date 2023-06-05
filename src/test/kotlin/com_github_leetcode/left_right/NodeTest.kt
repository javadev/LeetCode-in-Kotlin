package com_github_leetcode.left_right

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NodeTest {
    @Test
    fun constructor() {
        val node = Node(1)
        assertThat(node.`val`, equalTo(1))
        assertThat(node.toString(), equalTo("Node{val=1,left=null,right=null,next=null}"))
    }

    @Test
    fun constructor2() {
        val node = Node(1, Node(2), Node(3), Node(4))
        assertThat(node.`val`, equalTo(1))
        assertThat(
            node.toString(),
            equalTo(
                "Node{val=1,left=Node{val=2,left=null,right=null," +
                    "next=null},right=Node{val=3,left=null,right=null,next=null},next=Node{val=4," +
                    "left=null,right=null,next=null}}"
            )
        )
    }
}
