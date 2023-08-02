package g2201_2300.s2266_count_number_of_texts

// #Medium #String #Hash_Table #Dynamic_Programming #Math
// #2023_06_28_Time_216_ms_(100.00%)_Space_38.2_MB_(100.00%)

class Solution {
    fun countTexts(pressedKeys: String): Int {
        val len = pressedKeys.length
        var dp0 = 1L
        var dp1: Long = 0
        var dp2: Long = 0
        var dp3: Long = 0
        var dp4: Long
        val keys = pressedKeys.toCharArray()
        val base = 1000000007
        for (i in 1 until len) {
            val r = keys[i].code - '0'.code
            dp4 = dp3
            dp3 = dp2
            dp2 = dp1
            dp1 = dp0 % base
            dp0 = dp1
            dp0 += (if (i - 1 == 0 && keys[i] == keys[i - 1]) 1 else 0).toLong()
            if (i - 1 <= 0 || keys[i] != keys[i - 1]) {
                continue
            }
            dp0 += dp2
            dp0 += (if (i - 2 == 0 && keys[i] == keys[i - 2]) 1 else 0).toLong()
            if (i - 2 <= 0 || keys[i] != keys[i - 2]) {
                continue
            }
            dp0 += dp3
            dp0 += (if (i - 3 == 0 && keys[i] == keys[i - 3] && (r == 7 || r == 9)) 1 else 0).toLong()
            if (i - 3 <= 0 || keys[i] != keys[i - 3] || r != 7 && r != 9) {
                continue
            }
            dp0 += dp4
        }
        return (dp0 % base).toInt()
    }
}
