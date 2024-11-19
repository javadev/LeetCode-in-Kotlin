package g0401_0500.s0447_number_of_boomerangs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfBoomerangs() {
        assertThat(
            Solution().numberOfBoomerangs(arrayOf(intArrayOf(0, 0), intArrayOf(1, 0), intArrayOf(2, 0))),
            equalTo(2),
        )
    }

    @Test
    fun numberOfBoomerangs2() {
        assertThat(
            Solution().numberOfBoomerangs(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))),
            equalTo(2),
        )
    }

    @Test
    fun numberOfBoomerangs3() {
        assertThat(Solution().numberOfBoomerangs(arrayOf(intArrayOf(1, 1))), equalTo(0))
    }
}
