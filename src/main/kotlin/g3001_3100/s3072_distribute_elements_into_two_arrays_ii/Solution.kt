package g3001_3100.s3072_distribute_elements_into_two_arrays_ii

// #Hard #Array #Simulation #Segment_Tree #Binary_Indexed_Tree
// #2024_04_16_Time_890_ms_(100.00%)_Space_77.6_MB_(54.17%)

@Suppress("NAME_SHADOWING")
class Solution {
    internal inner class BIT(size: Int) {
        private val tree = IntArray(size + 1)

        fun update(ind: Int) {
            var ind = ind
            while (ind < tree.size) {
                tree[ind]++
                ind += lsb(ind)
            }
        }

        fun rsq(ind: Int): Int {
            var ind = ind
            var sum = 0
            while (ind > 0) {
                sum += tree[ind]
                ind -= lsb(ind)
            }
            return sum
        }

        private fun lsb(n: Int): Int {
            return n and (-n)
        }
    }

    fun resultArray(source: IntArray): IntArray {
        val nums = shrink(source)
        val arr1 = IntArray(nums.size)
        val arr2 = IntArray(nums.size)
        arr1[0] = source[0]
        arr2[0] = source[1]
        var p1 = 0
        var p2 = 0
        val bit1 = BIT(nums.size)
        bit1.update(nums[0])
        val bit2 = BIT(nums.size)
        bit2.update(nums[1])
        for (i in 2 until nums.size) {
            val g1 = p1 + 1 - bit1.rsq(nums[i])
            val g2 = p2 + 1 - bit2.rsq(nums[i])
            if (g1 > g2) {
                p1++
                arr1[p1] = source[i]
                bit1.update(nums[i])
            } else if (g1 < g2) {
                p2++
                arr2[p2] = source[i]
                bit2.update(nums[i])
            } else if (p1 < p2) {
                p1++
                arr1[p1] = source[i]
                bit1.update(nums[i])
            } else if (p1 > p2) {
                p2++
                arr2[p2] = source[i]
                bit2.update(nums[i])
            } else {
                p1++
                arr1[p1] = source[i]
                bit1.update(nums[i])
            }
        }
        for (i in p1 + 1 until arr1.size) {
            arr1[i] = arr2[i - p1 - 1]
        }

        return arr1
    }

    private fun shrink(nums: IntArray): IntArray {
        val b = LongArray(nums.size)
        for (i in nums.indices) {
            b[i] = nums[i].toLong() shl 32 or i.toLong()
        }
        b.sort()
        val result = IntArray(nums.size)
        var p = 1
        for (i in nums.indices) {
            if (i > 0 && (b[i] xor b[i - 1]) shr 32 != 0L) {
                p++
            }
            result[b[i].toInt()] = p
        }
        return result
    }
}
