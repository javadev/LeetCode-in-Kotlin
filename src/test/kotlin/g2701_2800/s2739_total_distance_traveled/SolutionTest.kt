package g2701_2800.s2739_total_distance_traveled

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distanceTraveled() {
        assertThat(Solution().distanceTraveled(5, 10), equalTo(60))
    }

    @Test
    fun distanceTraveled2() {
        assertThat(Solution().distanceTraveled(1, 2), equalTo(10))
    }
}
