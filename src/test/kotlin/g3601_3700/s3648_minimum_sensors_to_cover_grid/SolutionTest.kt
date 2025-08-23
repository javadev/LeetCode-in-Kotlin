package g3601_3700.s3648_minimum_sensors_to_cover_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSensors() {
        assertThat<Int>(Solution().minSensors(5, 5, 1), equalTo<Int>(4))
    }

    @Test
    fun minSensors2() {
        assertThat<Int>(Solution().minSensors(2, 2, 2), equalTo<Int>(1))
    }

    @Test
    fun minSensors3() {
        val result = Solution().minSensors(9, 9, 1)
        // 3x3 grid of sensors
        assertThat<Int>(result, equalTo<Int>(9))
    }

    @Test
    fun minSensors4() {
        val result = Solution().minSensors(10, 10, 1)
        // 4x4 sensors
        assertThat<Int>(result, equalTo<Int>(16))
    }

    @Test
    fun minSensors5() {
        val result = Solution().minSensors(2, 2, 1)
        // single sensor covers all
        assertThat<Int>(result, equalTo<Int>(1))
    }

    @Test
    fun minSensors6() {
        val result = Solution().minSensors(1, 10, 1)
        // only 1 row, needs 4 sensors along m
        assertThat<Int>(result, equalTo<Int>(4))
    }

    @Test
    fun testLargeK() {
        val result = Solution().minSensors(5, 5, 10)
        // one sensor covers everything
        assertThat<Int>(result, equalTo<Int>(1))
    }

    @Test
    fun testKZero() {
        val result = Solution().minSensors(3, 3, 0)
        // every cell needs a sensor
        assertThat<Int>(result, equalTo<Int>(9))
    }
}
