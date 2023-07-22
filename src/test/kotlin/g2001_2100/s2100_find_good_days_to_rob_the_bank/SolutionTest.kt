package g2001_2100.s2100_find_good_days_to_rob_the_bank

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodDaysToRobBank() {
        assertThat(
            Solution().goodDaysToRobBank(intArrayOf(5, 3, 3, 3, 5, 6, 2), 2),
            equalTo(listOf(2, 3))
        )
    }

    @Test
    fun goodDaysToRobBank2() {
        assertThat(
            Solution().goodDaysToRobBank(intArrayOf(1, 1, 1, 1, 1), 0),
            equalTo(listOf(0, 1, 2, 3, 4))
        )
    }

    @Test
    fun goodDaysToRobBank3() {
        assertThat(
            Solution().goodDaysToRobBank(intArrayOf(1, 2, 3, 4, 5, 6), 2),
            equalTo(emptyList<Any>())
        )
    }
}
