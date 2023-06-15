package g1701_1800.s1732_find_the_highest_altitude

// #Easy #Array #Prefix_Sum
class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max: Int = 0
        val altitudes: IntArray = IntArray(gain.size + 1)
        for (i in gain.indices) {
            altitudes[i + 1] = altitudes.get(i) + gain.get(i)
            max = Math.max(max, altitudes.get(i + 1))
        }
        return max
    }
}
