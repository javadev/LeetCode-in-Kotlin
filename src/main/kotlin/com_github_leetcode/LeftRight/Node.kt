package com_github_leetcode.LeftRight

class Node(var `val`: Int) {
    constructor(i: Int, node: Node?, node1: Node?, nothing: Node?) : this(i) {
        this.left = node
        this.right = node1
        this.next = nothing
    }

    var left: Node? = null
    var right: Node? = null
    var next: Node? = null

    override fun toString(): String {
        return "Node{val=$`val`,left=$left,right=$right,next=$next}"
    }
}