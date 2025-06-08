package g3501_3600.s3574_maximize_subarray_gcd_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxGCDScore() {
        assertThat<Long>(Solution().maxGCDScore(intArrayOf(2, 4), 1), equalTo<Long>(8L))
    }

    @Test
    fun maxGCDScore2() {
        assertThat<Long>(
            Solution().maxGCDScore(intArrayOf(3, 5, 7), 2),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxGCDScore3() {
        assertThat<Long>(
            Solution().maxGCDScore(intArrayOf(5, 5, 5), 1),
            equalTo<Long>(15L),
        )
    }
}
