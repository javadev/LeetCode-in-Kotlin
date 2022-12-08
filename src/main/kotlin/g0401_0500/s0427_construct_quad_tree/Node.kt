package g0401_0500.s0427_construct_quad_tree

class Node(var `val`: Boolean, var isLeaf: Boolean) {
    var topLeft: Node?
    var topRight: Node?
    var bottomLeft: Node?
    var bottomRight: Node?

    init {
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
        return "[" + (if (node!!.isLeaf) "1" else "0") + "," + (if (node.`val`) "1" else "0") + "]"
    }
}
