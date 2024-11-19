package g1401_1500.s1491_average_salary_excluding_the_minimum_and_maximum_salary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun average() {
        assertThat(
            Solution().average(intArrayOf(4000, 3000, 1000, 2000)),
            equalTo(2500.00000),
        )
    }

    @Test
    fun average2() {
        assertThat(Solution().average(intArrayOf(1000, 2000, 3000)), equalTo(2000.00000))
    }
}
