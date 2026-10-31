package g3801_3900.s3852_smallest_pair_with_different_frequencies

// #Easy #Array #Hash_Table #Counting #Mid_Level #Biweekly_Contest_177
// #2026_07_22_Time_1_ms_(100.00%)_Space_46.80_MB_(62.33%)

class Solution {
    fun minDistinctFreqPair(nums: IntArray): IntArray? {
        val freq = IntArray(101)
        for (num in nums) {
            freq[num]++
        }
        var first = -1
        var second = -1
        for (i in 1..100) {
            if (freq[i] != 0) {
                if (first == -1) {
                    first = i
                } else if (freq[i] != freq[first]) {
                    second = i
                    break
                }
            }
        }
        return if (second == -1) intArrayOf(-1, -1) else intArrayOf(first, second)
    }
}
