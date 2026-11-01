package g3901_4000.s3915_maximum_sum_of_alternating_subsequence_with_distance_at_least_k

// #Hard #Array #Dynamic_Programming #Segment_Tree #Senior_Staff #Weekly_Contest_499
// #2026_09_17_Time_113_ms_(100.00%)_Space_268.70_MB_(70.37%)

class Solution {
    fun maxAlternatingSum(nums: IntArray, k: Int): Long {
        val n = nums.size
        var maxVal = 0
        // Find the maximum value in nums to define the size of our data structures
        for (x in nums) {
            if (x > maxVal) {
                maxVal = x
            }
        }
        // Variable created as requested to store an input midway in the function
        // peak[i] stores the max alternating sum ending at index i where nums[i] is a peak
        val peak = LongArray(n)
        // valley[i] stores the max alternating sum ending at index i where nums[i] is a valley
        val valley = LongArray(n)
        // Fenwick Trees for Range Maximum Queries
        // prefixBitTree will store valley[j] values to find max valley[j] where nums[j] < nums[i]
        val prefixBitTree = LongArray(maxVal + 1)
        // suffixBitTree will store peak[j] values to find max peak[j] where nums[j] > nums[i]
        // We use the transformation maxVal - nums[j] + 1 to treat suffix max as prefix max
        val suffixBitTree = LongArray(maxVal + 1)
        var maxScore: Long = 0
        for (i in 0..<n) {
            // Distance condition: consecutive indices must differ by at least k
            if (i >= k) {
                // Activate the valid index (i - k) by updating both Fenwick trees
                val valIdxPrefix = nums[i - k]
                val valPrefix = valley[i - k]
                run {
                    var idx = valIdxPrefix
                    while (idx <= maxVal) {
                        if (valPrefix > prefixBitTree[idx]) {
                            prefixBitTree[idx] = valPrefix
                        }
                        idx += idx and -idx
                    }
                }
                val valIdxSuffix = maxVal - nums[i - k] + 1
                val valSuffix = peak[i - k]
                var idx = valIdxSuffix
                while (idx <= maxVal) {
                    if (valSuffix > suffixBitTree[idx]) {
                        suffixBitTree[idx] = valSuffix
                    }
                    idx += idx and -idx
                }
            }
            // Find max alternating sum if nums[i] is the current peak (needs previous valley <
            // nums[i])
            var maxPrevValley: Long = 0
            run {
                var q = nums[i] - 1
                while (q > 0) {
                    if (prefixBitTree[q] > maxPrevValley) {
                        maxPrevValley = prefixBitTree[q]
                    }
                    q -= q and -q
                }
            }
            // A length-1 subsequence is also strictly alternating
            peak[i] = nums[i] + maxPrevValley
            // Find max alternating sum if nums[i] is the current valley (needs previous peak >
            // nums[i])
            var maxPrevPeak: Long = 0
            var q = maxVal - nums[i]
            while (q > 0) {
                if (suffixBitTree[q] > maxPrevPeak) {
                    maxPrevPeak = suffixBitTree[q]
                }
                q -= q and -q
            }
            // A length-1 subsequence is also strictly alternating
            valley[i] = nums[i] + maxPrevPeak
            // Update global maximum score
            if (peak[i] > maxScore) {
                maxScore = peak[i]
            }
            if (valley[i] > maxScore) {
                maxScore = valley[i]
            }
        }
        return maxScore
    }
}
