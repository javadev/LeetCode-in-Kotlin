package g2901_3000.s2960_count_tested_devices_after_test_operations

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTestedDevices() {
        MatcherAssert.assertThat(Solution().countTestedDevices(intArrayOf(1, 1, 2, 1, 3)), CoreMatchers.equalTo(3))
    }

    @Test
    fun countTestedDevices2() {
        MatcherAssert.assertThat(Solution().countTestedDevices(intArrayOf(0, 1, 2)), CoreMatchers.equalTo(2))
    }
}
