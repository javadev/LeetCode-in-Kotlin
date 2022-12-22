package g0401_0500.s0434_number_of_segments_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSegments() {
        assertThat(Solution().countSegments("Hello, my name is John"), equalTo(5))
    }

    @Test
    fun countSegments2() {
        assertThat(Solution().countSegments("Hello"), equalTo(1))
    }
}
