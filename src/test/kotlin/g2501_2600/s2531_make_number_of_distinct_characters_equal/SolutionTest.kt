package g2501_2600.s2531_make_number_of_distinct_characters_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isItPossible() {
        assertThat(Solution().isItPossible("ac", "b"), equalTo(false))
    }

    @Test
    fun isItPossible2() {
        assertThat(Solution().isItPossible("abcc", "aab"), equalTo(true))
    }
}
