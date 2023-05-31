package g1101_1200.s1144_decrease_elements_to_make_array_zigzag

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun movesToMakeZigzag() {
        MatcherAssert.assertThat(Solution().movesToMakeZigzag(intArrayOf(1, 2, 3)), CoreMatchers.equalTo(2))
    }

    @Test
    fun movesToMakeZigzag2() {
        MatcherAssert.assertThat(Solution().movesToMakeZigzag(intArrayOf(9, 6, 1, 6, 2)), CoreMatchers.equalTo(4))
    }
}
