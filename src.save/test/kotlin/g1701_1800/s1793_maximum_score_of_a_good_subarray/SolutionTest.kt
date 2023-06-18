package g1701_1800.s1793_maximum_score_of_a_good_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat(Solution().maximumScore(intArrayOf(1, 4, 3, 7, 4, 5), 3), equalTo(15))
    }

    @Test
    fun maximumScore2() {
        assertThat(Solution().maximumScore(intArrayOf(5, 5, 4, 5, 4, 1, 1, 1), 0), equalTo(20))
    }
}
