package com_github_leetcode.children

import java.util.StringJoiner

class Node(var `val`: Int) {
    constructor(i: Int, asList: List<Node>) : this(i) {
        this.children = ArrayList(asList)
    }

    var children: ArrayList<Node?> = ArrayList()

    override fun toString(): String {
        val result = StringJoiner(",", "[", "]")
        for (node in children) {
            if (node!!.children.isEmpty()) {
                result.add(node.`val`.toString())
            } else {
                val result2 = StringJoiner(",", "[", "]")
                for (nodeItem in node.children) {
                    result2.add(nodeItem!!.`val`.toString())
                }
                result.add(result2.toString())
            }
        }
        return result.toString()
    }
}
