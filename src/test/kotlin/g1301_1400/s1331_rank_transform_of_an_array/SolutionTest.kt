package g1301_1400.s1331_rank_transform_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arrayRankTransform() {
        assertThat(
            Solution().arrayRankTransform(intArrayOf(40, 10, 20, 30)),
            equalTo(intArrayOf(4, 1, 2, 3))
        )
    }

    @Test
    fun arrayRankTransform2() {
        assertThat(
            Solution().arrayRankTransform(intArrayOf(100, 100, 100)),
            equalTo(intArrayOf(1, 1, 1))
        )
    }

    @Test
    fun arrayRankTransform3() {
        assertThat(
            Solution().arrayRankTransform(intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12)),
            equalTo(intArrayOf(5, 3, 4, 2, 8, 6, 7, 1, 3))
        )
    }
}
