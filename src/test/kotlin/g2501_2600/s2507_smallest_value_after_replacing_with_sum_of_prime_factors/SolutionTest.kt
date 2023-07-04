package g2501_2600.s2507_smallest_value_after_replacing_with_sum_of_prime_factors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestValue() {
        assertThat(Solution().smallestValue(15), equalTo(5))
    }

    @Test
    fun smallestValue2() {
        assertThat(Solution().smallestValue(3), equalTo(3))
    }
}
