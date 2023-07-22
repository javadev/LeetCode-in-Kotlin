package g2401_2500.s2475_number_of_unequal_triplets_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun unequalTriplets() {
        assertThat(Solution().unequalTriplets(intArrayOf(4, 4, 2, 4, 3)), equalTo(3))
    }

    @Test
    fun unequalTriplets2() {
        assertThat(Solution().unequalTriplets(intArrayOf(1, 1, 1, 1, 1)), equalTo(0))
    }
}
