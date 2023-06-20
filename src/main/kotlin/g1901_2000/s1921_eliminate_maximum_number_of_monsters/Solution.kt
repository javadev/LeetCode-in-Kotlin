package g1901_2000.s1921_eliminate_maximum_number_of_monsters

// #Medium #Array #Sorting #Greedy #2023_06_20_Time_507_ms_(100.00%)_Space_54.5_MB_(100.00%)

class Solution {
    fun eliminateMaximum(dist: IntArray, speed: IntArray): Int {
        for (i in dist.indices) {
            dist[i] = (dist[i] - 1) / speed[i] + 1
        }
        dist.sort()
        var ans = 1
        var time = 1
        for (i in 1 until dist.size) {
            if (dist[i] > time) {
                ans++
                time++
            } else {
                return ans
            }
        }
        return ans
    }
}
