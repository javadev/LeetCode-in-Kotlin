package g3701_3800.s3704_count_no_zero_pairs_that_sum_to_n

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNoZeroPairs() {
        assertThat<Long>(Solution().countNoZeroPairs(2L), equalTo<Long>(1L))
    }

    @Test
    fun countNoZeroPairs2() {
        assertThat<Long>(Solution().countNoZeroPairs(3L), equalTo<Long>(2L))
    }

    @Test
    fun countNoZeroPairs3() {
        assertThat<Long>(Solution().countNoZeroPairs(11L), equalTo<Long>(8L))
    }
}
