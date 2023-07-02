package g2301_2400.s2380_time_needed_to_rearrange_a_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun secondsToRemoveOccurrences() {
        assertThat(Solution().secondsToRemoveOccurrences("0110101"), equalTo(4))
    }

    @Test
    fun secondsToRemoveOccurrences2() {
        assertThat(Solution().secondsToRemoveOccurrences("11100"), equalTo(0))
    }
}
