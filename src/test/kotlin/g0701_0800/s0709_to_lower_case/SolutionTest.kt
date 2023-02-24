package g0701_0800.s0709_to_lower_case

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun toLowerCase() {
        assertThat(Solution().toLowerCase("Hello"), equalTo("hello"))
    }

    @Test
    fun toLowerCase2() {
        assertThat(Solution().toLowerCase("Here"), equalTo("here"))
    }

    @Test
    fun toLowerCase3() {
        assertThat(Solution().toLowerCase("LOVELY"), equalTo("lovely"))
    }
}
