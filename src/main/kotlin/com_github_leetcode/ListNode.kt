package com_github_leetcode

import java.util.Objects

class ListNode {
    var `val` = 0
    var next: ListNode? = null

    constructor() {}

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }

    override fun toString(): String {
        val result = StringBuilder("" + `val`)
        if (Objects.nonNull(next)) {
            var current = next
            while (current!!.next != null) {
                result.append(", ")
                result.append(current.`val`)
                current = current.next
            }
            result.append(", ")
            result.append(current.`val`)
        }
        return result.toString()
    }
}
