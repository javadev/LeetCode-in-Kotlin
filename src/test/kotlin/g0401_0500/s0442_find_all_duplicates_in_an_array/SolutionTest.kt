package g0401_0500.s0442_find_all_duplicates_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDuplicates() {
        assertThat(
            Solution().findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)),
            equalTo(listOf(2, 3))
        )
    }

    @Test
    fun findDuplicates2() {
        assertThat(Solution().findDuplicates(intArrayOf(1, 1, 2)), equalTo(listOf(1)))
    }
}
