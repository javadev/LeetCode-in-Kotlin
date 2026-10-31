package com_github_leetcode

@Suppress("kotlin:S6512")
class NestedInteger {
    private var list: MutableList<NestedInteger>? = null
    private var integer: Int? = null

    constructor() {
        list = ArrayList()
    }

    constructor(list: MutableList<NestedInteger>?) {
        this.list = list
    }

    constructor(integer: Int?) {
        this.integer = integer
    }

    fun isInteger(): Boolean = integer != null

    fun getInteger(): Int? = integer

    fun getList(): List<NestedInteger>? = list

    fun add(nestedInteger: NestedInteger) {
        list!!.add(nestedInteger)
    }
}
