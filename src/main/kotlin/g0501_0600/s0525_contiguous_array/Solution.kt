package g0501_0600.s0525_contiguous_array

// #Medium #Array #Hash_Table #Prefix_Sum #2023_01_14_Time_471_ms_(100.00%)_Space_45.9_MB_(83.33%)

class Solution {
    fun findMaxLength(nums: IntArray): Int {
        for (i in nums.indices) {
            if (nums[i] == 0) {
                nums[i] = -1
            }
        }
        val map: HashMap<Int, Int> = HashMap()
        map[0] = -1
        var ps = 0
        var len = 0
        for (i in nums.indices) {
            ps += nums[i]
            if (!map.containsKey(ps)) {
                map[ps] = i
            } else {
                len = Math.max(len, i - map[ps]!!)
            }
        }
        return len
    }
}
