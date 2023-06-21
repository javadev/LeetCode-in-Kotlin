package g1801_1900.s1855_maximum_distance_between_a_pair_of_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        assertThat(
            Solution()
                .maxDistance(intArrayOf(55, 30, 5, 4, 2), intArrayOf(100, 20, 10, 10, 5)),
            equalTo(2)
        )
    }

    @Test
    fun maxDistance2() {
        assertThat(
            Solution().maxDistance(intArrayOf(2, 2, 2), intArrayOf(10, 10, 1)), equalTo(1)
        )
    }

    @Test
    fun maxDistance3() {
        assertThat(
            Solution()
                .maxDistance(intArrayOf(30, 29, 19, 5), intArrayOf(25, 25, 25, 25, 25)),
            equalTo(2)
        )
    }
}
