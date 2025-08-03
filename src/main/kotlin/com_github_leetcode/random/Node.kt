package com_github_leetcode.random

class Node {
    var `val`: Int
    var next: Node? = null
    var random: Node? = null

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    override fun toString(): String {
        val result = StringBuilder()
        result.append("[")
        result.append("[")
        result.append(`val`)
        result.append(",")
        if (random == null) {
            result.append("null")
        } else {
            result.append(random!!.`val`)
        }
        result.append("]")
        var curr = next
        while (curr != null) {
            result.append(",")
            result.append("[")
            result.append(curr.`val`)
            result.append(",")
            if (curr.random == null) {
                result.append("null")
            } else {
                var randomIndex = 0
                var indexFinder: Node? = this
                while (indexFinder!!.next != null && indexFinder !== curr.random) {
                    randomIndex++
                    indexFinder = indexFinder.next
                }
                result.append(randomIndex)
            }
            result.append("]")
            curr = curr.next
        }
        result.append("]")
        return result.toString()
    }
}
