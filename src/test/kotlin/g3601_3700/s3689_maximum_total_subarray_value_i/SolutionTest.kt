package g3601_3700.s3689_maximum_total_subarray_value_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTotalValue() {
        assertThat<Long>(
            Solution().maxTotalValue(intArrayOf(1, 3, 2), 2),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun maxTotalValue2() {
        assertThat<Long>(
            Solution().maxTotalValue(intArrayOf(4, 2, 5, 1), 3),
            equalTo<Long>(12L),
        )
    }
}
