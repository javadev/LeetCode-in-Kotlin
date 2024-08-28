package g3201_3300.s3265_count_almost_equal_pairs_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(Solution().countPairs(intArrayOf(3, 12, 30, 17, 21)), equalTo(2))
    }

    @Test
    fun countPairs2() {
        assertThat(Solution().countPairs(intArrayOf(1, 1, 1, 1, 1)), equalTo(10))
    }

    @Test
    fun countPairs3() {
        assertThat(Solution().countPairs(intArrayOf(123, 231)), equalTo(0))
    }
}
