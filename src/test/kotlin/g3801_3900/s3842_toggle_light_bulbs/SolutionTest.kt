package g3801_3900.s3842_toggle_light_bulbs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun toggleLightBulbs() {
        assertThat<MutableList<Int>>(
            Solution().toggleLightBulbs(mutableListOf<Int>(10, 30, 20, 10)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(20, 30)),
        )
    }

    @Test
    fun toggleLightBulbs2() {
        assertThat<MutableList<Int>>(
            Solution().toggleLightBulbs(mutableListOf<Int>(100, 100)),
            equalTo<MutableList<out Any>>(mutableListOf<Any>()),
        )
    }
}
