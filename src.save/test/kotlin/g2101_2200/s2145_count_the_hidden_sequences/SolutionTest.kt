package g2101_2200.s2145_count_the_hidden_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfArrays() {
        assertThat(Solution().numberOfArrays(intArrayOf(1, -3, 4), 1, 6), equalTo(2))
    }

    @Test
    fun numberOfArrays2() {
        assertThat(Solution().numberOfArrays(intArrayOf(3, -4, 5, 1, -2), -4, 5), equalTo(4))
    }

    @Test
    fun numberOfArrays3() {
        assertThat(Solution().numberOfArrays(intArrayOf(4, -7, 2), 3, 6), equalTo(0))
    }

    @Test
    fun numberOfArrays4() {
        assertThat(Solution().numberOfArrays(intArrayOf(4, -7, 2), 3, 3), equalTo(0))
    }
}
