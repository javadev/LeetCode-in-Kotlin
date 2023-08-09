package g2701_2800.s2780_minimum_index_of_a_valid_split

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumIndex() {
        assertThat(Solution().minimumIndex(listOf(1, 2, 2, 2)), equalTo(2))
    }

    @Test
    fun minimumIndex2() {
        assertThat(Solution().minimumIndex(listOf(2, 1, 3, 1, 1, 1, 7, 1, 2, 1)), equalTo(4))
    }

    @Test
    fun minimumIndex3() {
        assertThat(Solution().minimumIndex(listOf(3, 3, 3, 3, 7, 2, 2)), equalTo(-1))
    }
}
