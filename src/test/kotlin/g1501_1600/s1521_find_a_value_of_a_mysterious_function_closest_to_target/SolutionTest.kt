package g1501_1600.s1521_find_a_value_of_a_mysterious_function_closest_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestToTarget() {
        assertThat(Solution().closestToTarget(intArrayOf(9, 12, 3, 7, 15), 5), equalTo(2))
    }

    @Test
    fun closestToTarget2() {
        assertThat(
            Solution().closestToTarget(intArrayOf(1000000, 1000000, 1000000), 1),
            equalTo(999999)
        )
    }

    @Test
    fun closestToTarget3() {
        assertThat(Solution().closestToTarget(intArrayOf(1, 2, 4, 8, 16), 0), equalTo(0))
    }
}
