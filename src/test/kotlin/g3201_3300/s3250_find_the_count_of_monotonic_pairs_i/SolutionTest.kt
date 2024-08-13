package g3201_3300.s3250_find_the_count_of_monotonic_pairs_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfPairs() {
        assertThat(Solution().countOfPairs(intArrayOf(2, 3, 2)), equalTo(4))
    }

    @Test
    fun countOfPairs2() {
        assertThat(Solution().countOfPairs(intArrayOf(5, 5, 5, 5)), equalTo(126))
    }
}
