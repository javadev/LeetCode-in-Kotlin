package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list

class Node(var `val`: Int) {
    var prev: Node? = null
    var next: Node? = null
    var child: Node? = null

    override fun toString(): String {
        return "Node{val=$`val`,next=${this.next}}"
    }
}
