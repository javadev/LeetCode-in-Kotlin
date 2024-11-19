package g2801_2900.s2899_last_visited_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastVisitedIntegers() {
        assertThat(
            Solution().lastVisitedIntegers(mutableListOf("1", "2", "prev", "prev", "prev")),
            equalTo(listOf(2, 1, -1)),
        )
    }

    @Test
    fun lastVisitedIntegers2() {
        assertThat(
            Solution().lastVisitedIntegers(mutableListOf("1", "prev", "2", "prev", "prev")),
            equalTo(mutableListOf(1, 2, 1)),
        )
    }
}
