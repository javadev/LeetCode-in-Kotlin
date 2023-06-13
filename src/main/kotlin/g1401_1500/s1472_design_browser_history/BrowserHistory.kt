package g1401_1500.s1472_design_browser_history

// #Medium #Array #Stack #Design #Linked_List #Data_Stream #Doubly_Linked_List
// #2023_06_13_Time_576_ms_(42.42%)_Space_69.1_MB_(54.55%)

@Suppress("NAME_SHADOWING")
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
/*
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */
