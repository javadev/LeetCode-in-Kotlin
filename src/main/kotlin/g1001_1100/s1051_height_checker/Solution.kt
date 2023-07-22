package g1001_1100.s1051_height_checker

// #Easy #Array #Sorting #Counting_Sort #2023_05_29_Time_140_ms_(94.37%)_Space_35.3_MB_(77.46%)

class Solution {
    fun heightChecker(heights: IntArray): Int {
        var heightDiff = 0
        val count = IntArray(101)
        val actualLine = IntArray(heights.size)
        for (height in heights) {
            count[height]++
        }
        var heightLength = 0
        for (i in count.indices) {
            if (count[i] > 0) {
                for (j in 0 until count[i]) {
                    actualLine[heightLength] = i
                    heightLength++
                }
                count[i] = 0
            }
        }
        for (i in heights.indices) {
            if (actualLine[i] != heights[i]) {
                heightDiff++
            }
        }
        return heightDiff
    }
}
