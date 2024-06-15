package g3101_3200.s3178_find_the_child_who_has_the_ball_after_k_seconds

// #Easy #Math #Simulation #2024_06_15_Time_136_ms_(82.35%)_Space_33.7_MB_(45.10%)

class Solution {
    fun numberOfChild(n: Int, k: Int): Int {
        val bigN = 2 * n - 2
        val x = k % bigN
        return if (x < n) x else bigN - x
    }
}
