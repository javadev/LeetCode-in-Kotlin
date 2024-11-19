package g1201_1300.s1235_maximum_profit_in_job_scheduling

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun jobScheduling() {
        assertThat(
            Solution()
                .jobScheduling(intArrayOf(1, 2, 3, 3), intArrayOf(3, 4, 5, 6), intArrayOf(50, 10, 40, 70)),
            equalTo(120),
        )
    }

    @Test
    fun jobScheduling2() {
        assertThat(
            Solution()
                .jobScheduling(intArrayOf(1, 2, 3, 4, 6), intArrayOf(3, 5, 10, 6, 9), intArrayOf(20, 20, 100, 70, 60)),
            equalTo(150),
        )
    }

    @Test
    fun jobScheduling3() {
        assertThat(
            Solution()
                .jobScheduling(intArrayOf(1, 1, 1), intArrayOf(2, 3, 4), intArrayOf(5, 6, 4)),
            equalTo(6),
        )
    }
}
