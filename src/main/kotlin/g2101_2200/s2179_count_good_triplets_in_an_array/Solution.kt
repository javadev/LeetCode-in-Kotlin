package g2101_2200.s2179_count_good_triplets_in_an_array

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2023_06_26_Time_563_ms_(100.00%)_Space_62.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun goodTriplets(nums1: IntArray, nums2: IntArray): Long {
        val n = nums1.size
        val idx = IntArray(n)
        val arr = IntArray(n)
        for (i in 0 until n) {
            idx[nums2[i]] = i
        }
        for (i in 0 until n) {
            arr[i] = idx[nums1[i]]
        }
        val tree = Tree(n)
        var res = 0L
        for (i in 0 until n) {
            val smaller = tree.query(arr[i])
            val bigger = n - (arr[i] + 1) - (i - smaller)
            res += smaller.toLong() * bigger
            tree.update(arr[i] + 1, 1)
        }
        return res
    }

    private class Tree(var n: Int) {
        var array: IntArray

        init {
            array = IntArray(n + 1)
        }

        fun lowbit(x: Int): Int {
            return x and -x
        }

        fun update(i: Int, delta: Int) {
            var i = i
            while (i <= n) {
                array[i] += delta
                i += lowbit(i)
            }
        }

        fun query(k: Int): Int {
            var k = k
            var ans = 0
            while (k > 0) {
                ans += array[k]
                k -= lowbit(k)
            }
            return ans
        }
    }
}
