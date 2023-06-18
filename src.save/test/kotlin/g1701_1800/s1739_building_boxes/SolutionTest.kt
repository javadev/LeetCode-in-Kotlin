package g1701_1800.s1739_building_boxes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumBoxes() {
        assertThat(Solution().minimumBoxes(3), equalTo(3))
    }

    @Test
    fun minimumBoxes2() {
        assertThat(Solution().minimumBoxes(4), equalTo(3))
    }

    @Test
    fun minimumBoxes3() {
        assertThat(Solution().minimumBoxes(10), equalTo(6))
    }
}
