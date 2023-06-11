package g1501_1600.s1534_count_good_triplets

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodTriplets() {
        MatcherAssert.assertThat(
            Solution().countGoodTriplets(intArrayOf(3, 0, 1, 1, 9, 7), 7, 2, 3),
            CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun countGoodTriplets2() {
        MatcherAssert.assertThat(
            Solution().countGoodTriplets(intArrayOf(1, 1, 2, 2, 3), 0, 0, 1), CoreMatchers.equalTo(0)
        )
    }
}
