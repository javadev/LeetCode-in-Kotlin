package g1501_1600.s1594_maximum_non_negative_product_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProductPath() {
        assertThat(
            Solution()
                .maxProductPath(arrayOf(intArrayOf(-1, -2, -3), intArrayOf(-2, -3, -3), intArrayOf(-3, -3, -2))),
            equalTo(-1)
        )
    }

    @Test
    fun maxProductPath2() {
        assertThat(
            Solution().maxProductPath(arrayOf(intArrayOf(1, -2, 1), intArrayOf(1, -2, 1), intArrayOf(3, -4, 1))),
            equalTo(8)
        )
    }

    @Test
    fun maxProductPath3() {
        assertThat(
            Solution().maxProductPath(arrayOf(intArrayOf(1, 3), intArrayOf(0, -4))),
            equalTo(0)
        )
    }
}
