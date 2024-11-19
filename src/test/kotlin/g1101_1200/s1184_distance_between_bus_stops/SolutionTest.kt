package g1101_1200.s1184_distance_between_bus_stops

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distanceBetweenBusStops() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 0, 1),
            equalTo(1),
        )
    }

    @Test
    fun distanceBetweenBusStops2() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 0, 2),
            equalTo(3),
        )
    }

    @Test
    fun distanceBetweenBusStops3() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 0, 3),
            equalTo(4),
        )
    }
}
