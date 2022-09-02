package com_github_leetcode

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class TreeNodeTest {
    @Test
    fun create() {
        val treeNode = TreeNode.create(listOf(1))
        MatcherAssert.assertThat(treeNode!!.`val`, equalTo(1))
        MatcherAssert.assertThat(treeNode.toString(), equalTo("1"))
    }

    @Test
    fun create2() {
        val treeNode = TreeNode.create(listOf(1, 2))
        MatcherAssert.assertThat(treeNode!!.`val`, equalTo(1))
        MatcherAssert.assertThat(treeNode.toString(), equalTo("1,2,null"))
    }

    @Test
    fun create3() {
        val treeNode = TreeNode.create(listOf(1, 2, 3))
        MatcherAssert.assertThat(treeNode!!.`val`, equalTo(1))
        MatcherAssert.assertThat(treeNode.toString(), equalTo("1,2,3"))
    }

    @Test
    fun create4() {
        val treeNode = TreeNode.create(listOf(1, null, 2, 3))
        MatcherAssert.assertThat(treeNode!!.`val`, equalTo(1))
        MatcherAssert.assertThat(treeNode.toString(), equalTo("1,null,2,3,null"))
    }

    @Test
    fun create5() {
        val treeNode = TreeNode.create(listOf(1, 2, null, 3))
        MatcherAssert.assertThat(treeNode!!.`val`, equalTo(1))
        MatcherAssert.assertThat(treeNode.toString(), equalTo("1,2,3,null,null"))
    }

    @Test
    fun create6() {
        val treeNode = TreeNode.create(emptyList())
        MatcherAssert.assertThat(treeNode, equalTo(null))
    }

    @Test
    fun constructor() {
        val treeNode = TreeNode(1, null, null)
        MatcherAssert.assertThat(treeNode.`val`, equalTo(1))
        MatcherAssert.assertThat(treeNode.toString(), equalTo("1"))
    }
}
