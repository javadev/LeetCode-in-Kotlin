package g2901_3000.s2957_remove_adjacent_almost_equal_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeAlmostEqualCharacters() {
        assertThat(Solution().removeAlmostEqualCharacters("aaaaa"), equalTo(2))
    }

    @Test
    fun removeAlmostEqualCharacters2() {
        assertThat(Solution().removeAlmostEqualCharacters("abddez"), equalTo(2))
    }

    @Test
    fun removeAlmostEqualCharacters3() {
        assertThat(Solution().removeAlmostEqualCharacters("zyxyxyz"), equalTo(3))
    }
}
