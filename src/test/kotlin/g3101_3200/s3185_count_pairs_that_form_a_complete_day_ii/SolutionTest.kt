package g3101_3200.s3185_count_pairs_that_form_a_complete_day_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCompleteDayPairs() {
        assertThat(
            Solution().countCompleteDayPairs(intArrayOf(12, 12, 30, 24, 24)),
            equalTo(2L),
        )
    }

    @Test
    fun countCompleteDayPairs2() {
        assertThat(Solution().countCompleteDayPairs(intArrayOf(72, 48, 24, 3)), equalTo(3L))
    }
}
