package g1401_1500.s1472_design_browser_history

// #Medium #Array #Stack #Design #Linked_List #Data_Stream #Doubly_Linked_List
class BrowserHistory(homepage: String) {
    internal class Node(var url: String) {
        var prev: Node? = null
        var next: Node? = null
    }

    private var curr: Node?

    init {
        curr = Node(homepage)
    }

    fun visit(url: String) {
        val newNode = Node(url)
        curr!!.next = newNode
        newNode.prev = curr
        curr = curr!!.next
    }

    fun back(steps: Int): String {
        var steps = steps
        while (curr!!.prev != null && steps-- > 0) {
            curr = curr!!.prev
        }
        return curr!!.url
    }

    fun forward(steps: Int): String {
        var steps = steps
        while (curr!!.next != null && steps-- > 0) {
            curr = curr!!.next
        }
        return curr!!.url
    }
}
