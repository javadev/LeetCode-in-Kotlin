package g3001_3100.s3031_minimum_time_to_revert_word_to_initial_state_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTimeToInitialState() {
        assertThat(Solution().minimumTimeToInitialState("abacaba", 3), equalTo(2))
    }

    @Test
    fun minimumTimeToInitialState2() {
        assertThat(Solution().minimumTimeToInitialState("abacaba", 4), equalTo(1))
    }

    @Test
    fun minimumTimeToInitialState3() {
        assertThat(Solution().minimumTimeToInitialState("abcbabcd", 2), equalTo(4))
    }
}
