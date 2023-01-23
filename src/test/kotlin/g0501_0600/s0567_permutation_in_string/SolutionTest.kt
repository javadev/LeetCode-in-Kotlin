package g0501_0600.s0567_permutation_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkInclusion() {
        assertThat(Solution().checkInclusion("ab", "eidbaooo"), equalTo(true))
    }

    @Test
    fun checkInclusion2() {
        assertThat(Solution().checkInclusion("ab", "eidboaoo"), equalTo(false))
    }
}
