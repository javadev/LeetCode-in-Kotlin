package g2101_2200.s2105_watering_plants_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumRefill() {
        assertThat(Solution().minimumRefill(intArrayOf(2, 2, 3, 3), 5, 5), equalTo(1))
    }

    @Test
    fun minimumRefill2() {
        assertThat(Solution().minimumRefill(intArrayOf(2, 2, 3, 3), 3, 4), equalTo(2))
    }

    @Test
    fun minimumRefill3() {
        assertThat(Solution().minimumRefill(intArrayOf(5), 10, 8), equalTo(0))
    }

    @Test
    fun minimumRefill4() {
        assertThat(Solution().minimumRefill(intArrayOf(1, 2, 4, 4, 5), 6, 5), equalTo(2))
    }
}
