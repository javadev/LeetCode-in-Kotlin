package g0601_0700.s0693_binary_number_with_alternating_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasAlternatingBits() {
        assertThat(Solution().hasAlternatingBits(5), equalTo(true))
    }

    @Test
    fun hasAlternatingBits2() {
        assertThat(Solution().hasAlternatingBits(7), equalTo(false))
    }

    @Test
    fun hasAlternatingBits3() {
        assertThat(Solution().hasAlternatingBits(11), equalTo(false))
    }
}
