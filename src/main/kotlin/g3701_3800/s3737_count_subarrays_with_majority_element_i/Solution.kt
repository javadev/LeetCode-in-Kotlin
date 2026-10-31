package g3701_3800.s3737_count_subarrays_with_majority_element_i

// #Medium #Array #Hash_Table #Prefix_Sum #Counting #Divide_and_Conquer #Segment_Tree #Merge_Sort
// #Senior #Biweekly_Contest_169 #2026_04_26_Time_1_ms_(100.00%)_Space_46.96_MB_(57.62%)

class Solution {
    fun countMajoritySubarrays(a: IntArray, target: Int): Int {
        val n = a.size
        var pre = n + 1
        var res = 0
        val count = IntArray(2 * n + 2)
        val acc = IntArray(2 * n + 2)
        acc[pre] = 1
        count[pre] = acc[pre]
        for (i in a) {
            pre += (if (i == target) 1 else -1)
            count[pre]++
            acc[pre] = acc[pre - 1] + count[pre]
            res += acc[pre - 1]
        }
        return res
    }
}
