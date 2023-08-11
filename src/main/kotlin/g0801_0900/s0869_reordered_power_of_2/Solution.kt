package g0801_0900.s0869_reordered_power_of_2

// #Medium #Math #Sorting #Counting #Enumeration
// #2023_04_05_Time_145_ms_(87.50%)_Space_35.5_MB_(50.00%)

import kotlin.math.pow

class Solution {
    fun reorderedPowerOf2(n: Int): Boolean {
        var i = 0
        while (2.0.pow(i.toDouble()) < n.toLong() * 10) {
            if (isValid(2.0.pow(i++.toDouble()).toInt().toString(), n.toString())) {
                return true
            }
        }
        return false
    }

    private fun isValid(a: String, b: String): Boolean {
        val m: MutableMap<Char, Int> = HashMap()
        val mTwo: MutableMap<Char, Int> = HashMap()
        for (c in a.toCharArray()) {
            m[c] = if (m.containsKey(c)) m[c]!! + 1 else 1
        }
        for (c in b.toCharArray()) {
            mTwo[c] = if (mTwo.containsKey(c)) mTwo[c]!! + 1 else 1
        }
        for (entry in mTwo.entries.iterator()) {
            if (!m.containsKey(entry.key) || entry.value != m[entry.key]) {
                return false
            }
        }
        return a[0] != '0' && m.size == mTwo.size
    }
}
