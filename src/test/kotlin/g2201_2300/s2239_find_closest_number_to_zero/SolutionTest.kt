package g2201_2300.s2239_find_closest_number_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findClosestNumber() {
        assertThat(Solution().findClosestNumber(intArrayOf(-4, -2, 1, 4, 8)), equalTo(1))
    }

    @Test
    fun findClosestNumber2() {
        assertThat(Solution().findClosestNumber(intArrayOf(2, -1, 1)), equalTo(1))
    }
}
