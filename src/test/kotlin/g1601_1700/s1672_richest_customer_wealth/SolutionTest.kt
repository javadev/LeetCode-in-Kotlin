package g1601_1700.s1672_richest_customer_wealth

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumWealth() {
        assertThat(Solution().maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))), equalTo(6))
    }

    @Test
    fun maximumWealth2() {
        assertThat(Solution().maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))), equalTo(10))
    }
}
