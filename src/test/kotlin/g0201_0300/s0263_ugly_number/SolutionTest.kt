package g0201_0300.s0263_ugly_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isUgly() {
        assertThat(Solution().isUgly(6), equalTo(true))
    }

    @Test
    fun isUgly2() {
        assertThat(Solution().isUgly(8), equalTo(true))
    }

    @Test
    fun isUgly3() {
        assertThat(Solution().isUgly(14), equalTo(false))
    }

    @Test
    fun isUgly4() {
        assertThat(Solution().isUgly(1), equalTo(true))
    }
}
