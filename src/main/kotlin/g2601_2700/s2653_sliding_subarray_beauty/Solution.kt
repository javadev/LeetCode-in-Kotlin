package g2601_2700.s2653_sliding_subarray_beauty

// #Medium #Array #Hash_Table #Sliding_Window
// #2023_07_20_Time_1264_ms_(66.67%)_Space_64.2_MB_(100.00%)

class Solution {
    fun getSubarrayBeauty(nums: IntArray, k: Int, x: Int): IntArray {
        val freqCounter = IntArray(50)
        var index = 0
        val results = IntArray(nums.size - k + 1)
        for (i in 0 until k) {
            if (nums[i] < 0) {
                freqCounter[nums[i] + 50]++
            }
        }
        results[index++] = getXthSmallest(freqCounter, x)
        while (index < results.size) {
            if (nums[index - 1] < 0) {
                freqCounter[nums[index - 1] + 50]--
            }
            if (nums[index + k - 1] < 0) {
                freqCounter[nums[index + k - 1] + 50]++
            }
            results[index++] = getXthSmallest(freqCounter, x)
        }
        return results
    }

    private fun getXthSmallest(freqCounter: IntArray, x: Int): Int {
        var count = 0
        for (i in 0..49) {
            count += freqCounter[i]
            if (count >= x) {
                return i - 50
            }
        }
        return 0
    }
}
