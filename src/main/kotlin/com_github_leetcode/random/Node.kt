package com_github_leetcode.random

import java.util.StringJoiner

class Node {
    var `val`: Int
    var next: Node? = null
    var random: Node? = null

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    override fun toString(): String {
        val result = StringJoiner(",", "[", "]")
        val result2 = StringJoiner(",", "[", "]")
        result2.add(`val`.toString())
        if (random == null) {
            result2.add("null")
        } else {
            result2.add(random!!.`val`.toString())
        }
        result.add(result2.toString())
        var curr = next
        while (curr != null) {
            val result3 = StringJoiner(",", "[", "]")
            result3.add(curr.`val`.toString())
            if (curr.random == null) {
                result3.add("null")
            } else {
                var randomIndex = 0
                var curr2: Node? = this
                while (curr2!!.next != null && curr2 !== curr.random) {
                    randomIndex += 1
                    curr2 = curr2.next
                }
                result3.add(randomIndex.toString())
            }
            result.add(result3.toString())
            curr = curr.next
        }
        return result.toString()
    }
}
