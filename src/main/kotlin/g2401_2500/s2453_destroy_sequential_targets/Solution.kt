package g2401_2500.s2453_destroy_sequential_targets

// #Medium #Array #Hash_Table #Counting #2023_07_04_Time_681_ms_(100.00%)_Space_62_MB_(100.00%)

class Solution {
    fun destroyTargets(nums: IntArray, space: Int): Int {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            val reminder = num % space
            val freq = map.getOrDefault(reminder, 0)
            map[reminder] = freq + 1
        }
        var maxCount = 0
        var ans = Int.MAX_VALUE
        for (count in map.values) {
            maxCount = Math.max(count, maxCount)
        }
        for (`val` in nums) {
            if (map[`val` % space] == maxCount) {
                ans = Math.min(ans, `val`)
            }
        }
        return ans
    }
}
