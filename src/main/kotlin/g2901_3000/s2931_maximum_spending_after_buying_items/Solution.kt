package g2901_3000.s2931_maximum_spending_after_buying_items

// #Hard #Array #Sorting #Greedy #Matrix #Heap_Priority_Queue
// #2024_01_03_Time_541_ms_(93.75%)_Space_61.5_MB_(93.75%)

class Solution {
    private class Node {
        var `val`: Int = -1
        var next: Node? = null

        constructor(`val`: Int) {
            this.`val` = `val`
        }

        constructor()
    }

    fun maxSpending(values: Array<IntArray>): Long {
        val m = values.size
        val n = values[0].size
        val head = Node()
        var node: Node? = head
        for (j in n - 1 downTo 0) {
            node!!.next = Node(values[0][j])
            node = node.next
        }
        for (i in 1 until m) {
            node = head
            for (j in n - 1 downTo 0) {
                while (node!!.next != null && node.next!!.`val` <= values[i][j]) {
                    node = node.next
                }
                val next = node.next
                node.next = Node(values[i][j])
                node = node.next
                node!!.next = next
            }
        }
        var res: Long = 0
        var day: Long = 1
        node = head.next
        while (node != null) {
            res += day * node.`val`
            node = node.next
            day++
        }
        return res
    }
}
