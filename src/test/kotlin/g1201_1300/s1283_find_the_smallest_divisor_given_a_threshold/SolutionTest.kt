package g1201_1300.s1283_find_the_smallest_divisor_given_a_threshold

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestDivisor() {
        assertThat(Solution().smallestDivisor(intArrayOf(1, 2, 5, 9), 6), equalTo(5))
    }

    @Test
    fun smallestDivisor2() {
        assertThat(Solution().smallestDivisor(intArrayOf(44, 22, 33, 11, 1), 5), equalTo(44))
    }
}
