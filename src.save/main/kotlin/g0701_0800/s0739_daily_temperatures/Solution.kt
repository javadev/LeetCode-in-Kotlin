package g0701_0800.s0739_daily_temperatures

// #Medium #Top_100_Liked_Questions #Array #Stack #Monotonic_Stack #Programming_Skills_II_Day_6
// #2022_09_13_Time_936_ms_(80.54%)_Space_79.5_MB_(63.09%)

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val sol = IntArray(temperatures.size)
        sol[temperatures.size - 1] = 0
        for (i in sol.size - 2 downTo 0) {
            var j = i + 1
            while (j <= sol.size) {
                if (temperatures[i] < temperatures[j]) {
                    sol[i] = j - i
                    break
                } else {
                    if (sol[j] == 0) {
                        break
                    }
                    j = j + sol[j]
                }
            }
        }
        return sol
    }
}
