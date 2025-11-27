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

    @Test
    fun kItemsWithMaximumSum3() {
        assertThat(Solution().kItemsWithMaximumSum(5, 3, 2, 5), equalTo(5))
    }

    @Test
    fun kItemsWithMaximumSum4() {
        assertThat(Solution().kItemsWithMaximumSum(3, 4, 5, 7), equalTo(3))
    }

    @Test
    fun kItemsWithMaximumSum5() {
        assertThat(Solution().kItemsWithMaximumSum(3, 1, 5, 6), equalTo(1))
    }

    @Test
    fun kItemsWithMaximumSum6() {
        assertThat(Solution().kItemsWithMaximumSum(2, 1, 10, 13), equalTo(-8))
    }

    @Test
    fun kItemsWithMaximumSum7() {
        assertThat(Solution().kItemsWithMaximumSum(0, 5, 5, 3), equalTo(0))
    }

    @Test
    fun kItemsWithMaximumSum8() {
        assertThat(Solution().kItemsWithMaximumSum(2, 0, 5, 3), equalTo(1))
    }

    @Test
    fun kItemsWithMaximumSum9() {
        assertThat(Solution().kItemsWithMaximumSum(4, 3, 0, 6), equalTo(4))
    }

    @Test
    fun kItemsWithMaximumSum10() {
        assertThat(Solution().kItemsWithMaximumSum(5, 5, 5, 0), equalTo(0))
    }
}
