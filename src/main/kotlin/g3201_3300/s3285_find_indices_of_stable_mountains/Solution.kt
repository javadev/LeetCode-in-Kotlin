package g3201_3300.s3285_find_indices_of_stable_mountains

// #Easy #2024_09_17_Time_195_ms_(92.68%)_Space_37.5_MB_(48.78%)

class Solution {
    fun stableMountains(height: IntArray, threshold: Int): List<Int> {
        val n = height.size
        val list: MutableList<Int> = mutableListOf()
        for (i in 0 until n - 1) {
            if (height[i] > threshold) {
                list.add(i + 1)
            }
        }
        return list
    }
}
