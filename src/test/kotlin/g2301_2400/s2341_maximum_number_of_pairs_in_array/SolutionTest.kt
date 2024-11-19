package g2301_2400.s2341_maximum_number_of_pairs_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPairs() {
        assertThat(
            Solution().numberOfPairs(intArrayOf(1, 3, 2, 1, 3, 2, 2)),
            equalTo(intArrayOf(3, 1)),
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(Solution().numberOfPairs(intArrayOf(1, 1)), equalTo(intArrayOf(1, 0)))
    }

    @Test
    fun numberOfPairs3() {
        assertThat(Solution().numberOfPairs(intArrayOf(0)), equalTo(intArrayOf(0, 1)))
    }
}
