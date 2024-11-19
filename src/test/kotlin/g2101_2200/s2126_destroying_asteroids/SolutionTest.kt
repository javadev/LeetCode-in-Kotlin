package g2101_2200.s2126_destroying_asteroids

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun asteroidsDestroyed() {
        assertThat(
            Solution().asteroidsDestroyed(10, intArrayOf(3, 9, 19, 5, 21)),
            equalTo(true),
        )
    }

    @Test
    fun asteroidsDestroyed2() {
        assertThat(Solution().asteroidsDestroyed(5, intArrayOf(4, 9, 23, 4)), equalTo(false))
    }
}
