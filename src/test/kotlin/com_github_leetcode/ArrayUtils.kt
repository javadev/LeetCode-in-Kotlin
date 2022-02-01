package com_github_leetcode

import kotlin.collections.ArrayList

object ArrayUtils {
    fun getLists(expected: Array<IntArray>): List<List<Int>> {
        val expectedList: MutableList<List<Int>> = ArrayList()
        for (value in expected) {
            val expectedItem: MutableList<Int> = ArrayList()
            expectedList.add(expectedItem)
            for (item in value) {
                expectedItem.add(item)
            }
        }
        return expectedList
    }
}
