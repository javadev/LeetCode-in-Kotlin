package g4001_4100.s4007_widest_possible_fence

// #Hard #Array #Hash_Table #Counting #Enumeration #Senior #Biweekly_Contest_188
// #2026_11_17_Time_214_ms_(100.00%)_Space_240.96_MB_(90.41%)

import kotlin.math.max

class Solution {
    fun maximumWidth(planks: IntArray): Int {
        val freqMap: MutableMap<Int, Int> = HashMap<Int, Int>()
        for (plank in planks) {
            freqMap.merge(plank, 1) { a: Int, b: Int -> Integer.sum(a, b) }
        }
        val n = freqMap.size
        var i = 0
        val nums = IntArray(n)
        val freq = IntArray(n)
        for ((key, value) in freqMap) {
            nums[i] = key
            freq[i++] = value
        }
        return getMax(n, nums, freq)
    }

    companion object {
        private fun getMax(n: Int, nums: IntArray, freq: IntArray): Int {
            val fence: MutableMap<Int, Int> = HashMap<Int, Int>(n * n)
            var max = 1
            for (right in 0..<n) {
                val curr = nums[right]
                val count = freq[right]
                max = max(
                    max,
                    fence.merge(curr, count) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }!!,
                )
                if (count > 1) {
                    max = max(
                        max,
                        fence.merge(
                            curr shl 1,
                            count shr 1,
                        ) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }!!,
                    )
                }
                for (left in right + 1..<n) {
                    max = max(
                        max,
                        fence.merge(
                            curr + nums[left],
                            kotlin.math.min(count, freq[left]),
                        ) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }!!,
                    )
                }
            }
            return max
        }
    }
}
