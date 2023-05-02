package g0501_0600.s0600_non_negative_integers_without_consecutive_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findIntegers() {
        assertThat(Solution().findIntegers(5), equalTo(5))
    }

    @Test
    fun findIntegers2() {
        assertThat(Solution().findIntegers(100000000), equalTo(514229))
    }
}
