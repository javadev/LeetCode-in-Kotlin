package g0801_0900.s0808_soup_servings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun soupServings() {
        assertThat(Solution().soupServings(50), equalTo(0.625))
    }

    @Test
    fun soupServings2() {
        assertThat(Solution().soupServings(100), equalTo(0.71875))
    }
}
