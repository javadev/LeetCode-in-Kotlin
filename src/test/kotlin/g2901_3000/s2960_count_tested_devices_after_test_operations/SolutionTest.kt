package g2901_3000.s2960_count_tested_devices_after_test_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTestedDevices() {
        assertThat(Solution().countTestedDevices(intArrayOf(1, 1, 2, 1, 3)), equalTo(3))
    }

    @Test
    fun countTestedDevices2() {
        assertThat(Solution().countTestedDevices(intArrayOf(0, 1, 2)), equalTo(2))
    }
}
