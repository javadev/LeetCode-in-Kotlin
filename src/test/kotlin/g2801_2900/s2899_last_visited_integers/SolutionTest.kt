package g2801_2900.s2899_last_visited_integers

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastVisitedIntegers() {
        MatcherAssert.assertThat(
            Solution().lastVisitedIntegers(mutableListOf("1", "2", "prev", "prev", "prev")),
            CoreMatchers.equalTo(listOf(2, 1, -1))
        )
    }

    @Test
    fun lastVisitedIntegers2() {
        MatcherAssert.assertThat(
            Solution().lastVisitedIntegers(mutableListOf("1", "prev", "2", "prev", "prev")),
            CoreMatchers.equalTo(mutableListOf(1, 2, 1))
        )
    }
}
