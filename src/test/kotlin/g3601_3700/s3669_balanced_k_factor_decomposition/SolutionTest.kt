package g3601_3700.s3669_balanced_k_factor_decomposition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDifference() {
        assertThat<IntArray>(
            Solution().minDifference(100, 2),
            equalTo<IntArray>(intArrayOf(10, 10)),
        )
    }

    @Test
    fun minDifference2() {
        assertThat<IntArray>(
            Solution().minDifference(44, 3),
            equalTo<IntArray>(intArrayOf(2, 2, 11)),
        )
    }
}
