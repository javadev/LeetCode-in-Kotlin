package g2901_3000.s2951_find_the_peaks

// #Easy #Array #Enumeration #2024_01_16_Time_188_ms_(93.75%)_Space_37.5_MB_(72.50%)

class Solution {
    fun findPeaks(mountain: IntArray): List<Int> {
        val list: MutableList<Int> = ArrayList()
        for (i in 1 until mountain.size - 1) {
            if ((mountain[i - 1] < mountain[i]) && (mountain[i] > mountain[i + 1])) {
                list.add(i)
            }
        }
        return list
    }
}
