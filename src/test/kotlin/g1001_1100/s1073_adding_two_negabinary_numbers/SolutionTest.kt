package g1001_1100.s1073_adding_two_negabinary_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addNegabinary() {
        assertThat(
            Solution().addNegabinary(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 0, 1)),
            equalTo(intArrayOf(1, 0, 0, 0, 0))
        )
    }

    @Test
    fun addNegabinary2() {
        assertThat(
            Solution().addNegabinary(intArrayOf(0), intArrayOf(0)), equalTo(intArrayOf(0))
        )
    }

    @Test
    fun addNegabinary3() {
        assertThat(
            Solution().addNegabinary(intArrayOf(0), intArrayOf(1)), equalTo(intArrayOf(1))
        )
    }
}
