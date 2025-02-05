package g3401_3500.s3443_maximum_manhattan_distance_after_k_changes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        assertThat<Int>(Solution().maxDistance("NWSE", 1), equalTo<Int>(3))
    }

    @Test
    fun maxDistance2() {
        assertThat<Int>(Solution().maxDistance("NSWWEW", 3), equalTo<Int>(6))
    }
}
