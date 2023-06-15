package g1601_1700.s1653_minimum_deletions_to_make_string_balanced

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDeletions() {
        assertThat(Solution().minimumDeletions("aababbab"), equalTo(2))
    }

    @Test
    fun minimumDeletions2() {
        assertThat(Solution().minimumDeletions("bbaaaaabb"), equalTo(2))
    }
}
