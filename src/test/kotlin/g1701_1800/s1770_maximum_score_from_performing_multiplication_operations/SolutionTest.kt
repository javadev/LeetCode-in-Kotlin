package g1701_1800.s1770_maximum_score_from_performing_multiplication_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat(
            Solution().maximumScore(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)),
            equalTo(14),
        )
    }

    @Test
    fun maximumScore2() {
        assertThat(
            Solution()
                .maximumScore(intArrayOf(-5, -3, -3, -2, 7, 1), intArrayOf(-10, -5, 3, 4, 6)),
            equalTo(102),
        )
    }
}
