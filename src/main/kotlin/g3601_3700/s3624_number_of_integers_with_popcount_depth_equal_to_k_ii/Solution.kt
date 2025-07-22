package g3601_3700.s3624_number_of_integers_with_popcount_depth_equal_to_k_ii

// #Hard #Array #Segment_Tree #Weekly_Contest_459
// #2025_07_22_Time_38_ms_(100.00%)_Space_134.15_MB_(100.00%)

class Solution {
    private fun computeDepth(number: Long): Int {
        if (number == 1L) {
            return 0
        }
        return 1 + DEPTH_TABLE[java.lang.Long.bitCount(number)]
    }

    fun popcountDepth(nums: LongArray, queries: Array<LongArray>): IntArray {
        val len = nums.size
        val maxDepth = 6
        val trees = Array(maxDepth) { FenwickTree() }
        for (d in 0..<maxDepth) {
            trees[d].build(len)
        }
        for (i in 0..<len) {
            val depth = computeDepth(nums[i])
            if (depth < maxDepth) {
                trees[depth].update(i + 1, 1)
            }
        }
        val ansList = ArrayList<Int?>()
        for (query in queries) {
            val type = query[0].toInt()
            if (type == 1) {
                val left = query[1].toInt()
                val right = query[2].toInt()
                val depth = query[3].toInt()
                if (depth >= 0 && depth < maxDepth) {
                    ansList.add(trees[depth].queryRange(left + 1, right + 1))
                } else {
                    ansList.add(0)
                }
            } else if (type == 2) {
                val index = query[1].toInt()
                val newVal = query[2]
                val oldDepth = computeDepth(nums[index])
                if (oldDepth < maxDepth) {
                    trees[oldDepth].update(index + 1, -1)
                }
                nums[index] = newVal
                val newDepth = computeDepth(newVal)
                if (newDepth < maxDepth) {
                    trees[newDepth].update(index + 1, 1)
                }
            }
        }
        val ansArray = IntArray(ansList.size)
        for (i in ansList.indices) {
            ansArray[i] = ansList[i]!!
        }
        return ansArray
    }

    private class FenwickTree {
        private lateinit var tree: IntArray
        private var size = 0

        fun build(n: Int) {
            this.size = n
            this.tree = IntArray(size + 1)
        }

        fun update(index: Int, value: Int) {
            var index = index
            while (index <= size) {
                tree[index] += value
                index += index and (-index)
            }
        }

        fun query(index: Int): Int {
            var index = index
            var result = 0
            while (index > 0) {
                result += tree[index]
                index -= index and (-index)
            }
            return result
        }

        fun queryRange(left: Int, right: Int): Int {
            if (left > right) {
                return 0
            }
            return query(right) - query(left - 1)
        }
    }

    companion object {
        private val DEPTH_TABLE = IntArray(65)

        init {
            DEPTH_TABLE[1] = 0
            for (i in 2..64) {
                DEPTH_TABLE[i] = 1 + DEPTH_TABLE[Integer.bitCount(i)]
            }
        }
    }
}
