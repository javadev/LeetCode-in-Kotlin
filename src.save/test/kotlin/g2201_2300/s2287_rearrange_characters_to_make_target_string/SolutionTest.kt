package g2201_2300.s2287_rearrange_characters_to_make_target_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rearrangeCharacters() {
        assertThat(Solution().rearrangeCharacters("abcba", "abc"), equalTo(1))
    }

    @Test
    fun rearrangeCharacters2() {
        assertThat(Solution().rearrangeCharacters("abbaccaddaeea", "aaaaa"), equalTo(1))
    }
}
