package g0001_0100.s0027_remove_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun removeElement() {
        val original = intArrayOf(3, 2, 2, 3)
        val end = Solution().removeElement(original, 3)
        assertThat(Arrays.copyOfRange(original, 0, end), equalTo(intArrayOf(2, 2)))
    }

    @Test
    fun removeElement2() {
        val original = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val end = Solution().removeElement(original, 2)
        assertThat(Arrays.copyOfRange(original, 0, end), equalTo(intArrayOf(0, 1, 4, 0, 3)))
    }
}
