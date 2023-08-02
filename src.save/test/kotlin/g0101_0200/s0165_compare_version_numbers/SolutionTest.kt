package g0101_0200.s0165_compare_version_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun compareVersion() {
        assertThat(Solution().compareVersion("1.01", "1.001"), equalTo(0))
    }

    @Test
    fun compareVersion2() {
        assertThat(Solution().compareVersion("1.0", "1.0.0"), equalTo(0))
    }

    @Test
    fun compareVersion3() {
        assertThat(Solution().compareVersion("0.1", "1.1"), equalTo(-1))
    }
}
