package g0901_1000.s0926_flip_string_to_monotone_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlipsMonoIncr() {
        assertThat(Solution().minFlipsMonoIncr("00110"), equalTo(1))
    }

    @Test
    fun minFlipsMonoIncr2() {
        assertThat(Solution().minFlipsMonoIncr("010110"), equalTo(2))
    }

    @Test
    fun minFlipsMonoIncr3() {
        assertThat(Solution().minFlipsMonoIncr("00011000"), equalTo(2))
    }
}
