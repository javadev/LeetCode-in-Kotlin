package g1501_1600.s1521_find_a_value_of_a_mysterious_function_closest_to_target

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestToTarget() {
        MatcherAssert.assertThat(Solution().closestToTarget(intArrayOf(9, 12, 3, 7, 15), 5), CoreMatchers.equalTo(2))
    }

    @Test
    fun closestToTarget2() {
        MatcherAssert.assertThat(
            Solution().closestToTarget(intArrayOf(1000000, 1000000, 1000000), 1),
            CoreMatchers.equalTo(999999)
        )
    }

    @Test
    fun closestToTarget3() {
        MatcherAssert.assertThat(Solution().closestToTarget(intArrayOf(1, 2, 4, 8, 16), 0), CoreMatchers.equalTo(0))
    }
}
