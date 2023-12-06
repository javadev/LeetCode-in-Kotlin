package g2801_2900.s2809_minimum_time_to_make_array_sum_at_most_x

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

// #Hard #Array #Dynamic_Programming #Sorting
internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat(
            Solution().minimumTime(mutableListOf<Int?>(1, 2, 3), mutableListOf<Int?>(1, 2, 3), 4),
            equalTo(3)
        )
    }

    @Test
    fun minimumTime2() {
        assertThat(
            Solution().minimumTime(mutableListOf<Int?>(1, 2, 3), mutableListOf<Int?>(3, 3, 3), 4),
            equalTo(-1)
        )
    }
}
