package com_github_leetcode

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
        return neighbors.joinToString(separator = ",", prefix = "[", postfix = "]") { node ->
            if (node.neighbors.isEmpty()) {
                node.`val`.toString()
            } else {
                node.neighbors.joinToString(separator = ",", prefix = "[", postfix = "]") { nodeItem ->
                    nodeItem.`val`.toString()
                }
            }
        }
    }
}
