package g2801_2900.s2833_furthest_point_from_origin

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun furthestDistanceFromOrigin() {
        assertThat(Solution().furthestDistanceFromOrigin("L_RL__R"), equalTo(3))
    }

    @Test
    fun furthestDistanceFromOrigin2() {
        assertThat(Solution().furthestDistanceFromOrigin("_R__LL_"), equalTo(5))
    }

    @Test
    fun furthestDistanceFromOrigin3() {
        assertThat(Solution().furthestDistanceFromOrigin("_______"), equalTo(7))
    }
}
