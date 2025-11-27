package g2401_2500.s2481_minimum_cuts_to_divide_a_circle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfCuts() {
        assertThat(Solution().numberOfCuts(4), equalTo(2))
    }

    @Test
    fun numberOfCuts2() {
        assertThat(Solution().numberOfCuts(3), equalTo(3))
    }

    @Test
    fun numberOfCuts3() {
        assertThat(Solution().numberOfCuts(1), equalTo(0))
    }

    @Test
    fun numberOfCuts4() {
        assertThat(Solution().numberOfCuts(6), equalTo(3))
    }

    @Test
    fun numberOfCuts5() {
        assertThat(Solution().numberOfCuts(5), equalTo(5))
    }

    @Test
    fun numberOfCuts6() {
        assertThat(Solution().numberOfCuts(100), equalTo(50))
    }

    @Test
    fun numberOfCuts7() {
        assertThat(Solution().numberOfCuts(101), equalTo(101))
    }

    @Test
    fun numberOfCuts8() {
        assertThat(Solution().numberOfCuts(2), equalTo(1))
    }

    @Test
    fun numberOfCuts9() {
        assertThat(Solution().numberOfCuts(3), equalTo(3))
    }
}
