package g1601_1700.s1630_arithmetic_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkArithmeticSubarrays() {
        assertThat(
            Solution()
                .checkArithmeticSubarrays(intArrayOf(4, 6, 5, 9, 3, 7), intArrayOf(0, 0, 2), intArrayOf(2, 3, 5)),
            equalTo(listOf(true, false, true)),
        )
    }

    @Test
    fun checkArithmeticSubarrays2() {
        assertThat(
            Solution()
                .checkArithmeticSubarrays(
                    intArrayOf(-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10),
                    intArrayOf(0, 1, 6, 4, 8, 7),
                    intArrayOf(4, 4, 9, 7, 9, 10),
                ),
            equalTo(listOf(false, true, false, false, true, true)),
        )
    }
}
