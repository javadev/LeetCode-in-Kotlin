package g3901_4000.s3961_maximize_sum_of_device_ratings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRatings() {
        assertThat<Long>(
            Solution().maxRatings(arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(2, 2))),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun maxRatings2() {
        assertThat<Long>(
            Solution().maxRatings(
                arrayOf<IntArray>(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                ),
            ),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun maxRatings3() {
        assertThat<Long>(
            Solution().maxRatings(
                arrayOf<IntArray>(
                    intArrayOf(5, 5, 5),
                    intArrayOf(1, 1, 1),
                ),
            ),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun maxRatings4() {
        assertThat<Long>(
            Solution().maxRatings(
                arrayOf<IntArray>(
                    intArrayOf(4),
                    intArrayOf(7),
                    intArrayOf(1),
                ),
            ),
            equalTo<Long>(12L),
        )
    }
}
