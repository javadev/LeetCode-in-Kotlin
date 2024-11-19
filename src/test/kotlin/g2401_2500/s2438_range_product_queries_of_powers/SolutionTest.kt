package g2401_2500.s2438_range_product_queries_of_powers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun productQueries() {
        assertThat(
            Solution().productQueries(15, arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(0, 3))),
            equalTo(intArrayOf(2, 4, 64)),
        )
    }

    @Test
    fun productQueries2() {
        assertThat(
            Solution().productQueries(2, arrayOf(intArrayOf(0, 0))),
            equalTo(
                intArrayOf(2),
            ),
        )
    }
}
