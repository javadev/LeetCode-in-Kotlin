package g3901_4000.s3996_even_number_of_knight_moves

// #Easy #Array #Math #Mid_Level #Weekly_Contest_511
// #2026_11_17_Time_1_ms_(88.64%)_Space_43.26_MB_(96.70%)

class Solution {
    fun canReach(start: IntArray, target: IntArray): Boolean = (start[0] + start[1]) % 2 == (target[0] + target[1]) % 2
}
