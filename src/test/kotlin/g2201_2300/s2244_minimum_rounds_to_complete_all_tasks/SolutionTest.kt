package g2201_2300.s2244_minimum_rounds_to_complete_all_tasks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumRounds() {
        assertThat(
            Solution().minimumRounds(intArrayOf(2, 2, 3, 3, 2, 4, 4, 4, 4, 4)), equalTo(4)
        )
    }

    @Test
    fun minimumRounds2() {
        assertThat(Solution().minimumRounds(intArrayOf(2, 3, 3)), equalTo(-1))
    }

    @Test
    fun minimumRounds3() {
        assertThat(Solution().minimumRounds(intArrayOf(2)), equalTo(-1))
    }

    @Test
    fun minimumRounds4() {
        assertThat(Solution().minimumRounds(intArrayOf(4, 4, 4)), equalTo(1))
    }
}
