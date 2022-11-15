package g0301_0400.s0334_increasing_triplet_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun increasingTriplet() {
        assertThat(Solution().increasingTriplet(intArrayOf(1, 2, 3, 4, 5)), equalTo(true))
    }

    @Test
    fun increasingTriplet2() {
        assertThat(Solution().increasingTriplet(intArrayOf(5, 4, 3, 2, 1)), equalTo(false))
    }

    @Test
    fun increasingTriplet3() {
        assertThat(Solution().increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)), equalTo(true))
    }
}
