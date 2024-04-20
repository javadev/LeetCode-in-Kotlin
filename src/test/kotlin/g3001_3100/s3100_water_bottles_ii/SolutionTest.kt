package g3001_3100.s3100_water_bottles_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxBottlesDrunk() {
        assertThat(Solution().maxBottlesDrunk(13, 6), equalTo(15))
    }

    @Test
    fun maxBottlesDrunk2() {
        assertThat(Solution().maxBottlesDrunk(10, 3), equalTo(13))
    }
}
