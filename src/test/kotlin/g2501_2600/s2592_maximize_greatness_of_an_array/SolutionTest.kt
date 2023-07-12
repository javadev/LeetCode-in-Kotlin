package g2501_2600.s2592_maximize_greatness_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeGreatness() {
        assertThat(Solution().maximizeGreatness(intArrayOf(1, 3, 5, 2, 1, 3, 1)), equalTo(4))
    }

    @Test
    fun maximizeGreatness2() {
        assertThat(Solution().maximizeGreatness(intArrayOf(1, 2, 3, 4)), equalTo(3))
    }
}
