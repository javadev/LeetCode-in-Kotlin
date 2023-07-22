package g1501_1600.s1537_get_the_maximum_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat(
            Solution().maxSum(intArrayOf(2, 4, 5, 8, 10), intArrayOf(4, 6, 8, 9)),
            equalTo(30)
        )
    }

    @Test
    fun maxSum2() {
        assertThat(
            Solution().maxSum(intArrayOf(1, 3, 5, 7, 9), intArrayOf(3, 5, 100)),
            equalTo(109)
        )
    }

    @Test
    fun maxSum3() {
        assertThat(
            Solution().maxSum(intArrayOf(1, 2, 3, 4, 5), intArrayOf(6, 7, 8, 9, 10)),
            equalTo(40)
        )
    }
}
