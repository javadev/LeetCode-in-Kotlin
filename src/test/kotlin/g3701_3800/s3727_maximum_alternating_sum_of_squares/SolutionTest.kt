package g3701_3800.s3727_maximum_alternating_sum_of_squares

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAlternatingSum() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(1, 2, 3)),
            equalTo<Long>(12L),
        )
    }

    @Test
    fun maxAlternatingSum2() {
        assertThat<Long>(
            Solution().maxAlternatingSum(intArrayOf(1, -1, 2, -2, 3, -3)),
            equalTo<Long>(16L),
        )
    }
}
