package g2501_2600.s2566_maximum_difference_by_remapping_a_digit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMaxDifference() {
        assertThat(
            Solution().minMaxDifference(11891),
            equalTo(99009),
        )
    }

    @Test
    fun minMaxDifference2() {
        assertThat(
            Solution().minMaxDifference(90),
            equalTo(99),
        )
    }
}
