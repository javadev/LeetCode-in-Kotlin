package g1001_1100.s1041_robot_bounded_in_circle

// #Medium #String #Math #Simulation #2023_05_27_Time_121_ms_(100.00%)_Space_34.3_MB_(66.67%)

class Solution {
    fun isRobotBounded(instructions: String): Boolean {
        val dir = arrayOf(intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1), intArrayOf(1, 0))
        var i = 0
        var x = 0
        var y = 0
        for (s in instructions.indices) {
            if (instructions[s] == 'L') {
                i = (i + 1) % 4
            } else if (instructions[s] == 'R') {
                i = (i + 3) % 4
            } else {
                x += dir[i][0]
                y += dir[i][1]
            }
        }
        return x == 0 && y == 0 || i != 0
    }
}
