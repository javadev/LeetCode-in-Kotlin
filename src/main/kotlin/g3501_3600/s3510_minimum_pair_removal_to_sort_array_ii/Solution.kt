package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Simulation #Linked_List #Ordered_Set
// #Doubly_Linked_List #2025_04_09_Time_219_ms_(100.00%)_Space_108.86_MB_(9.09%)

class Solution {
    private class Segment {
        private val start: Int
        private val end: Int
        private var left: Segment? = null
        private var right: Segment? = null
        private var lIdx: Int = 0
        private var lNum: Long = 0
        private var rIdx: Int = 0
        private var rNum: Long = 0
        var ok: Boolean = false
        var minSum: Long = 0
        var li: Int = 0
        var ri: Int = 0

        companion object {
            fun init(arr: IntArray): Segment {
                return Segment(arr, 0, arr.size - 1)
            }
        }

        constructor(arr: IntArray, s: Int, e: Int) {
            start = s
            end = e
            if (s >= e) {
                lIdx = s
                rIdx = s
                lNum = arr[s].toLong()
                rNum = arr[s].toLong()
                minSum = Long.MAX_VALUE
                ok = true
                return
            }
            val mid = s + ((e - s) shr 1)
            left = Segment(arr, s, mid)
            right = Segment(arr, mid + 1, e)
            merge()
        }

        private fun merge() {
            left?.let { left ->
                right?.let { right ->
                    lIdx = left.lIdx
                    lNum = left.lNum
                    rIdx = right.rIdx
                    rNum = right.rNum
                    ok = left.ok && right.ok && left.rNum <= right.lNum
                    minSum = left.minSum
                    li = left.li
                    ri = left.ri
                    if (left.rNum + right.lNum < minSum) {
                        minSum = left.rNum + right.lNum
                        li = left.rIdx
                        ri = right.lIdx
                    }
                    if (right.minSum < minSum) {
                        minSum = right.minSum
                        li = right.li
                        ri = right.ri
                    }
                }
            }
        }

        fun update(i: Int, n: Long) {
            if (start <= i && end >= i) {
                if (start >= end) {
                    lNum = n
                    rNum = n
                } else {
                    left?.update(i, n)
                    right?.update(i, n)
                    merge()
                }
            }
        }

        fun remove(i: Int): Segment? {
            if (start > i || end < i) {
                return this
            } else if (start >= end) {
                return null
            }
            left = left?.remove(i)
            right = right?.remove(i)
            if (left == null) {
                return right
            } else if (right == null) {
                return left
            }
            merge()
            return this
        }
    }

    fun minimumPairRemoval(nums: IntArray): Int {
        var root = Segment.init(nums)
        var res = 0
        while (!root.ok) {
            val l = root.li
            val r = root.ri
            root.update(l, root.minSum)
            root = root.remove(r) ?: break
            res++
        }
        return res
    }
}
