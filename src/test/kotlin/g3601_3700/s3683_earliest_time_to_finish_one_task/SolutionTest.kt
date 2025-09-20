package g3601_3700.s3683_earliest_time_to_finish_one_task

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun earliestTime() {
        assertThat<Int>(
            Solution().earliestTime(arrayOf<IntArray>(intArrayOf(1, 6), intArrayOf(2, 3))),
            equalTo<Int>(5),
        )
    }

    @Test
    fun earliestTime2() {
        assertThat<Int>(
            Solution().earliestTime(
                arrayOf<IntArray>(
                    intArrayOf(100, 100),
                    intArrayOf(100, 100),
                    intArrayOf(100, 100),
                ),
            ),
            equalTo<Int>(200),
        )
    }

    @Test
    fun earliestTime3() {
        assertThat<Int>(
            Solution().earliestTime(arrayOf<IntArray>(intArrayOf(1, 6))),
            equalTo<Int>(7),
        )
    }
}
