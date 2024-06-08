package g3101_3200.s3171_find_subarray_with_bitwise_and_closest_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDifference() {
        assertThat(Solution().minimumDifference(intArrayOf(1, 2, 4, 5), 3), equalTo(1))
    }

    @Test
    fun minimumDifference2() {
        assertThat(Solution().minimumDifference(intArrayOf(1, 2, 1, 2), 2), equalTo(0))
    }

    @Test
    fun minimumDifference3() {
        assertThat(Solution().minimumDifference(intArrayOf(1), 10), equalTo(9))
    }
}
