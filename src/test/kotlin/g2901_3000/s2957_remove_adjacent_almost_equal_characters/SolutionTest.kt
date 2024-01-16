package g2901_3000.s2957_remove_adjacent_almost_equal_characters

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeAlmostEqualCharacters() {
        MatcherAssert.assertThat(Solution().removeAlmostEqualCharacters("aaaaa"), CoreMatchers.equalTo(2))
    }

    @Test
    fun removeAlmostEqualCharacters2() {
        MatcherAssert.assertThat(Solution().removeAlmostEqualCharacters("abddez"), CoreMatchers.equalTo(2))
    }

    @Test
    fun removeAlmostEqualCharacters3() {
        MatcherAssert.assertThat(Solution().removeAlmostEqualCharacters("zyxyxyz"), CoreMatchers.equalTo(3))
    }
}
