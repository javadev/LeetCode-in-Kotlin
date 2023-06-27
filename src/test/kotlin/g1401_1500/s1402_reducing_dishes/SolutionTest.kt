package g1401_1500.s1402_reducing_dishes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSatisfaction() {
        assertThat(Solution().maxSatisfaction(intArrayOf(-1, -8, 0, 5, -9)), equalTo(14))
    }

    @Test
    fun maxSatisfaction2() {
        assertThat(Solution().maxSatisfaction(intArrayOf(4, 3, 2)), equalTo(20))
    }

    @Test
    fun maxSatisfaction3() {
        assertThat(Solution().maxSatisfaction(intArrayOf(-1, -4, -5)), equalTo(0))
    }
}
