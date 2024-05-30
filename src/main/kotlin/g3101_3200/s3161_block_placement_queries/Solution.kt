package g3101_3200.s3161_block_placement_queries

import kotlin.math.max

// #Hard #Array #Binary_Search #Segment_Tree #Binary_Indexed_Tree
// #2024_05_30_Time_137_ms_(99.38%)_Space_143.7_MB_(54.52%)

class Solution {
    private class Seg private constructor(private val start: Int, private val end: Int) {
        private var min = 0
        private var max = 0
        private var len = 0
        private var obstacle = false
        private lateinit var left: Seg
        private lateinit var right: Seg

        init {
            if (start < end) {
                val mid = start + ((end - start) shr 1)
                left = Seg(start, mid)
                right = Seg(mid + 1, end)
                refresh()
            }
        }

        fun set(i: Int) {
            if (i < start || i > end) {
                return
            } else if (i == start && i == end) {
                obstacle = true
                max = start
                min = max
                return
            }
            left.set(i)
            right.set(i)
            refresh()
        }

        private fun refresh() {
            if (left.obstacle) {
                min = left.min
                if (right.obstacle) {
                    max = right.max
                    len = max((right.min - left.max).toDouble(), max(left.len.toDouble(), right.len.toDouble()))
                        .toInt()
                } else {
                    max = left.max
                    len = max(left.len.toDouble(), (right.end - left.max).toDouble()).toInt()
                }
                obstacle = true
            } else if (right.obstacle) {
                min = right.min
                max = right.max
                len = max(right.len.toDouble(), (right.min - left.start).toDouble()).toInt()
                obstacle = true
            } else {
                len = end - start
            }
        }

        fun max(n: Int, t: IntArray) {
            if (end <= n) {
                t[0] = max(t[0].toDouble(), len.toDouble()).toInt()
                if (obstacle) {
                    t[1] = max
                }
                return
            }
            left.max(n, t)
            if (!right.obstacle || right.min >= n) {
                return
            }
            t[0] = max(t[0].toDouble(), (right.min - t[1]).toDouble()).toInt()
            right.max(n, t)
        }

        companion object {
            fun init(n: Int): Seg {
                return Seg(0, n)
            }
        }
    }

    fun getResults(queries: Array<IntArray>): List<Boolean> {
        var max = 0
        for (i in queries) {
            max = max(max.toDouble(), i[1].toDouble()).toInt()
        }
        val root = Seg.init(max)
        root.set(0)

        val res: MutableList<Boolean> = ArrayList(queries.size)
        for (i in queries) {
            if (i[0] == 1) {
                root.set(i[1])
            } else {
                val t = IntArray(2)
                root.max(i[1], t)
                res.add(max(t[0].toDouble(), (i[1] - t[1]).toDouble()) >= i[2])
            }
        }
        return res
    }
}
