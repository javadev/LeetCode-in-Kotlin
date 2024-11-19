package g1001_1100.s1036_escape_a_large_maze

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isEscapePossible() {
        assertThat(
            Solution()
                .isEscapePossible(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)), intArrayOf(0, 0), intArrayOf(0, 2)),
            equalTo(false),
        )
    }

    @Test
    fun isEscapePossible2() {
        assertThat(
            Solution()
                .isEscapePossible(arrayOf(), intArrayOf(0, 0), intArrayOf(999999, 999999)),
            equalTo(true),
        )
    }
}
