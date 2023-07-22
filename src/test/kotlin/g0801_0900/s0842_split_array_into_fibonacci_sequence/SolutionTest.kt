package g0801_0900.s0842_split_array_into_fibonacci_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitIntoFibonacci() {
        assertThat(
            Solution().splitIntoFibonacci("1101111"),
            equalTo(listOf(11, 0, 11, 11))
        )
    }

    @Test
    fun splitIntoFibonacci2() {
        assertThat(
            Solution().splitIntoFibonacci("112358130"), equalTo(emptyList())
        )
    }

    @Test
    fun splitIntoFibonacci3() {
        assertThat(Solution().splitIntoFibonacci("0123"), equalTo(emptyList()))
    }
}
