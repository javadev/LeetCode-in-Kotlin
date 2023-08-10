package g2701_2800.s2761_prime_pairs_with_target_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPrimePairs() {
        assertThat(Solution().findPrimePairs(10), equalTo(listOf(listOf(3, 7), listOf(5, 5))))
    }

    @Test
    fun findPrimePairs2() {
        assertThat(Solution().findPrimePairs(2), equalTo(listOf()))
    }
}
