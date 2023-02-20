package com_github_leetcode

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class EmployeeTest {
    @Test
    fun constructor() {
        val employee = Employee(1, 2, listOf(2, 3))
        assertThat(employee.id, equalTo(1))
        assertThat(employee.importance, equalTo(2))
        assertThat(employee.subordinates, equalTo(listOf(2, 3)))
    }
}
