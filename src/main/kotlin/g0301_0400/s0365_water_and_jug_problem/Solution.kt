package g0301_0400.s0365_water_and_jug_problem

// #Medium #Math #Depth_First_Search #Breadth_First_Search
// #Graph_Theory_I_Day_11_Breadth_First_Search
// #2022_11_19_Time_130_ms_(100.00%)_Space_32.5_MB_(100.00%)

class Solution {
    private fun gcd(n1: Int, n2: Int): Int {
        return if (n2 == 0) {
            n1
        } else gcd(n2, n1 % n2)
    }

    fun canMeasureWater(jug1: Int, jug2: Int, target: Int): Boolean {
        if (jug1 + jug2 < target) {
            return false
        }
        val gcd = gcd(jug1, jug2)
        return target % gcd == 0
    }
}
