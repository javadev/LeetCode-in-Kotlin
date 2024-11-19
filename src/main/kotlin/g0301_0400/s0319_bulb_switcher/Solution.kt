package g0301_0400.s0319_bulb_switcher

// #Medium #Math #Brainteaser #2022_11_12_Time_214_ms_(77.78%)_Space_33.4_MB_(55.56%)

class Solution {
    fun bulbSwitch(n: Int): Int {
        return if (n < 2) {
            n
        } else {
            Math.sqrt(n.toDouble()).toInt()
        }
    }
}
