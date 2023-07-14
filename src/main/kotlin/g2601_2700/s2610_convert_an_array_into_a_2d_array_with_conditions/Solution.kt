package g2601_2700.s2610_convert_an_array_into_a_2d_array_with_conditions

// #Medium #Array #Hash_Table #2023_07_14_Time_240_ms_(88.24%)_Space_37.4_MB_(100.00%)

class Solution {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()
        val map = mutableMapOf<Int, Int>()
        var max = 0

        for (n in nums) {
            val count = map.getOrDefault(n, 0) + 1
            map[n] = count
            max = max.coerceAtLeast(count)
        }

        repeat(max) {
            val new = mutableListOf<Int>()
            for (e in map) {
                if (e.value != 0) {
                    new.add(e.key)
                    map[e.key] = e.value - 1
                }
            }
            ans.add(new)
        }

        return ans
    }
}
