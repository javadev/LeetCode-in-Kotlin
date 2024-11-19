package g2301_2400.s2386_find_the_k_sum_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kSum() {
        assertThat(Solution().kSum(intArrayOf(2, 4, -2), 5), equalTo(2L))
    }

    @Test
    fun kSum2() {
        assertThat(Solution().kSum(intArrayOf(1, -2, 3, 4, -10, 12), 16), equalTo(10L))
    }

    @Test
    fun kSum3() {
        assertThat(
            Solution().kSum(intArrayOf(-530219056, 353285209, 493533664), 6),
            equalTo(-36685392L),
        )
    }
}
