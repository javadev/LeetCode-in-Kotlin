package g3601_3700.s3645_maximum_total_from_optimal_activation_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTotal() {
        assertThat<Long>(
            Solution().maxTotal(intArrayOf(3, 5, 8), intArrayOf(2, 1, 3)),
            equalTo<Long>(16L),
        )
    }

    @Test
    fun maxTotal2() {
        assertThat<Long>(
            Solution().maxTotal(intArrayOf(4, 2, 6), intArrayOf(1, 1, 1)),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun maxTotal3() {
        assertThat<Long>(
            Solution().maxTotal(intArrayOf(4, 1, 5, 2), intArrayOf(3, 3, 2, 3)),
            equalTo<Long>(12L),
        )
    }
}
