package s0002.add.two.numbers

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var result: String = `val`.toString()
        var nextNode = next
        while (nextNode != null) {
            result += ", " + nextNode.`val`.toString()
            nextNode = nextNode.next
        }
        return result
    }
}
