package g0701_0800.s0799_champagne_tower

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun champagneTower() {
        assertThat(Solution().champagneTower(8, 3, 0), equalTo(0.125))
    }

    @Test
    fun champagneTower2() {
        assertThat(Solution().champagneTower(8, 3, 1), equalTo(0.875))
    }

    @Test
    fun champagneTower3() {
        assertThat(Solution().champagneTower(8, 3, 2), equalTo(0.875))
    }

    @Test
    fun champagneTower4() {
        assertThat(Solution().champagneTower(1000000000, 99, 99), equalTo(0.0))
    }
}
