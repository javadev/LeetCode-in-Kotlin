package g2401_2500.s2426_number_of_pairs_satisfying_inequality

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPairs() {
        assertThat(
            Solution().numberOfPairs(intArrayOf(3, 2, 5), intArrayOf(2, 2, 1), 1),
            equalTo(3L),
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(
            Solution().numberOfPairs(intArrayOf(3, -1), intArrayOf(-2, 2), -1),
            equalTo(0L),
        )
    }
}
