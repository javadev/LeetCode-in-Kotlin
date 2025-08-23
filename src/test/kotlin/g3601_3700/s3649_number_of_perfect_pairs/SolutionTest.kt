package g3601_3700.s3649_number_of_perfect_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun perfectPairs() {
        assertThat<Long>(
            Solution().perfectPairs(intArrayOf(0, 1, 2, 3)),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun perfectPairs2() {
        assertThat<Long>(
            Solution().perfectPairs(intArrayOf(-3, 2, -1, 4)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun perfectPairs3() {
        assertThat<Long>(
            Solution().perfectPairs(intArrayOf(1, 10, 100, 1000)),
            equalTo<Long>(0L),
        )
    }
}
