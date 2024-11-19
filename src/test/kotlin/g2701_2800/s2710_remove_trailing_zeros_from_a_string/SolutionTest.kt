package g2701_2800.s2710_remove_trailing_zeros_from_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeTrailingZeros() {
        assertThat(
            Solution().removeTrailingZeros("51230100"),
            equalTo("512301"),
        )
    }

    @Test
    fun removeTrailingZeros2() {
        assertThat(
            Solution().removeTrailingZeros("123"),
            equalTo("123"),
        )
    }
}
