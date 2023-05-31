package g1101_1200.s1124_longest_well_performing_interval

// #Medium #Array #Hash_Table #Stack #Prefix_Sum #Monotonic_Stack
// #2023_05_31_Time_313_ms_(100.00%)_Space_57.1_MB_(100.00%)

class Solution {
    fun longestWPI(hours: IntArray): Int {
        var i = 0
        val map = HashMap<Int, Int>()
        var sum = 0
        map[sum] = -1
        var max = Int.MIN_VALUE
        for (`val` in hours) {
            sum += if (`val` > 8) 1 else -1
            if (!map.containsKey(sum)) {
                map[sum] = i
            }
            if (sum > 0) {
                max = i + 1
            } else if (map.containsKey(sum - 1)) {
                max = Math.max(i - map[sum - 1]!!, max)
            }
            i++
        }
        if (max == Int.MIN_VALUE) {
            max = 0
        }
        return max
    }
}
