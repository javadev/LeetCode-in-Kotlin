package g0001_0100.s0079_word_search

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun exist() {
        assertThat(Solution().exist(arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')), "ABCCED"), equalTo(true))
    }

    @Test
    fun exist2() {
        assertThat(Solution().exist(arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')), "SEE"), equalTo(true))
    }

    @Test
    fun exist3() {
        assertThat(Solution().exist(arrayOf(charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')), "ABAB"), equalTo(false))
    }
}
