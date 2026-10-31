package g3701_3800.s3743_maximize_cyclic_partition_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(5, 5, 5), 2),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun maximumScore2() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(1, 3, 2), 1),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun maximumScore3() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(1, 4, 2), 2),
            equalTo<Long>(3L),
        )
    }
}
