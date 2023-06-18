package g1601_1700.s1647_minimum_deletions_to_make_character_frequencies_unique

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletions() {
        MatcherAssert.assertThat(Solution().minDeletions("aab"), CoreMatchers.equalTo(0))
    }

    @Test
    fun minDeletions2() {
        MatcherAssert.assertThat(Solution().minDeletions("aaabbbcc"), CoreMatchers.equalTo(2))
    }

    @Test
    fun minDeletions3() {
        MatcherAssert.assertThat(Solution().minDeletions("ceabaacb"), CoreMatchers.equalTo(2))
    }
}
