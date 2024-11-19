package g0201_0300.s0260_single_number_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun singleNumber() {
        assertThat(
            Solution().singleNumber(intArrayOf(1, 2, 1, 3, 2, 5)),
            equalTo(intArrayOf(3, 5)),
        )
    }

    @Test
    fun singleNumber2() {
        assertThat(Solution().singleNumber(intArrayOf(-1, 0)), equalTo(intArrayOf(-1, 0)))
    }
}
