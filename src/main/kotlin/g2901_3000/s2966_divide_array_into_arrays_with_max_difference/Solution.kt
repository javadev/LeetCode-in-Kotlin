package g2901_3000.s2966_divide_array_into_arrays_with_max_difference

// #Medium #Array #Sorting #Greedy #2024_01_19_Time_977_ms_(60.00%)_Space_76.7_MB_(24.00%)

class Solution {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        nums.sort()
        val n = nums.size
        val triplets = n / 3
        val result = Array(triplets) { intArrayOf() }
        var i = 0
        var j = 0
        while (i < n) {
            val first = nums[i]
            val third = nums[i + 2]
            if (third - first > k) {
                return Array(0) { intArrayOf() }
            }
            result[j] = intArrayOf(first, nums[i + 1], third)
            i += 3
            j++
        }
        return result
    }
}
