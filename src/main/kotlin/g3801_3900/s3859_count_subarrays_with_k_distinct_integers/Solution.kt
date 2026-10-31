package g3801_3900.s3859_count_subarrays_with_k_distinct_integers

// #Hard #Array #Hash_Table #Counting #Sliding_Window #Senior_Staff #Weekly_Contest_491
// #2026_07_27_Time_36_ms_(88.89%)_Space_77.36_MB_(87.65%)

class Solution {
    fun countSubarrays(nums: IntArray, k: Int, m: Int): Long {
        var left = 0
        var p = 0
        var subArr: Long = 0
        val map = HashMap<Int?, Int?>()
        var valid = 0
        for (`val` in nums) {
            map.put(`val`, map.getOrDefault(`val`, 0)!! + 1)
            if (map.get(`val`) == m) {
                valid++
            }
            val state = shrinkDistinct(nums, left, p, k, m, map, valid)
            left = state.left()
            p = state.p()
            valid = state.valid()
            val duplicateState = trimDuplicates(nums, left, p, m, map)
            left = duplicateState.left()
            p = duplicateState.p()
            if (map.size == k && valid == k) {
                subArr += (1 + p).toLong()
            }
        }
        return subArr
    }

    private fun shrinkDistinct(
        nums: IntArray,
        left: Int,
        p: Int,
        k: Int,
        m: Int,
        map: MutableMap<Int?, Int?>,
        valid: Int,
    ): WindowState {
        var left = left
        var p = p
        var valid = valid
        while (map.size > k) {
            val lv = nums[left]
            if (map.get(lv) == m) {
                valid--
            }
            map.put(lv, map.get(lv)!! - 1)
            if (map.get(lv) == 0) {
                map.remove(lv)
            }
            left++
            p = 0
        }
        return WindowState(left, p, valid)
    }

    private fun trimDuplicates(nums: IntArray, left: Int, p: Int, m: Int, map: MutableMap<Int?, Int?>): WindowState {
        var left = left
        var p = p
        while (!map.isEmpty() && map.get(nums[left])!! > m) {
            val lv = nums[left]
            map.put(lv, map.get(lv)!! - 1)
            left++
            p++
        }
        return WindowState(left, p, 0)
    }

    private class WindowState(private val left: Int, private val p: Int, private val valid: Int) {
        fun left(): Int = left

        fun p(): Int = p

        fun valid(): Int = valid
    }
}
