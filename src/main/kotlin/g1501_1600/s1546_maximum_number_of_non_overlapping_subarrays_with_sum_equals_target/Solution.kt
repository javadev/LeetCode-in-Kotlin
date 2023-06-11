package g1501_1600.s1546_maximum_number_of_non_overlapping_subarrays_with_sum_equals_target

// #Medium #Array #Hash_Table #Greedy #Prefix_Sum
class Solution {
    fun maxNonOverlapping(nums: IntArray, target: Int): Int {
        var culSum = 0
        var res = 0
        val map: MutableMap<Int, Int> = HashMap()
        map[0] = 0
        for (num in nums) {
            culSum += num
            if (map.containsKey(culSum - target)) {
                res = Math.max(res, map[culSum - target]!! + 1)
            }
            map[culSum] = res
        }
        return res
    }
}
