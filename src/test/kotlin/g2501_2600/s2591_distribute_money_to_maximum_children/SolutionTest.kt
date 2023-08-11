package g2501_2600.s2591_distribute_money_to_maximum_children

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distMoney() {
        assertThat(Solution().distMoney(20, 3), equalTo(1))
    }

    @Test
    fun distMoney2() {
        assertThat(Solution().distMoney(16, 2), equalTo(2))
    }
}
