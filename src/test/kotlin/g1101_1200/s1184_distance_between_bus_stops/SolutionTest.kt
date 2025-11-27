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

    @Test
    fun distanceBetweenBusStops4() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 2, 3, 4), 3, 1),
            equalTo(5),
        )
    }

    @Test
    fun distanceBetweenBusStops5() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(7, 1, 2, 3), 1, 3),
            equalTo(3),
        )
    }

    @Test
    fun distanceBetweenBusStops6() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(2, 2, 2, 2), 1, 3),
            equalTo(4),
        )
    }

    @Test
    fun distanceBetweenBusStops7() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(5), 0, 0),
            equalTo(0),
        )
    }

    @Test
    fun distanceBetweenBusStops8() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(3, 8), 1, 0),
            equalTo(3),
        )
    }

    @Test
    fun distanceBetweenBusStops9() {
        assertThat(
            Solution().distanceBetweenBusStops(intArrayOf(1, 4, 6, 3), 2, 1),
            equalTo(4),
        )
    }
}
