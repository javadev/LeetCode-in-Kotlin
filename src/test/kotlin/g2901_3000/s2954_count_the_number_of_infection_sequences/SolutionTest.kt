package g2901_3000.s2954_count_the_number_of_infection_sequences

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSequence() {
        MatcherAssert.assertThat(Solution().numberOfSequence(5, intArrayOf(0, 4)), CoreMatchers.equalTo(4))
    }

    @Test
    fun numberOfSequence2() {
        MatcherAssert.assertThat(Solution().numberOfSequence(4, intArrayOf(1)), CoreMatchers.equalTo(3))
    }
}
