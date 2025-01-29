package g0201_0300.s0219_contains_duplicate_ii

// #Easy #Array #Hash_Table #Sliding_Window #Top_Interview_150_Hashmap
// #2022_10_25_Time_813_ms_(80.46%)_Space_71.1_MB_(81.22%)

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
