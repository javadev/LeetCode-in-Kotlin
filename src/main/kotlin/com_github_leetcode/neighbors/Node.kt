package com_github_leetcode.neighbors

import java.util.StringJoiner

class Node(var `val`: Int) {
    constructor(i: Int, asList: List<Node>) : this(i) {
        this.neighbors = ArrayList(asList)
    }

    var neighbors: ArrayList<Node?> = ArrayList()

    override fun toString(): String {
        val result = StringJoiner(",", "[", "]")
        for (node in neighbors) {
            if (node!!.neighbors.isEmpty()) {
                result.add(node.`val`.toString())
            } else {
                val result2 = StringJoiner(",", "[", "]")
                for (nodeItem in node.neighbors) {
                    result2.add(nodeItem!!.`val`.toString())
                }
                result.add(result2.toString())
            }
        }
        return result.toString()
    }
}
