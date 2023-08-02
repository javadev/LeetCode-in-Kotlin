package g2501_2600.s2516_take_k_of_each_character_from_left_and_right

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun takeCharacters() {
        assertThat(Solution().takeCharacters("aabaaaacaabc", 2), equalTo(8))
    }

    @Test
    fun takeCharacters2() {
        assertThat(Solution().takeCharacters("a", 1), equalTo(-1))
    }
}
