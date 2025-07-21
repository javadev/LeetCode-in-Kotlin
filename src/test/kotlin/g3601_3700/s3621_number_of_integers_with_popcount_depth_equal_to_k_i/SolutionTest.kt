package g3601_3700.s3621_number_of_integers_with_popcount_depth_equal_to_k_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun popcountDepth() {
        assertThat<Long>(Solution().popcountDepth(4L, 1), equalTo<Long>(2L))
    }

    @Test
    fun popcountDepth2() {
        assertThat<Long>(Solution().popcountDepth(7L, 2), equalTo<Long>(3L))
    }
}
