package g1601_1700.s1680_concatenation_of_consecutive_binary_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun concatenatedBinary() {
        assertThat(Solution().concatenatedBinary(1), equalTo(1))
    }

    @Test
    fun concatenatedBinary2() {
        assertThat(Solution().concatenatedBinary(3), equalTo(27))
    }

    @Test
    fun concatenatedBinary3() {
        assertThat(Solution().concatenatedBinary(12), equalTo(505379714))
    }
}
