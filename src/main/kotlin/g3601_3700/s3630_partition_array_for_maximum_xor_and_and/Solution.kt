package g3601_3700.s3630_partition_array_for_maximum_xor_and_and

// #Hard #Weekly_Contest_460 #2025_07_27_Time_72_ms_(100.00%)_Space_52.17_MB_(100.00%)

class Solution {
    fun maximizeXorAndXor(nums: IntArray): Long {
        val n = nums.size
        val full = 1 shl n
        val xorMask = IntArray(full)
        val andMask = IntArray(full)
        val orMask = IntArray(full)
        for (mask in 1..<full) {
            val lb = mask and -mask
            val i = Integer.numberOfTrailingZeros(lb)
            val prev = mask xor lb
            xorMask[mask] = xorMask[prev] xor nums[i]
            andMask[mask] = if (prev == 0) nums[i] else andMask[prev] and nums[i]
            orMask[mask] = orMask[prev] or nums[i]
        }
        var best: Long = 0
        val all = full - 1
        for (b in 0..<full) {
            val andB = andMask[b].toLong()
            val rest = all xor b
            if (andB + 2L * orMask[rest] <= best) {
                continue
            }
            var a = rest
            while (true) {
                val c = rest xor a
                val sum = xorMask[a] + andB + xorMask[c]
                if (sum > best) {
                    best = sum
                }
                if (a == 0) {
                    break
                }
                a = (a - 1) and rest
            }
        }
        return best
    }
}
