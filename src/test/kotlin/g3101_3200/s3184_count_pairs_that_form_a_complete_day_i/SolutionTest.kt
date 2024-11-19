package g3101_3200.s3184_count_pairs_that_form_a_complete_day_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCompleteDayPairs() {
        assertThat(
            Solution().countCompleteDayPairs(intArrayOf(12, 12, 30, 24, 24)),
            equalTo(2),
        )
    }

    @Test
    fun countCompleteDayPairs2() {
        assertThat(Solution().countCompleteDayPairs(intArrayOf(72, 48, 24, 3)), equalTo(3))
    }
}
