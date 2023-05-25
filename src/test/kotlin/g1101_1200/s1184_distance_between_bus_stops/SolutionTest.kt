package g1101_1200.s1184_distance_between_bus_stops

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distanceBetweenBusStops() {
        MatcherAssert.assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 0, 1), CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun distanceBetweenBusStops2() {
        MatcherAssert.assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 0, 2), CoreMatchers.equalTo(3)
        )
    }

    @Test
    fun distanceBetweenBusStops3() {
        MatcherAssert.assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 0, 3), CoreMatchers.equalTo(4)
        )
    }
}
