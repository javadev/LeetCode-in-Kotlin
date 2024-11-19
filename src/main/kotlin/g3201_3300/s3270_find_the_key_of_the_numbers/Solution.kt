package g3201_3300.s3270_find_the_key_of_the_numbers

// #Easy #Math #2024_09_04_Time_122_ms_(97.83%)_Space_34_MB_(65.22%)

import kotlin.math.min

class Solution {
    fun generateKey(num1: Int, num2: Int, num3: Int): Int {
        val s1 = (
            min(
                num1 / 1000 % 10,
                min(
                    num2 / 1000 % 10,
                    num3 / 1000 % 10,
                ),
            ) * 1000
            )
        val s2 = (
            min(
                num1 / 100 % 10,
                min(
                    num2 / 100 % 10,
                    num3 / 100 % 10,
                ),
            ) * 100
            )
        val s3 =
            (
                min(
                    num1 / 10 % 10,
                    min(
                        num2 / 10 % 10,
                        num3 / 10 % 10,
                    ),
                ) * 10
                )
        val s4 = min(
            num1 % 10,
            min(num2 % 10, num3 % 10),
        )
        return s1 + s2 + s3 + s4
    }
}
