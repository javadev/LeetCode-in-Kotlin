package g2301_2400.s2337_move_pieces_to_obtain_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canChange() {
        assertThat(Solution().canChange("_L__R__R_", "L______RR"), equalTo(true))
    }

    @Test
    fun canChange2() {
        assertThat(Solution().canChange("R_L_", "__LR"), equalTo(false))
    }

    @Test
    fun canChange3() {
        assertThat(Solution().canChange("_R", "R_"), equalTo(false))
    }

    @Test
    fun canChange4() {
        assertThat(Solution().canChange("_L__R__R_L", "L______RR_"), equalTo(false))
    }
}
