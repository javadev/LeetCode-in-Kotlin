package g2501_2600.s2600_k_items_with_the_maximum_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kItemsWithMaximumSum() {
        assertThat(Solution().kItemsWithMaximumSum(3, 2, 0, 2), equalTo(2))
    }

    @Test
    fun kItemsWithMaximumSum2() {
        assertThat(Solution().kItemsWithMaximumSum(3, 2, 0, 4), equalTo(3))
    }
}
