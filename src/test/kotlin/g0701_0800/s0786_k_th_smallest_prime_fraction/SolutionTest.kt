package g0701_0800.s0786_k_th_smallest_prime_fraction

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallestPrimeFraction() {
        assertThat(
            Solution().kthSmallestPrimeFraction(intArrayOf(1, 2, 3, 5), 3),
            equalTo(intArrayOf(2, 5)),
        )
    }

    @Test
    fun kthSmallestPrimeFraction2() {
        assertThat(
            Solution().kthSmallestPrimeFraction(intArrayOf(1, 7), 1),
            equalTo(intArrayOf(1, 7)),
        )
    }
}
