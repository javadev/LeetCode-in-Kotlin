package g0401_0500.s0474_ones_and_zeroes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxForm() {
        assertThat(
            Solution().findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), 5, 3),
            equalTo(4)
        )
    }

    @Test
    fun findMaxForm2() {
        assertThat(Solution().findMaxForm(arrayOf("10", "0", "1"), 1, 1), equalTo(2))
    }
}
