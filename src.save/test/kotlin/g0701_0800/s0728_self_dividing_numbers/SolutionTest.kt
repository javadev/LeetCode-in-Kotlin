package g0701_0800.s0728_self_dividing_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun selfDividingNumbers() {
        assertThat(
            Solution().selfDividingNumbers(1, 22),
            equalTo(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22))
        )
    }

    @Test
    fun selfDividingNumbers2() {
        assertThat(
            Solution().selfDividingNumbers(47, 85), equalTo(listOf(48, 55, 66, 77))
        )
    }
}
