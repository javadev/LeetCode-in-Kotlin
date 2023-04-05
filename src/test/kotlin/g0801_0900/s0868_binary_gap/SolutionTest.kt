package g0801_0900.s0868_binary_gap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun binaryGap() {
        assertThat(Solution().binaryGap(22), equalTo(2))
    }

    @Test
    fun binaryGap2() {
        assertThat(Solution().binaryGap(8), equalTo(0))
    }

    @Test
    fun binaryGap3() {
        assertThat(Solution().binaryGap(5), equalTo(2))
    }
}
