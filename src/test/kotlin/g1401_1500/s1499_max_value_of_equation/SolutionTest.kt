package g1401_1500.s1499_max_value_of_equation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxValueOfEquation() {
        assertThat(
            Solution()
                .findMaxValueOfEquation(
                    arrayOf(
                        intArrayOf(1, 3),
                        intArrayOf(2, 0),
                        intArrayOf(5, 10),
                        intArrayOf(6, -10)
                    ),
                    1
                ),
            equalTo(4)
        )
    }

    @Test
    fun findMaxValueOfEquation2() {
        assertThat(
            Solution().findMaxValueOfEquation(arrayOf(intArrayOf(0, 0), intArrayOf(3, 0), intArrayOf(9, 2)), 3),
            equalTo(3)
        )
    }
}
