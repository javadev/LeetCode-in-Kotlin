package g3201_3300.s3267_count_almost_equal_pairs_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(Solution().countPairs(intArrayOf(1023, 2310, 2130, 213)), equalTo(4))
    }

    @Test
    fun countPairs2() {
        assertThat(Solution().countPairs(intArrayOf(1, 10, 100)), equalTo(3))
    }
}
