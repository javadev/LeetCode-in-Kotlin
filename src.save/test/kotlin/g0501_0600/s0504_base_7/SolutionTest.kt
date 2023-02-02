package g0501_0600.s0504_base_7

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertToBase7() {
        assertThat(Solution().convertToBase7(100), equalTo("202"))
    }

    @Test
    fun convertToBase72() {
        assertThat(Solution().convertToBase7(-7), equalTo("-10"))
    }
}
