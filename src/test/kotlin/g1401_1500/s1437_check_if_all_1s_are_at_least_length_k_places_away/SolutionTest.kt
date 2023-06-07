package g1401_1500.s1437_check_if_all_1s_are_at_least_length_k_places_away

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kLengthApart() {
        assertThat(
            Solution().kLengthApart(intArrayOf(1, 0, 0, 0, 1, 0, 0, 1), 2), equalTo(true)
        )
    }

    @Test
    fun kLengthApart2() {
        assertThat(Solution().kLengthApart(intArrayOf(1, 0, 0, 1, 0, 1), 2), equalTo(false))
    }
}
