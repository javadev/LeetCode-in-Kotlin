package g1701_1800.s1728_cat_and_mouse_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMouseWin() {
        assertThat(
            Solution().canMouseWin(arrayOf("####F", "#C...", "M...."), 1, 2),
            equalTo(true)
        )
    }

    @Test
    fun canMouseWin2() {
        assertThat(Solution().canMouseWin(arrayOf("M.C...F"), 1, 4), equalTo(true))
    }

    @Test
    fun canMouseWin3() {
        assertThat(Solution().canMouseWin(arrayOf("M.C...F"), 1, 3), equalTo(false))
    }
}
