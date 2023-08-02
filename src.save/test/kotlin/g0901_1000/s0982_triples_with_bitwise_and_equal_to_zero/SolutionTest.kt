package g0901_1000.s0982_triples_with_bitwise_and_equal_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTriplets() {
        assertThat(Solution().countTriplets(intArrayOf(2, 1, 3)), equalTo(12))
    }

    @Test
    fun countTriplets2() {
        assertThat(Solution().countTriplets(intArrayOf(0, 0, 0)), equalTo(27))
    }
}
