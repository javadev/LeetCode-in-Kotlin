package com_github_leetcode

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NestedIntegerTest {
    @Test
    fun constructor() {
        val nestedInteger = NestedInteger()
        assertThat(nestedInteger.getInteger(), equalTo(null))
        assertThat(nestedInteger.isInteger(), equalTo(false))
    }

    @Test
    fun constructor2() {
        val list = mutableListOf(NestedInteger())
        val nestedInteger = NestedInteger(list)
        assertThat(nestedInteger.getInteger(), equalTo(null))
        assertThat(nestedInteger.getList(), equalTo(list))
    }

    @Test
    fun constructor3() {
        val nestedInteger = NestedInteger(1)
        assertThat(nestedInteger.getInteger(), equalTo(1))
        assertThat(nestedInteger.isInteger(), equalTo(true))
    }

    @Test
    fun add() {
        val nestedInteger = NestedInteger(ArrayList(listOf(NestedInteger(1))))
        nestedInteger.add(NestedInteger(2))
        assertThat(nestedInteger.getList()!!.size, equalTo(2))
        assertThat(nestedInteger.getList()!![0].getInteger(), equalTo(1))
        assertThat(nestedInteger.getList()!![1].getInteger(), equalTo(2))
    }
}
