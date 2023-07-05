package g2401_2500.s2426_number_of_pairs_satisfying_inequality

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2023_07_05_Time_490_ms_(100.00%)_Space_56.3_MB_(66.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var cnt: LongArray
    private fun find(x: Int, n: Int): Long {
        var x = x
        var res: Long = 0
        x = x.coerceAtMost(n)
        while (x > 0) {
            res += cnt[x]
            x -= x and -x
        }
        return res
    }

    private fun update(x: Int, n: Int) {
        var x = x
        while (x <= n) {
            cnt[x] = cnt[x] + 1
            x += x and -x
        }
    }

    fun numberOfPairs(nums1: IntArray, nums2: IntArray, diff: Int): Long {
        val n = nums1.size
        val nums = IntArray(n)
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        for (i in 0 until n) {
            nums[i] = nums1[i] - nums2[i]
            min = min.coerceAtMost(nums[i])
            max = max.coerceAtLeast(nums[i])
        }
        max = max - min + 2
        var ans: Long = 0
        cnt = LongArray(50000)
        for (i in 0 until n) {
            nums[i] = nums[i] - min + 1
            ans += find(nums[i] + diff, max)
            update(nums[i], max)
        }
        return ans
    }
}
