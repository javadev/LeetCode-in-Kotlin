package g3101_3200.s3154_find_number_of_ways_to_reach_the_k_th_stair

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToReachStair() {
        assertThat(Solution().waysToReachStair(0), equalTo(2))
    }

    @Test
    fun waysToReachStair2() {
        assertThat(Solution().waysToReachStair(1), equalTo(4))
    }
}
