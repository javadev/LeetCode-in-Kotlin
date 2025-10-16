package g3601_3700.s3680_generate_schedule

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateSchedule() {
        assertThat<Array<IntArray>>(Solution().generateSchedule(3), equalTo(intArrayOf()))
    }

    @Test
    fun generateSchedule2() {
        assertThat<Array<IntArray>>(
            Solution().generateSchedule(5),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(0, 2),
                    intArrayOf(1, 3),
                    intArrayOf(2, 4),
                    intArrayOf(3, 0),
                    intArrayOf(4, 1),
                    intArrayOf(0, 3),
                    intArrayOf(1, 4),
                    intArrayOf(2, 0),
                    intArrayOf(3, 1),
                    intArrayOf(4, 2),
                    intArrayOf(0, 1),
                    intArrayOf(4, 3),
                    intArrayOf(1, 2),
                    intArrayOf(0, 4),
                    intArrayOf(2, 3),
                    intArrayOf(1, 0),
                    intArrayOf(3, 4),
                    intArrayOf(2, 1),
                    intArrayOf(4, 0),
                    intArrayOf(3, 2),
                ),
            ),
        )
    }
}
