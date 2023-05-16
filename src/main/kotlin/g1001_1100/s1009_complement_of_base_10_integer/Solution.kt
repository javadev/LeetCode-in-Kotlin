package g1001_1100.s1009_complement_of_base_10_integer

// #Easy #Bit_Manipulation #Udemy_Bit_Manipulation
// #2023_05_16_Time_126_ms_(72.73%)_Space_34.3_MB_(18.18%)

import kotlin.math.pow

class Solution {
    fun bitwiseComplement(n: Int): Int {
        var n = n
        if (n == 0) {
            return 1
        }
        val list: MutableList<Int> = ArrayList()
        while (n != 0) {
            list.add(n and 1)
            n = n shr 1
        }
        var result = 0
        var exp = list.size - 1
        for (i in list.indices.reversed()) {
            if (list[i] == 0) {
                result += 2.0.pow(exp.toDouble()).toInt()
            }
            exp--
        }
        return result
    }
}
