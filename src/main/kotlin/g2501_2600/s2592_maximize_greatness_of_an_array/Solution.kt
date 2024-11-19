package g2501_2600.s2592_maximize_greatness_of_an_array

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2023_07_12_Time_748_ms_(100.00%)_Space_65.2_MB_(100.00%)

import java.util.TreeMap

class Solution {
    fun maximizeGreatness(nums: IntArray): Int {
        val map = TreeMap<Int, Int>()
        for (num in nums) map.compute(num) { _, n -> (n ?: 0) + 1 }

        var count = 0
        for (num in nums) {
            val entry = map.higherEntry(num)
            if (entry != null && entry.key != num) {
                count++
                if (entry.value - 1 == 0) {
                    map.remove(entry.key)
                } else {
                    map[entry.key] = entry.value - 1
                }
            }
        }

        return count
    }
}
