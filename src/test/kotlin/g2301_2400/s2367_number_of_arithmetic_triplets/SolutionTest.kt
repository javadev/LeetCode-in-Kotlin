package g2301_2400.s2367_number_of_arithmetic_triplets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arithmeticTriplets() {
        assertThat(
            Solution().arithmeticTriplets(intArrayOf(0, 1, 4, 6, 7, 10), 3),
            equalTo(2),
        )
    }

    @Test
    fun arithmeticTriplets2() {
        assertThat(
            Solution().arithmeticTriplets(intArrayOf(4, 5, 6, 7, 8, 9), 2),
            equalTo(2),
        )
    }
}
