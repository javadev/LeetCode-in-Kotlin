package g1701_1800.s1784_check_if_binary_string_has_at_most_one_segment_of_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkOnesSegment() {
        assertThat(Solution().checkOnesSegment("1001"), equalTo(false))
    }

    @Test
    fun checkOnesSegment2() {
        assertThat(Solution().checkOnesSegment("110"), equalTo(true))
    }
}
