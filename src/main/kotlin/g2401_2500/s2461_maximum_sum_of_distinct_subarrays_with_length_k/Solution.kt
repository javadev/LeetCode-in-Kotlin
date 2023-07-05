package g2401_2500.s2461_maximum_sum_of_distinct_subarrays_with_length_k

// #Medium #Array #Hash_Table #Sliding_Window
// #2023_07_05_Time_638_ms_(62.50%)_Space_59.5_MB_(62.50%)

class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        val seen: MutableSet<Int> = HashSet()
        var sum: Long = 0
        var current: Long = 0
        var i = 0
        var j = 0
        while (j < nums.size) {
            while (seen.contains(nums[j])) {
                val `val` = nums[i++]
                seen.remove(`val`)
                current -= `val`.toLong()
            }
            seen.add(nums[j])
            current += nums[j].toLong()
            j++
            if (seen.size == k) {
                sum = Math.max(sum, current)
                current -= nums[i].toLong()
                seen.remove(nums[i])
                i++
            }
        }
        return sum
    }
}
