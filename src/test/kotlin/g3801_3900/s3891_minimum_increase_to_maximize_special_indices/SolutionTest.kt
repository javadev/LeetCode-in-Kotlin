package g3801_3900.s3891_minimum_increase_to_maximize_special_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minIncrease() {
        assertThat<Long>(Solution().minIncrease(intArrayOf(1, 2, 2)), equalTo<Long>(1L))
    }

    @Test
    fun minIncrease2() {
        assertThat<Long>(Solution().minIncrease(intArrayOf(2, 1, 1, 3)), equalTo<Long>(2L))
    }

    @Test
    fun minIncrease3() {
        assertThat<Long>(
            Solution().minIncrease(intArrayOf(5, 2, 1, 4, 3)),
            equalTo<Long>(4L),
        )
    }
}
