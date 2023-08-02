package g1001_1100.s1006_clumsy_factorial

// #Medium #Math #Stack #Simulation #2023_05_15_Time_127_ms_(100.00%)_Space_33.7_MB_(100.00%)

class Solution {
    private var m = 1
    fun clumsy(n: Int): Int {
        val num: Int = if (n >= 4) {
            m * n * (n - 1) / (n - 2) + (n - 3)
        } else if (n == 3) {
            m * n * (n - 1) / (n - 2)
        } else if (n == 2) {
            m * n * (n - 1)
        } else if (n == 1) {
            m * n
        } else {
            return 0
        }
        m = -1
        return num + clumsy(n - 4)
    }
}
