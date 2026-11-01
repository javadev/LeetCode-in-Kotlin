package g3901_4000.s3968_maximum_manhattan_distance_after_all_moves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        assertThat<Int>(Solution().maxDistance("L_D_"), equalTo<Int>(4))
    }

    @Test
    fun maxDistance2() {
        assertThat<Int>(Solution().maxDistance("U_R"), equalTo<Int>(3))
    }

    @Test
    fun maxDistance3() {
        assertThat<Int>(Solution().maxDistance("UD"), equalTo<Int>(0))
    }
}
