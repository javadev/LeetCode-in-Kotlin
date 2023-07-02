package g0901_1000.s0997_find_the_town_judge

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findJudge() {
        assertThat(Solution().findJudge(2, arrayOf(intArrayOf(1, 2))), equalTo(2))
    }

    @Test
    fun findJudge2() {
        assertThat(Solution().findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))), equalTo(3))
    }
}
