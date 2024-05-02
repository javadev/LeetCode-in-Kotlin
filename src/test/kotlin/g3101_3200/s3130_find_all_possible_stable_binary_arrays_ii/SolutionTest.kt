package g3101_3200.s3130_find_all_possible_stable_binary_arrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfStableArrays() {
        assertThat(Solution().numberOfStableArrays(1, 1, 2), equalTo(2))
    }

    @Test
    fun numberOfStableArrays2() {
        assertThat(Solution().numberOfStableArrays(1, 2, 1), equalTo(1))
    }

    @Test
    fun numberOfStableArrays3() {
        assertThat(Solution().numberOfStableArrays(3, 3, 2), equalTo(14))
    }
}
