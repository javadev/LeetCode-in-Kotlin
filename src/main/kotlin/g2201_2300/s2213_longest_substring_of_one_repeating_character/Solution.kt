package g2201_2300.s2213_longest_substring_of_one_repeating_character

// #Hard #Array #String #Ordered_Set #Segment_Tree
// #2025_03_27_Time_73_ms_(100.00%)_Space_73.52_MB_(100.00%)

class Solution {
    private lateinit var ca: CharArray

    fun longestRepeating(s: String, queryCharacters: String, queryIndices: IntArray): IntArray {
        ca = s.toCharArray()
        val result = IntArray(queryIndices.size)
        val root = SegmentTree(0, ca.size)
        for (i in queryIndices.indices) {
            ca[queryIndices[i]] = queryCharacters[i]
            root.update(queryIndices[i])
            result[i] = root.longest
        }
        return result
    }

    private inner class SegmentTree(val start: Int, val end: Int) {
        var longest: Int = 0
        var leftLength: Int = 0
        var rightLength: Int = 0
        private lateinit var left: SegmentTree
        private lateinit var right: SegmentTree

        init {
            if (end - start > 1) {
                val mid = (start + end) / 2
                left = SegmentTree(start, mid)
                right = SegmentTree(mid, end)
                merge()
            } else {
                longest = 1
                leftLength = 1
                rightLength = 1
            }
        }

        fun update(index: Int) {
            if (end - start == 1) return
            if (index < (left.end)) {
                left.update(index)
            } else {
                right.update(index)
            }
            merge()
        }

        private fun merge() {
            longest = maxOf(left.longest, right.longest)
            if (ca[left.end - 1] == ca[right.start]) {
                longest = maxOf(longest, left.rightLength + right.leftLength)
                leftLength = if (left.leftLength == left.end - left.start) {
                    left.leftLength + right.leftLength
                } else {
                    left.leftLength
                }
                rightLength = if (right.rightLength == (right.end - right.start)) {
                    right.rightLength + left.rightLength
                } else {
                    right.rightLength
                }
            } else {
                leftLength = left.leftLength
                rightLength = right.rightLength
            }
        }
    }
}
