package g0401_0500.s0466_count_the_repetitions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getMaxRepetitions() {
        assertThat(Solution().getMaxRepetitions("acb", 4, "ab", 2), equalTo(2))
    }

    @Test
    fun getMaxRepetitions2() {
        assertThat(Solution().getMaxRepetitions("acb", 1, "acb", 1), equalTo(1))
    }
}
