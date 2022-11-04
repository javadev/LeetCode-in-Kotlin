package g0201_0300.s0278_first_bad_version

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstBadVersion() {
        assertThat(Solution().firstBadVersion(5), equalTo(4))
    }

    @Test
    fun firstBadVersion2() {
        assertThat(Solution().firstBadVersion(1), equalTo(1))
    }
}
