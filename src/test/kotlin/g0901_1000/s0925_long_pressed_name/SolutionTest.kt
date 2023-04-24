package g0901_1000.s0925_long_pressed_name

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isLongPressedName() {
        assertThat(Solution().isLongPressedName("alex", "aaleex"), equalTo(true))
    }

    @Test
    fun isLongPressedName2() {
        assertThat(Solution().isLongPressedName("saeed", "ssaaedd"), equalTo(false))
    }
}
