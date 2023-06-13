package g1501_1600.s1594_maximum_non_negative_product_in_a_matrix

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProductPath() {
        MatcherAssert.assertThat(
            Solution()
                .maxProductPath(arrayOf(intArrayOf(-1, -2, -3), intArrayOf(-2, -3, -3), intArrayOf(-3, -3, -2))),
            CoreMatchers.equalTo(-1)
        )
    }

    @Test
    fun maxProductPath2() {
        MatcherAssert.assertThat(
            Solution().maxProductPath(arrayOf(intArrayOf(1, -2, 1), intArrayOf(1, -2, 1), intArrayOf(3, -4, 1))),
            CoreMatchers.equalTo(8)
        )
    }

    @Test
    fun maxProductPath3() {
        MatcherAssert.assertThat(
            Solution().maxProductPath(arrayOf(intArrayOf(1, 3), intArrayOf(0, -4))),
            CoreMatchers.equalTo(0)
        )
    }
}
