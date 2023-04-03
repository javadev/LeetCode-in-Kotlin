package g0801_0900.s0860_lemonade_change

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lemonadeChange() {
        assertThat(Solution().lemonadeChange(intArrayOf(5, 5, 5, 10, 20)), equalTo(true))
    }

    @Test
    fun lemonadeChange2() {
        assertThat(Solution().lemonadeChange(intArrayOf(5, 5, 10, 10, 20)), equalTo(false))
    }
}
