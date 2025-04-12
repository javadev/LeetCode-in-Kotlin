package g3001_3100.s3092_most_frequent_ids

// #Medium #Array #Hash_Table #Heap_Priority_Queue #Ordered_Set
// #2024_04_18_Time_758_ms_(100.00%)_Space_61.1_MB_(98.25%)

import kotlin.math.max

class Solution {
    fun mostFrequentIDs(nums: IntArray, freq: IntArray): LongArray {
        var max = Int.MIN_VALUE
        val n = nums.size
        for (num in nums) {
            max = max(max, num)
        }
        val bins = LongArray(max + 1)
        var mostFrequentID = 0
        var maxCount: Long = 0
        val ans = LongArray(n)
        for (i in 0 until n) {
            bins[nums[i]] += freq[i].toLong()
            if (freq[i] > 0) {
                if (bins[nums[i]] > maxCount) {
                    maxCount = bins[nums[i]]
                    mostFrequentID = nums[i]
                }
            } else {
                if (nums[i] == mostFrequentID) {
                    maxCount = bins[nums[i]]
                    for (j in 0..max) {
                        if (bins[j] > maxCount) {
                            maxCount = bins[j]
                            mostFrequentID = j
                        }
                    }
                }
            }
            ans[i] = maxCount
        }
        return ans
    }
}
