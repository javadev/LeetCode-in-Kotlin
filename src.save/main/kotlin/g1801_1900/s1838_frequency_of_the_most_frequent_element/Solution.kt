package g1801_1900.s1838_frequency_of_the_most_frequent_element

// #Medium #Array #Sorting #Greedy #Binary_Search #Prefix_Sum #Sliding_Window
// #Binary_Search_II_Day_9 #2023_06_22_Time_564_ms_(88.89%)_Space_50.8_MB_(100.00%)

class Solution {
    fun maxFrequency(nums: IntArray, k: Int): Int {
        countingSort(nums)
        var start = 0
        var preSum = 0
        var total = 1
        for (i in nums.indices) {
            var length = i - start + 1
            var product = nums[i] * length
            preSum += nums[i]
            while (product - preSum > k) {
                preSum -= nums[start++]
                length--
                product = nums[i] * length
            }
            total = total.coerceAtLeast(length)
        }
        return total
    }

    private fun countingSort(nums: IntArray) {
        var max = Int.MIN_VALUE
        for (num in nums) {
            max = max.coerceAtLeast(num)
        }
        val map = IntArray(max + 1)
        for (num in nums) {
            map[num]++
        }
        var i = 0
        var j = 0
        while (i <= max) {
            if (map[i]-- > 0) {
                nums[j++] = i
            } else {
                i++
            }
        }
    }
}
