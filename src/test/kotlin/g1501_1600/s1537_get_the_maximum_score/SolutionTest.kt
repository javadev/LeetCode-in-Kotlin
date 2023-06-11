package g1501_1600.s1537_get_the_maximum_score

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        MatcherAssert.assertThat(
            Solution().maxSum(intArrayOf(2, 4, 5, 8, 10), intArrayOf(4, 6, 8, 9)),
            CoreMatchers.equalTo(30)
        )
    }

    @Test
    fun maxSum2() {
        MatcherAssert.assertThat(
            Solution().maxSum(intArrayOf(1, 3, 5, 7, 9), intArrayOf(3, 5, 100)),
            CoreMatchers.equalTo(109)
        )
    }

    @Test
    fun maxSum3() {
        MatcherAssert.assertThat(
            Solution().maxSum(intArrayOf(1, 2, 3, 4, 5), intArrayOf(6, 7, 8, 9, 10)),
            CoreMatchers.equalTo(40)
        )
    }
}
