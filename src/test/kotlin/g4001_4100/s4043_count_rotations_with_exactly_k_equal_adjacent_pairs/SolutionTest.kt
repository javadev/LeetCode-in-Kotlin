package g4001_4100.s4043_count_rotations_with_exactly_k_equal_adjacent_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRotations() {
        assertThat<Int>(Solution().countRotations("aaaa", 4), equalTo<Int>(0))
    }

    @Test
    fun countRotations2() {
        assertThat<Int>(Solution().countRotations("aaaa", 3), equalTo<Int>(4))
    }

    @Test
    fun countRotations3() {
        assertThat<Int>(Solution().countRotations("abab", 0), equalTo<Int>(4))
    }

    @Test
    fun countRotations4() {
        assertThat<Int>(Solution().countRotations("abab", 1), equalTo<Int>(0))
    }
}
