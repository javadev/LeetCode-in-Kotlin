package g1101_1200.s1144_decrease_elements_to_make_array_zigzag

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun movesToMakeZigzag() {
        assertThat(Solution().movesToMakeZigzag(intArrayOf(1, 2, 3)), equalTo(2))
    }

    @Test
    fun movesToMakeZigzag2() {
        assertThat(Solution().movesToMakeZigzag(intArrayOf(9, 6, 1, 6, 2)), equalTo(4))
    }
}
