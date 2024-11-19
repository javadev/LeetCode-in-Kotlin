package g1301_1400.s1385_find_the_distance_value_between_two_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheDistanceValue() {
        assertThat(
            Solution()
                .findTheDistanceValue(intArrayOf(4, 5, 8), intArrayOf(10, 9, 1, 8), 2),
            equalTo(2),
        )
    }

    @Test
    fun findTheDistanceValue2() {
        assertThat(
            Solution()
                .findTheDistanceValue(intArrayOf(1, 4, 2, 3), intArrayOf(-4, -3, 6, 10, 20, 30), 3),
            equalTo(2),
        )
    }

    @Test
    fun findTheDistanceValue3() {
        assertThat(
            Solution()
                .findTheDistanceValue(intArrayOf(2, 1, 100, 3), intArrayOf(-5, -2, 10, -3, 7), 6),
            equalTo(1),
        )
    }
}
