package g0501_0600.s0539_minimum_time_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.stream.IntStream

internal class SolutionTest {
    @Test
    fun findMinDifference() {
        assertThat(Solution().findMinDifference(listOf("23:59", "00:00")), equalTo(1))
    }

    @Test
    fun findMinDifference2() {
        assertThat(
            Solution().findMinDifference(listOf("00:00", "23:59", "00:00")),
            equalTo(0)
        )
    }

    @Test
    fun findMinDifference3() {
        val timePoints: MutableList<String> = ArrayList()
        IntStream.rangeClosed(0, 310 / 2)
            .forEach { _: Int ->
                timePoints.add("23:59")
                timePoints.add("00:00")
            }
        assertThat(Solution().findMinDifference(timePoints), equalTo(0))
    }

    @Test
    fun findMinDifference4() {
        val timePoints: MutableList<String> = ArrayList()
        var index = 0
        while (index < 301) {
            val hour = index / 60 % 24
            val minute = index % 60
            timePoints.add(
                String.format(
                    "%s:%s",
                    if (hour < 10) "0$hour" else hour, if (minute < 10) "0$minute" else minute
                )
            )
            index++
        }
        assertThat(Solution().findMinDifference(timePoints), equalTo(1))
    }
}
