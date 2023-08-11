package g1801_1900.s1894_find_the_student_that_will_replace_the_chalk

// #Medium #Array #Binary_Search #Simulation #Prefix_Sum #Binary_Search_II_Day_2
// #2023_06_22_Time_520_ms_(50.00%)_Space_55_MB_(33.33%)

class Solution {
    fun chalkReplacer(chalk: IntArray, k: Int): Int {
        val localSum = sum(chalk)
        var currentIndex = 0
        if (localSum != 0L) {
            var localK = (k % localSum).toInt()
            while (chalk[currentIndex] <= localK) {
                localK -= chalk[currentIndex++]
            }
        }
        return currentIndex
    }

    private fun sum(chalk: IntArray): Long {
        var sum: Long = 0
        for (i in chalk) {
            sum += i.toLong()
        }
        return sum
    }
}
