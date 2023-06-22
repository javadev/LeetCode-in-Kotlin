package g1801_1900.s1889_minimum_space_wasted_from_packaging

// #Hard #Array #Sorting #Binary_Search #Prefix_Sum
// #2023_06_22_Time_910_ms_(100.00%)_Space_67.5_MB_(100.00%)

class Solution {
    fun minWastedSpace(packages: IntArray, boxes: Array<IntArray>): Int {
        val numPackages = packages.size
        packages.sort()
        val preSum = LongArray(numPackages)
        preSum[0] = packages[0].toLong()
        for (i in 1 until packages.size) {
            preSum[i] = packages[i] + preSum[i - 1]
        }
        var ans = Long.MAX_VALUE
        for (box in boxes) {
            box.sort()
            // Box of required size not present
            if (packages[numPackages - 1] > box[box.size - 1]) {
                continue
            }
            // Find the total space wasted
            var totalWastedSpace: Long = 0
            var prev = -1
            for (j in box) {
                if (prev == packages.size - 1) {
                    break
                }
                if (j < packages[0] || j < packages[prev + 1]) {
                    continue
                }
                // Find up to which package the current box can fit
                val upper = findUpperBound(packages, j)
                if (upper == -1) {
                    continue
                }
                // The current box will be able to handle the packages from
                // prev + 1 to the upper index
                val totalSpace = (upper.toLong() - prev.toLong()) * j
                val packageSum = preSum[upper] - if (prev >= 0) preSum[prev] else 0
                val spaceWastedCurr = totalSpace - packageSum
                totalWastedSpace += spaceWastedCurr
                prev = upper
            }
            ans = Math.min(ans, totalWastedSpace)
        }
        return if (ans == Long.MAX_VALUE) -1 else (ans % MOD).toInt()
    }

    private fun findUpperBound(packages: IntArray, key: Int): Int {
        var l = 0
        var h = packages.size
        while (l < h) {
            val m = l + (h - l) / 2
            if (packages[m] <= key) {
                l = m + 1
            } else {
                h = m
            }
        }
        return h - 1
    }

    companion object {
        private const val MOD = 1000000007
    }
}
