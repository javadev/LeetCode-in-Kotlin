package g3701_3800.s3783_mirror_distance_of_an_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mirrorDistance() {
        assertThat<Int>(Solution().mirrorDistance(25), equalTo<Int>(27))
    }

    @Test
    fun mirrorDistance2() {
        assertThat<Int>(Solution().mirrorDistance(10), equalTo<Int>(9))
    }

    @Test
    fun mirrorDistance3() {
        assertThat<Int>(Solution().mirrorDistance(7), equalTo<Int>(0))
    }
}
