package g0601_0700.s0657_robot_return_to_origin

// #Easy #String #Simulation #2023_02_13_Time_186_ms_(100.00%)_Space_35.9_MB_(100.00%)

class Solution {
    fun judgeCircle(moves: String): Boolean {
        val map = IntArray(26)
        for (c in moves.toCharArray()) {
            map[c.code - 'A'.code]++
        }
        return map['U'.code - 'A'.code] == map['D'.code - 'A'.code] &&
            map['L'.code - 'A'.code] == map['R'.code - 'A'.code]
    }
}
