package g3701_3800.s3739_count_subarrays_with_majority_element_ii

// #Hard #Array #Hash_Table #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Merge_Sort #Senior_Staff
// #Biweekly_Contest_169 #2026_04_26_Time_3_ms_(100.00%)_Space_90.94_MB_(36.19%)

class Solution {
    fun countMajoritySubarrays(nums: IntArray, target: Int): Long {
        val n = nums.size
        var pre = n + 1
        val count = LongArray(2 * n + 2)
        val acc = LongArray(2 * n + 2)
        var res: Long = 0
        acc[pre] = 1
        count[pre] = acc[pre]
        for (a in nums) {
            pre += (if (a == target) 1 else -1)
            acc[pre] = ++count[pre] + acc[pre - 1]
            res += acc[pre - 1]
        }
        return res
    }
}
