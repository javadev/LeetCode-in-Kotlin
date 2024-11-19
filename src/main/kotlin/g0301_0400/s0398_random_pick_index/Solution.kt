package g0301_0400.s0398_random_pick_index

// #Medium #Hash_Table #Math #Randomized #Reservoir_Sampling
// #2022_11_29_Time_1091_ms_(75.00%)_Space_84.3_MB_(25.00%)

import kotlin.random.Random

@Suppress("kotlin:S2245")
class Solution(nums: IntArray) {
    // O(n) time | O(n) space
    private val map: MutableMap<Int, MutableList<Int>>

    init {
        map = HashMap()
        for (i in nums.indices) {
            map.computeIfAbsent(
                nums[i],
            ) { ArrayList() }.add(i)
        }
    }

    fun pick(target: Int): Int {
        val list: List<Int> = map[target]!!
        return list[Random.nextInt(list.size)]
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.pick(target)
 */
