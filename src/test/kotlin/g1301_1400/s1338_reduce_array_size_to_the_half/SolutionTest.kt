package g1301_1400.s1338_reduce_array_size_to_the_half

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSetSize() {
        assertThat(
            Solution().minSetSize(intArrayOf(3, 3, 3, 3, 5, 5, 5, 2, 2, 7)),
            equalTo(2)
        )
    }

    @Test
    fun minSetSize2() {
        assertThat(Solution().minSetSize(intArrayOf(7, 7, 7, 7, 7, 7)), equalTo(1))
    }
}
