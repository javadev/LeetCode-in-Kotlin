package g0901_1000.s0970_powerful_integers

// #Medium #Hash_Table #Math #2023_05_06_Time_136_ms_(100.00%)_Space_35_MB_(100.00%)

import kotlin.math.log10
import kotlin.math.pow

class Solution {
    fun powerfulIntegers(x: Int, y: Int, bound: Int): List<Int> {
        val iBound = if (x == 1) 1 else (log10(bound.toDouble()) / log10(x.toDouble())).toInt()
        val jBound = if (y == 1) 1 else (log10(bound.toDouble()) / log10(y.toDouble())).toInt()
        val set: HashSet<Int> = HashSet()
        for (i in 0..iBound) {
            for (j in 0..jBound) {
                val number = (x.toDouble().pow(i.toDouble()) + y.toDouble().pow(j.toDouble())).toInt()
                if (number <= bound) {
                    set.add(number)
                }
            }
        }
        return ArrayList(set)
    }
}
