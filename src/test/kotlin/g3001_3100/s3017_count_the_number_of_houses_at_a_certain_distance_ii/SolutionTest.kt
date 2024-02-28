package g3001_3100.s3017_count_the_number_of_houses_at_a_certain_distance_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfPairs() {
        assertThat(Solution().countOfPairs(3, 1, 3), equalTo(longArrayOf(6, 0, 0)))
    }

    @Test
    fun countOfPairs2() {
        assertThat(Solution().countOfPairs(5, 2, 4), equalTo(longArrayOf(10, 8, 2, 0, 0)))
    }

    @Test
    fun countOfPairs3() {
        assertThat(Solution().countOfPairs(4, 1, 1), equalTo(longArrayOf(6, 4, 2, 0)))
    }
}
