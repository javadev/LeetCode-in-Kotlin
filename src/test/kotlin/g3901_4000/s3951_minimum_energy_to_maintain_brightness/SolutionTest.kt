package g3901_4000.s3951_minimum_energy_to_maintain_brightness

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minEnergy() {
        assertThat<Long>(
            Solution().minEnergy(5, 5, arrayOf<IntArray>(intArrayOf(6, 12))),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun minEnergy2() {
        assertThat<Long>(
            Solution().minEnergy(
                2,
                1,
                arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(2, 2)),
            ),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun minEnergy3() {
        assertThat<Long>(
            Solution().minEnergy(
                4,
                2,
                arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(2, 4)),
            ),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minEnergy4() {
        assertThat<Long>(
            Solution().minEnergy(
                3,
                1,
                arrayOf<IntArray>(intArrayOf(5, 6), intArrayOf(0, 1)),
            ),
            equalTo<Long>(4L),
        )
    }
}
