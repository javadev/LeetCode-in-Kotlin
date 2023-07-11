package g2501_2600.s2582_pass_the_pillow

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun passThePillow() {
        assertThat(Solution().passThePillow(4, 5), equalTo(2))
    }

    @Test
    fun passThePillow2() {
        assertThat(Solution().passThePillow(3, 2), equalTo(3))
    }
}
