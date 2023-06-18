package g1701_1800.s1732_find_the_highest_altitude

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestAltitude() {
        assertThat(Solution().largestAltitude(intArrayOf(-5, 1, 5, 0, -7)), equalTo(1))
    }

    @Test
    fun largestAltitude2() {
        assertThat(Solution().largestAltitude(intArrayOf(-4, -3, -2, -1, 4, 3, 2)), equalTo(0))
    }
}
