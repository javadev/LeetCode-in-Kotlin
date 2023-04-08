package g0801_0900.s0873_length_of_longest_fibonacci_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lenLongestFibSubseq() {
        assertThat(
            Solution().lenLongestFibSubseq(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)), equalTo(5)
        )
    }

    @Test
    fun lenLongestFibSubseq2() {
        assertThat(
            Solution().lenLongestFibSubseq(intArrayOf(1, 3, 7, 11, 12, 14, 18)),
            equalTo(3)
        )
    }
}
