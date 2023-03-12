package g0301_0400.s0352_data_stream_as_disjoint_intervals

// #Hard #Binary_Search #Design #Ordered_Set #2022_11_19_Time_905_ms_(75.00%)_Space_99.1_MB_(25.00%)

class SummaryRanges {
    private class Node(var min: Int) {
        var max: Int

        init {
            max = min
        }
    }

    private val list: MutableList<Node>

    init {
        list = ArrayList()
    }

    fun addNum(`val`: Int) {
        var left = 0
        var right = list.size - 1
        var index = list.size
        while (left <= right) {
            val mid = left + (right - left) / 2
            val node = list[mid]
            if (node.min <= `val` && `val` <= node.max) {
                return
            } else if (`val` < node.min) {
                index = mid
                right = mid - 1
            } else if (`val` > node.max) {
                left = mid + 1
            }
        }
        list.add(index, Node(`val`))
    }

    fun getIntervals(): Array<IntArray> {
        var i = 1
        while (i < list.size) {
            val prev = list[i - 1]
            val curr = list[i]
            if (curr.min == prev.max + 1) {
                prev.max = curr.max
                list.removeAt(i--)
            }
            i++
        }
        val len = list.size
        val res = Array(len) { IntArray(2) }
        for (j in 0 until len) {
            val node = list[j]
            res[j][0] = node.min
            res[j][1] = node.max
        }
        return res
    }
}

/*
 * Your SummaryRanges object will be instantiated and called as such:
 * var obj = SummaryRanges()
 * obj.addNum(value)
 * var param_2 = obj.getIntervals()
 */
