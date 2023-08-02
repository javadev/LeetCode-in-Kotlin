package g2501_2600.s2578_split_with_minimum_sum

// #Easy #Math #Sorting #Greedy #2023_07_10_Time_121_ms_(75.00%)_Space_33.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun splitNum(num: Int): Int {
        var num = num
        val ans = IntArray(10)
        while (num > 0) {
            ans[num % 10]++
            num /= 10
        }
        var num1 = 0
        var num2 = 0
        for (i in 0..9) {
            for (j in 0 until ans[i]) {
                if (num1 <= num2) {
                    num1 = num1 * 10 + i
                } else {
                    num2 = num2 * 10 + i
                }
            }
        }
        return num1 + num2
    }
}
