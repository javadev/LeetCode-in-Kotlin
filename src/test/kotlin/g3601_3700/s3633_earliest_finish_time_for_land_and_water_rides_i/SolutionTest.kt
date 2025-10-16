package g3601_3700.s3633_earliest_finish_time_for_land_and_water_rides_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun earliestFinishTime() {
        assertThat<Int>(
            Solution()
                .earliestFinishTime(
                    intArrayOf(2, 8),
                    intArrayOf(4, 1),
                    intArrayOf(6),
                    intArrayOf(3),
                ),
            equalTo<Int>(9),
        )
    }

    @Test
    fun earliestFinishTime2() {
        assertThat<Int>(
            Solution()
                .earliestFinishTime(
                    intArrayOf(5),
                    intArrayOf(3),
                    intArrayOf(1),
                    intArrayOf(10),
                ),
            equalTo<Int>(14),
        )
    }
}
