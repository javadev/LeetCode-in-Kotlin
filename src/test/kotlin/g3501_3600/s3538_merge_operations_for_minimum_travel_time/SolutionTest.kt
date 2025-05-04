package g3501_3600.s3538_merge_operations_for_minimum_travel_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTravelTime() {
        assertThat<Int>(
            Solution()
                .minTravelTime(10, 4, 1, intArrayOf(0, 3, 8, 10), intArrayOf(5, 8, 3, 6)),
            equalTo<Int>(62),
        )
    }

    @Test
    fun minTravelTime2() {
        assertThat<Int>(
            Solution()
                .minTravelTime(
                    5,
                    5,
                    1,
                    intArrayOf(0, 1, 2, 3, 5),
                    intArrayOf(8, 3, 9, 3, 3),
                ),
            equalTo<Int>(34),
        )
    }
}
