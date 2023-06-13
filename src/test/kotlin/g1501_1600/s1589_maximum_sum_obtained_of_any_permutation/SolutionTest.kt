package g1501_1600.s1589_maximum_sum_obtained_of_any_permutation

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumRangeQuery() {
        MatcherAssert.assertThat(
            Solution()
                .maxSumRangeQuery(intArrayOf(1, 2, 3, 4, 5), arrayOf(intArrayOf(1, 3), intArrayOf(0, 1))),
            CoreMatchers.equalTo(19)
        )
    }

    @Test
    fun maxSumRangeQuery2() {
        MatcherAssert.assertThat(
            Solution().maxSumRangeQuery(intArrayOf(1, 2, 3, 4, 5, 6), arrayOf(intArrayOf(0, 1))),
            CoreMatchers.equalTo(11)
        )
    }
}
