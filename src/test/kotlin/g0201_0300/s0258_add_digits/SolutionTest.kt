package g0201_0300.s0258_add_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addDigits() {
        assertThat(Solution().addDigits(38), equalTo(2))
    }

    @Test
    fun addDigits2() {
        assertThat(Solution().addDigits(0), equalTo(0))
    }
}
