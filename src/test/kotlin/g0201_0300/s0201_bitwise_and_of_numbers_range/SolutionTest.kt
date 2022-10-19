package g0201_0300.s0201_bitwise_and_of_numbers_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rangeBitwiseAnd() {
        assertThat(Solution().rangeBitwiseAnd(5, 7), equalTo(4))
    }

    @Test
    fun rangeBitwiseAnd2() {
        assertThat(Solution().rangeBitwiseAnd(0, 0), equalTo(0))
    }

    @Test
    fun rangeBitwiseAnd3() {
        assertThat(Solution().rangeBitwiseAnd(1, 2147483647), equalTo(0))
    }
}
