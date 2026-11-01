package g3901_4000.s3964_minimum_lights_to_illuminate_a_road

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minLights() {
        assertThat<Int>(Solution().minLights(intArrayOf(0, 0, 0, 0)), equalTo<Int>(2))
    }

    @Test
    fun minLights2() {
        assertThat<Int>(Solution().minLights(intArrayOf(0, 0, 0, 2, 0)), equalTo<Int>(1))
    }

    @Test
    fun minLights3() {
        assertThat<Int>(Solution().minLights(intArrayOf(1, 0)), equalTo<Int>(0))
    }
}
