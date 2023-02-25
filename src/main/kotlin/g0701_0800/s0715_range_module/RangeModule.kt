package g0701_0800.s0715_range_module

// #Hard #Design #Ordered_Set #Segment_Tree #2023_02_25_Time_638_ms_(58.33%)_Space_60.4_MB_(66.67%)

@Suppress("NAME_SHADOWING")
class RangeModule {
    private val head: Interval = Interval(0, 0)

    fun addRange(left: Int, right: Int) {
        var left = left
        var right = right
        var pos: Interval? = head
        while (pos!!.next != null && pos.next!!.end < left) {
            pos = pos.next
        }
        while (pos.next != null && pos.next!!.start <= right) {
            left = pos.next!!.start.coerceAtMost(left)
            right = pos.next!!.end.coerceAtLeast(right)
            removeNext(pos)
        }
        insert(pos, Interval(left, right))
    }

    fun queryRange(left: Int, right: Int): Boolean {
        var pos: Interval? = head
        while (pos != null) {
            if (left >= pos.start && right <= pos.end) {
                return true
            }
            pos = pos.next
        }
        return false
    }

    fun removeRange(left: Int, right: Int) {
        var pos: Interval? = head
        while (pos!!.next != null && pos.next!!.end <= left) {
            pos = pos.next
        }
        var prev = pos
        var curr = pos.next
        while (curr != null && curr.start < right) {
            if (curr.start < left) {
                insert(prev, Interval(curr.start, left))
                curr.start = left
                prev = prev!!.next
                curr = prev!!.next
                continue
            }
            if (right >= curr.end) {
                removeNext(prev)
                curr = prev!!.next
            } else {
                curr.start = right
                curr = curr.next
            }
        }
    }

    private fun insert(curr: Interval?, next: Interval) {
        next.next = curr!!.next
        curr.next = next
    }

    private fun removeNext(curr: Interval?) {
        val del = curr!!.next
        if (del != null) {
            curr.next = del.next
            del.next = null
        }
    }

    internal class Interval(var start: Int, var end: Int) {
        var next: Interval? = null
    }
}

/*
 * Your RangeModule object will be instantiated and called as such:
 * var obj = RangeModule()
 * obj.addRange(left,right)
 * var param_2 = obj.queryRange(left,right)
 * obj.removeRange(left,right)
 */
