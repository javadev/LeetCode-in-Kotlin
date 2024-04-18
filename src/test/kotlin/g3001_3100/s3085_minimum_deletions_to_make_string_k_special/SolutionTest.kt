package g3001_3100.s3085_minimum_deletions_to_make_string_k_special

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDeletions() {
        assertThat(Solution().minimumDeletions("aabcaba", 0), equalTo(3))
    }

    @Test
    fun minimumDeletions2() {
        assertThat(Solution().minimumDeletions("dabdcbdcdcd", 2), equalTo(2))
    }

    @Test
    fun minimumDeletions3() {
        assertThat(Solution().minimumDeletions("aaabaaa", 2), equalTo(1))
    }
}
