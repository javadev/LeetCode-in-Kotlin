package g1701_1800.s1748_sum_of_unique_elements

// #Easy #Array #Hash_Table #Counting #2023_06_16_Time_143_ms_(82.35%)_Space_34.1_MB_(82.35%)

class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        var sum = 0
        for (num: Int in nums) {
            map.put(num, map.getOrDefault(num, 0) + 1)
        }
        for (entry: Map.Entry<Int, Int> in map.entries) {
            if (entry.value == 1) {
                sum += entry.key
            }
        }
        return sum
    }
}
