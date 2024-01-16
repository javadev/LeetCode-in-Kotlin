package g2901_3000.s2954_count_the_number_of_infection_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSequence() {
        assertThat(Solution().numberOfSequence(5, intArrayOf(0, 4)), equalTo(4))
    }

    @Test
    fun numberOfSequence2() {
        assertThat(Solution().numberOfSequence(4, intArrayOf(1)), equalTo(3))
    }
}
