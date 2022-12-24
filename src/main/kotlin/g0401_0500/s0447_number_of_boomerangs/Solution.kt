package g0401_0500.s0447_number_of_boomerangs

// #Medium #Array #Hash_Table #Math #2022_12_24_Time_308_ms_(100.00%)_Space_41.1_MB_(100.00%)

class Solution {
    fun numberOfBoomerangs(points: Array<IntArray>): Int {
        val m: HashMap<Int, Int> = HashMap()
        var ans = 0
        for (i in points.indices) {
            for (j in points.indices) {
                if (i == j) {
                    continue
                }
                val dis = dist(points[i], points[j])
                val prev = m.getOrDefault(dis, 0)
                if (prev >= 1) {
                    ans += prev * 2
                }
                m[dis] = prev + 1
            }
            m.clear()
        }
        return ans
    }

    private fun dist(d1: IntArray, d2: IntArray): Int {
        return (d1[0] - d2[0]) * (d1[0] - d2[0]) + (d1[1] - d2[1]) * (d1[1] - d2[1])
    }
}
