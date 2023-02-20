package com_github_leetcode

class Employee(
    /** It's the unique id of each node; unique id of this employee  */
    var id: Int,
    /** the importance value of this employee  */
    var importance: Int,
    /** the id of direct subordinates  */
    var subordinates: List<Int> = listOf()
)
