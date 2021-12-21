package g0001_0100.s0002_add_two_numbers

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
