package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list

class Node(var `val`: Int) {
    constructor(i: Int, node: Node?, node1: Node?, nothing: Node?) : this(i) {
        this.prev = node
        this.next = node1
        this.child = nothing
    }

    var prev: Node? = null
    var next: Node? = null
    var child: Node? = null

    override fun toString(): String {
        return "Node{val=$`val`,next=${this.next}}"
    }
}
