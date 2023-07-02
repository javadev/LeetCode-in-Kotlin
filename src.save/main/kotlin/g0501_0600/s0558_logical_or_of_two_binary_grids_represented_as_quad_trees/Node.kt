package g0501_0600.s0558_logical_or_of_two_binary_grids_represented_as_quad_trees

/*
 * Definition for a QuadTree node.
 * class Node(var `val`: Boolean, var isLeaf: Boolean) {
 *     var topLeft: Node? = null
 *     var topRight: Node? = null
 *     var bottomLeft: Node? = null
 *     var bottomRight: Node? = null
 * }
 */

class Node {
    var `val` = false
    var isLeaf = false
    var topLeft: Node? = null
    var topRight: Node? = null
    var bottomLeft: Node? = null
    var bottomRight: Node? = null

    constructor() {
        // empty constructor
    }

    constructor(`val`: Boolean, isLeaf: Boolean) {
        this.`val` = `val`
        this.isLeaf = isLeaf
        topLeft = null
        topRight = null
        bottomLeft = null
        bottomRight = null
    }

    override fun toString(): String {
        return (
            getNode(this) +
                getNode(topLeft) +
                getNode(topRight) +
                getNode(bottomLeft) +
                getNode(bottomRight)
            )
    }

    private fun getNode(node: Node?): String {
        val isLeafLocal = if (node!!.isLeaf) "1" else "0"
        val valLocal = if (node.`val`) "1" else "0"
        return "[$isLeafLocal,$valLocal]"
    }
}
