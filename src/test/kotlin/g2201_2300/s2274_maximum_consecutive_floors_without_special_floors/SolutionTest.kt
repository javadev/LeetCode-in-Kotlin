package g2201_2300.s2274_maximum_consecutive_floors_without_special_floors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxConsecutive() {
        assertThat(Solution().maxConsecutive(2, 9, intArrayOf(4, 6)), equalTo(3))
    }

    @Test
    fun maxConsecutive2() {
        assertThat(Solution().maxConsecutive(6, 8, intArrayOf(7, 6, 8)), equalTo(0))
    }
}
