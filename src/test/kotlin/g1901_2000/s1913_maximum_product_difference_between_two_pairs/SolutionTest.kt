package g1901_2000.s1913_maximum_product_difference_between_two_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProductDifference() {
        assertThat(Solution().maxProductDifference(intArrayOf(5, 6, 2, 7, 4)), equalTo(34))
    }

    @Test
    fun maxProductDifference2() {
        assertThat(
            Solution().maxProductDifference(intArrayOf(4, 2, 5, 9, 7, 4, 8)),
            equalTo(64),
        )
    }
}
