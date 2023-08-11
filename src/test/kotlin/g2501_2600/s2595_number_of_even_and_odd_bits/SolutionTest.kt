package g2501_2600.s2595_number_of_even_and_odd_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evenOddBit() {
        assertThat(Solution().evenOddBit(17), equalTo(intArrayOf(2, 0)))
    }

    @Test
    fun evenOddBit2() {
        assertThat(Solution().evenOddBit(2), equalTo(intArrayOf(0, 1)))
    }
}
