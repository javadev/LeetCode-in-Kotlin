package g3101_3200.s3147_taking_maximum_energy_from_the_mystic_dungeon

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumEnergy() {
        assertThat(Solution().maximumEnergy(intArrayOf(5, 2, -10, -5, 1), 3), equalTo(3))
    }

    @Test
    fun maximumEnergy2() {
        assertThat(Solution().maximumEnergy(intArrayOf(-2, -3, -1), 2), equalTo(-1))
    }
}
