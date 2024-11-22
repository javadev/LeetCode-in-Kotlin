package g3301_3400.s3341_find_minimum_time_to_reach_last_room_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTimeToReach() {
        assertThat<Int>(
            Solution().minTimeToReach(
                arrayOf<IntArray>(
                    intArrayOf(0, 4),
                    intArrayOf(4, 4),
                ),
            ),
            equalTo<Int>(6),
        )
    }

    @Test
    fun minTimeToReach2() {
        assertThat<Int>(
            Solution().minTimeToReach(
                arrayOf<IntArray>(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 0, 0),
                ),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minTimeToReach3() {
        assertThat<Int>(
            Solution().minTimeToReach(
                arrayOf<IntArray>(
                    intArrayOf(0, 1),
                    intArrayOf(1, 2),
                ),
            ),
            equalTo<Int>(3),
        )
    }
}
