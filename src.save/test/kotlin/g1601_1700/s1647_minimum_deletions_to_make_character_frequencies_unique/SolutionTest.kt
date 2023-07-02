package g1601_1700.s1647_minimum_deletions_to_make_character_frequencies_unique

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletions() {
        assertThat(Solution().minDeletions("aab"), equalTo(0))
    }

    @Test
    fun minDeletions2() {
        assertThat(Solution().minDeletions("aaabbbcc"), equalTo(2))
    }

    @Test
    fun minDeletions3() {
        assertThat(Solution().minDeletions("ceabaacb"), equalTo(2))
    }
}
