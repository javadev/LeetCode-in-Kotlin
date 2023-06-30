package g2301_2400.s2318_number_of_distinct_roll_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctSequences() {
        assertThat(Solution().distinctSequences(4), equalTo(184))
    }

    @Test
    fun distinctSequences2() {
        assertThat(Solution().distinctSequences(2), equalTo(22))
    }
}
