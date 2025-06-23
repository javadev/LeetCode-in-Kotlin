package g3501_3600.s3594_minimum_time_to_transport_all_individuals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTime() {
        assertThat<Double>(
            Solution().minTime(1, 1, 2, intArrayOf(5), doubleArrayOf(1.0, 1.3)),
            equalTo<Double>(5.0),
        )
    }

    @Test
    fun minTime2() {
        assertThat<Double>(
            Solution().minTime(3, 2, 3, intArrayOf(2, 5, 8), doubleArrayOf(1.0, 1.5, 0.75)),
            equalTo<Double>(14.5),
        )
    }

    @Test
    fun minTime3() {
        assertThat<Double>(
            Solution().minTime(2, 1, 2, intArrayOf(10, 10), doubleArrayOf(2.0, 2.0)),
            equalTo<Double>(-1.0),
        )
    }
}
