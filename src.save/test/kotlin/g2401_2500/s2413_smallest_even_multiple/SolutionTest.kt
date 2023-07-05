package g2401_2500.s2413_smallest_even_multiple

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestEvenMultiple() {
        assertThat(Solution().smallestEvenMultiple(5), equalTo(10))
    }

    @Test
    fun smallestEvenMultiple2() {
        assertThat(Solution().smallestEvenMultiple(6), equalTo(6))
    }
}
