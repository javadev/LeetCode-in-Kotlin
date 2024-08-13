package g3201_3300.s3248_snake_in_matrix

// #Easy #Array #String #Simulation #2024_08_13_Time_174_ms_(90.91%)_Space_37.5_MB_(34.09%)

class Solution {
    fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
        var x = 0
        var y = 0
        for (command in commands) {
            when (command) {
                "UP" -> if (x > 0) {
                    x--
                }
                "DOWN" -> if (x < n - 1) {
                    x++
                }
                "LEFT" -> if (y > 0) {
                    y--
                }
                "RIGHT" -> if (y < n - 1) {
                    y++
                }
                else -> {}
            }
        }
        return (x * n) + y
    }
}
