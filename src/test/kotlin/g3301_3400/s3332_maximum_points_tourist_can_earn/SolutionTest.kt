package g3301_3400.s3332_maximum_points_tourist_can_earn

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Int>(
            Solution().maxScore(
                2,
                1,
                arrayOf<IntArray>(intArrayOf(2, 3)),
                arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(1, 0))
            ),
            equalTo<Int>(3)
        )
    }

    @Test
    fun maxScore2() {
        assertThat<Int>(
            Solution()
                .maxScore(
                    3,
                    2,
                    arrayOf<IntArray>(intArrayOf(3, 4, 2), intArrayOf(2, 1, 2)),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(2, 0, 4), intArrayOf(3, 2, 0))
                ),
            equalTo<Int>(8)
        )
    }
}
