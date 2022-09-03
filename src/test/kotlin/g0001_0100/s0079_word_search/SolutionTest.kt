package g0001_0100.s0079_word_search

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun exist() {
        val input =
            arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E'))
        assertThat(Solution().exist(input, "ABCCED"), equalTo(true))
    }

    @Test
    fun exist2() {
        val input =
            arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E'))
        assertThat(Solution().exist(input, "SEE"), equalTo(true))
    }

    @Test
    fun exist3() {
        val input =
            arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E'))
        assertThat(Solution().exist(input, "ABCB"), equalTo(false))
    }
}
