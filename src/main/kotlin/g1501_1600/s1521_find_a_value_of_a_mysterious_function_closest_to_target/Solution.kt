package g1501_1600.s1521_find_a_value_of_a_mysterious_function_closest_to_target

// #Hard #Array #Binary_Search #Bit_Manipulation #Segment_Tree
// #2023_06_12_Time_446_ms_(100.00%)_Space_50.7_MB_(100.00%)

class Solution {
    fun closestToTarget(arr: IntArray, target: Int): Int {
        val prefix = IntArray(22)
        prefix[0] = -1
        var res = Int.MAX_VALUE
        var size = 1
        for (a in arr) {
            var ns = 1
            for (i in 1 until size) {
                if (prefix[ns - 1] != prefix[i] and a) {
                    prefix[ns++] = prefix[i] and a
                    res = Math.min(res, Math.abs((prefix[i] and a) - target))
                }
            }
            if (prefix[ns - 1] != a) {
                prefix[ns++] = a
                res = Math.min(res, Math.abs(a - target))
            }
            size = ns
        }
        return res
    }
}
