package g2701_2800.s2798_number_of_employees_who_met_the_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfEmployeesWhoMetTarget() {
        assertThat(Solution().numberOfEmployeesWhoMetTarget(intArrayOf(0, 1, 2, 3, 4), 2), equalTo(3))
    }

    @Test
    fun numberOfEmployeesWhoMetTarget2() {
        assertThat(Solution().numberOfEmployeesWhoMetTarget(intArrayOf(5, 1, 4, 2, 2), 6), equalTo(0))
    }
}
