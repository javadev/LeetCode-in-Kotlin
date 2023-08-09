package g2701_2800.s2780_minimum_index_of_a_valid_split

// #Medium #Array #Hash_Table #Sorting #2023_08_09_Time_640_ms_(91.67%)_Space_61.6_MB_(95.83%)

class Solution {
    fun minimumIndex(nums: List<Int>): Int {
        val map = HashMap<Int, Int>()
        map[0] = 0
        var max = 0
        val m = nums.size
        for (n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
            if (map[n]!! > map[max]!!) {
                max = n
            }
        }
        var freq = 0
        for (i in 0 until m) {
            if (nums[i] == max) {
                freq++
            }
            if (freq * 2 > i + 1 && (map[max]!! - freq) * 2 > m - i - 1) {
                return i
            }
        }
        return -1
    }
}
