package g0701_0800.s0789_escape_the_ghosts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun escapeGhosts() {
        assertThat(
            Solution().escapeGhosts(arrayOf(intArrayOf(1, 0), intArrayOf(0, 3)), intArrayOf(0, 1)),
            equalTo(true)
        )
    }

    @Test
    fun escapeGhosts2() {
        assertThat(
            Solution().escapeGhosts(arrayOf(intArrayOf(1, 0)), intArrayOf(2, 0)),
            equalTo(false)
        )
    }

    @Test
    fun escapeGhosts3() {
        assertThat(
            Solution().escapeGhosts(arrayOf(intArrayOf(2, 0)), intArrayOf(1, 0)),
            equalTo(false)
        )
    }
}
