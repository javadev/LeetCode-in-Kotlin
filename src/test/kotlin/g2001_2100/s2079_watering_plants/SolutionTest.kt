package g2001_2100.s2079_watering_plants

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wateringPlants() {
        assertThat(Solution().wateringPlants(intArrayOf(2, 2, 3, 3), 5), equalTo(14))
    }

    @Test
    fun wateringPlants2() {
        assertThat(Solution().wateringPlants(intArrayOf(1, 1, 1, 4, 2, 3), 4), equalTo(30))
    }

    @Test
    fun wateringPlants3() {
        assertThat(
            Solution().wateringPlants(intArrayOf(7, 7, 7, 7, 7, 7, 7), 8),
            equalTo(49)
        )
    }
}
