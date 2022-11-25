package com_github_leetcode

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class NestedIntegerTest {
    @Test
    fun constructor() {
        val nestedInteger = NestedInteger()
        MatcherAssert.assertThat(nestedInteger.getInteger(), CoreMatchers.equalTo(null))
        MatcherAssert.assertThat(nestedInteger.isInteger(), CoreMatchers.equalTo(false))
    }

    @Test
    fun constructor2() {
        val list = mutableListOf(NestedInteger())
        val nestedInteger = NestedInteger(list)
        MatcherAssert.assertThat(nestedInteger.getInteger(), CoreMatchers.equalTo(null))
        MatcherAssert.assertThat(nestedInteger.getList(), CoreMatchers.equalTo(list))
    }

    @Test
    fun constructor3() {
        val nestedInteger = NestedInteger(1)
        MatcherAssert.assertThat(nestedInteger.getInteger(), CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(nestedInteger.isInteger(), CoreMatchers.equalTo(true))
    }

    @Test
    fun add() {
        val nestedInteger = NestedInteger(ArrayList(listOf(NestedInteger(1))))
        nestedInteger.add(NestedInteger(2))
        MatcherAssert.assertThat(nestedInteger.getList()!!.size, CoreMatchers.equalTo(2))
        MatcherAssert.assertThat(nestedInteger.getList()!![0].getInteger(), CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(nestedInteger.getList()!![1].getInteger(), CoreMatchers.equalTo(2))
    }
}
