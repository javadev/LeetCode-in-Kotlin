package g1201_1300.s1299_replace_elements_with_greatest_element_on_right_side

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun replaceElements() {
        assertThat(
            Solution().replaceElements(intArrayOf(17, 18, 5, 4, 6, 1)),
            equalTo(intArrayOf(18, 6, 6, 6, 1, -1)),
        )
    }

    @Test
    fun replaceElements2() {
        assertThat(Solution().replaceElements(intArrayOf(400)), equalTo(intArrayOf(-1)))
    }
}
