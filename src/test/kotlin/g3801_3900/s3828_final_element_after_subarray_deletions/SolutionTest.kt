package g3801_3900.s3828_final_element_after_subarray_deletions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finalElement() {
        assertThat<Int>(Solution().finalElement(intArrayOf(1, 5, 2)), equalTo<Int>(2))
    }

    @Test
    fun finalElement2() {
        assertThat<Int>(Solution().finalElement(intArrayOf(3, 7)), equalTo<Int>(7))
    }
}
