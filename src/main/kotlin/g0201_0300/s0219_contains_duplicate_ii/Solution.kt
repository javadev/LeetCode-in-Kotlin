package g0201_0300.s0219_contains_duplicate_ii

// #Easy #Array #Hash_Table #Sliding_Window #2022_07_02_Time_15_ms_(99.09%)_Space_56_MB_(82.82%)
class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map: MutableMap<Int, Int> = HashMap()
        val len = nums.size
        for (i in 0 until len) {
            val index = map.put(nums[i], i)
            if (index != null && Math.abs(index - i) <= k) {
                return true
            }
        }
        return false
    }
}
