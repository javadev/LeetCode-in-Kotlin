package g0901_1000.s0967_numbers_with_same_consecutive_differences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numsSameConsecDiff() {
        assertThat(
            Solution().numsSameConsecDiff(3, 7),
            equalTo(intArrayOf(181, 292, 707, 818, 929)),
        )
    }

    @Test
    fun numsSameConsecDiff2() {
        assertThat(
            Solution().numsSameConsecDiff(2, 1),
            equalTo(
                intArrayOf(
                    10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98,
                ),
            ),
        )
    }
}
