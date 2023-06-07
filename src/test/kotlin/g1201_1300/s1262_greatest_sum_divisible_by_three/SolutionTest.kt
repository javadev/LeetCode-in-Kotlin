package g1201_1300.s1262_greatest_sum_divisible_by_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumDivThree() {
        assertThat(Solution().maxSumDivThree(intArrayOf(3, 6, 5, 1, 8)), equalTo(18))
    }

    @Test
    fun maxSumDivThree2() {
        assertThat(Solution().maxSumDivThree(intArrayOf(4)), equalTo(0))
    }

    @Test
    fun maxSumDivThree3() {
        assertThat(Solution().maxSumDivThree(intArrayOf(1, 2, 3, 4, 4)), equalTo(12))
    }
}
