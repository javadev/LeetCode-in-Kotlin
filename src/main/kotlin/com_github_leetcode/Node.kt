package com_github_leetcode

import java.util.StringJoiner
import kotlin.collections.ArrayList

class Node {
    var `val`: Int
    var neighbors: List<Node>

    constructor() {
        `val` = 0
        neighbors = ArrayList()
    }

    constructor(`val`: Int) {
        this.`val` = `val`
        neighbors = ArrayList()
    }

    constructor(`val`: Int, neighbors: List<Node>) {
        this.`val` = `val`
        this.neighbors = neighbors
    }

    override fun toString(): String {
        val result = StringJoiner(",", "[", "]")
        for (node in neighbors) {
            if (node.neighbors.isEmpty()) {
                result.add(node.`val`.toString())
            } else {
                val result2 = StringJoiner(",", "[", "]")
                for (nodeItem in node.neighbors) {
                    result2.add(nodeItem.`val`.toString())
                }
                result.add(result2.toString())
            }
        }
        return result.toString()
    }
}
