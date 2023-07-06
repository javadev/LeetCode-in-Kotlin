package g2501_2600.s2550_count_collisions_of_monkeys_on_a_polygon

// #Medium #Math #Recursion #2023_07_06_Time_111_ms_(100.00%)_Space_33_MB_(50.00%)

class Solution {
    fun monkeyMove(n: Int): Int {
        return (((modPow2(n - 2) - 1 shl 2) + 2) % 1000000007).toInt()
    }

    private fun modPow2(n: Int): Long {
        if (n == 0) return 1
        val b = modPow2(n shr 1)
        return (b * b shl (n and 1)) % 1000000007
    }
}
