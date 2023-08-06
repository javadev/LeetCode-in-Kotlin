package g2701_2800.s2799_count_complete_subarrays_in_an_array

// #Medium #Array #Hash_Table #Sliding_Window
// #2023_08_06_Time_206_ms_(96.97%)_Space_42.2_MB_(72.73%)

class Solution {
    fun countCompleteSubarrays(nums: IntArray): Int {
        val n = nums.size
        var map = IntArray(2001)
        var distinct = 0
        var last = 0
        for (i in 0 until n) {
            map[nums[i]]++
            if (map[nums[i]] == 1) {
                distinct++
                last = i
            }
        }
        map = IntArray(2001)
        for (i in 0..last) map[nums[i]]++
        var ans = 0
        for (i in 0 until n) {
            val curr = 1
            ans += n - last
            map[nums[i]]--
            if (map[nums[i]] == 0) {
                var possLast = 0
                var j = last + 1
                while (j < n && map[nums[i]] == 0) {
                    map[nums[j]]++
                    possLast = j
                    ++j
                }
                last = if (map[nums[i]] > 0) {
                    possLast
                } else break
            }
        }
        return ans
    }
}
