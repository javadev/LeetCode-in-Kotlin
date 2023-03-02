package g0701_0800.s0732_my_calendar_iii

// #Hard #Binary_Search #Design #Ordered_Set #Segment_Tree
// #2023_03_02_Time_294_ms_(100.00%)_Space_44.6_MB_(100.00%)

class MyCalendarThree {
    private val root: Node = Node(0, 1000000000, 0)

    fun book(start: Int, end: Int): Int {
        updateTree(root, start, end - 1)
        return root.`val`
    }

    private fun updateTree(root: Node?, start: Int, end: Int) {
        if (root == null) {
            return
        }
        if (root.low >= start && root.high <= end) {
            root.`val`++
            if (root.left != null) {
                updateTree(root.left, start, end)
            }
            if (root.right != null) {
                updateTree(root.right, start, end)
            }
            return
        }
        val mid = (root.low + root.high) / 2
        if (root.left == null) {
            root.left = Node(root.low, mid, root.`val`)
        }
        if (root.right == null) {
            root.right = Node(mid + 1, root.high, root.`val`)
        }
        if (start <= mid) {
            updateTree(root.left, start, end)
        }
        if (end > mid) {
            updateTree(root.right, start, end)
        }
        root.`val` = root.left!!.`val`.coerceAtLeast(root.right!!.`val`)
    }

    internal class Node(var low: Int, var high: Int, var `val`: Int) {
        var left: Node? = null
        var right: Node? = null
    }
}

/*
 * Your MyCalendarThree object will be instantiated and called as such:
 * var obj = MyCalendarThree()
 * var param_1 = obj.book(startTime,endTime)
 */
