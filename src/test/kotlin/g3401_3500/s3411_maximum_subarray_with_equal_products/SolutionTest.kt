package g3401_3500.s3411_maximum_subarray_with_equal_products

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxLength() {
        assertThat<Int>(
            Solution().maxLength(intArrayOf(1, 2, 1, 2, 1, 1, 1)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maxLength2() {
        assertThat<Int>(Solution().maxLength(intArrayOf(2, 3, 4, 5, 6)), equalTo<Int>(3))
    }

    @Test
    fun maxLength3() {
        assertThat<Int>(
            Solution().maxLength(intArrayOf(1, 2, 3, 1, 4, 5, 1)),
            equalTo<Int>(5),
        )
    }
}
