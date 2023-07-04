package g2501_2600.s2513_minimize_the_maximum_of_two_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeSet() {
        assertThat(Solution().minimizeSet(2, 7, 1, 3), equalTo(4))
    }

    @Test
    fun minimizeSet2() {
        assertThat(Solution().minimizeSet(3, 5, 2, 1), equalTo(3))
    }

    @Test
    fun minimizeSet3() {
        assertThat(Solution().minimizeSet(2, 4, 8, 2), equalTo(15))
    }
}
