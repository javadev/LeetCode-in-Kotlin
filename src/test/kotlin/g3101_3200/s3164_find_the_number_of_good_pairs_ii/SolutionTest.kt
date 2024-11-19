package g3101_3200.s3164_find_the_number_of_good_pairs_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPairs() {
        assertThat(
            Solution().numberOfPairs(intArrayOf(1, 3, 4), intArrayOf(1, 3, 4), 1),
            equalTo(5L),
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(
            Solution().numberOfPairs(intArrayOf(1, 2, 4, 12), intArrayOf(2, 4), 3),
            equalTo(2L),
        )
    }
}
