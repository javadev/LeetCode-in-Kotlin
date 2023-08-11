package g2501_2600.s2588_count_the_number_of_beautiful_subarrays

// #Medium #Array #Hash_Table #Bit_Manipulation #Prefix_Sum
// #2023_07_12_Time_785_ms_(100.00%)_Space_56.5_MB_(100.00%)

class Solution {
    fun beautifulSubarrays(nums: IntArray): Long {
        val map = mutableMapOf<Int, Int>()
        map[0] = 1
        var res = 0L
        var sum = 0
        for (v in nums) {
            sum = sum xor v
            val count = map.getOrDefault(sum, 0)
            res += count
            map[sum] = count + 1
        }
        return res
    }
}
