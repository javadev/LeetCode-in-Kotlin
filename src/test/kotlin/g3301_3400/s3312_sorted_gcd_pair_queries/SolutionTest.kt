package g3301_3400.s3312_sorted_gcd_pair_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gcdValues() {
        assertThat<IntArray?>(
            Solution().gcdValues(intArrayOf(2, 3, 4), longArrayOf(0L, 2L, 2L)),
            equalTo<IntArray?>(intArrayOf(1, 2, 2))
        )
    }

    @Test
    fun gcdValues2() {
        assertThat<IntArray?>(
            Solution().gcdValues(intArrayOf(4, 4, 2, 1), longArrayOf(5L, 3L, 1L, 0L)),
            equalTo<IntArray?>(intArrayOf(4, 2, 1, 1))
        )
    }
}
