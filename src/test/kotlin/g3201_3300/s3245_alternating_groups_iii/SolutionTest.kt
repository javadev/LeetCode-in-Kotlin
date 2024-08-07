package g3201_3300.s3245_alternating_groups_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfAlternatingGroups() {
        assertThat(
            Solution()
                .numberOfAlternatingGroups(
                    intArrayOf(0, 1, 1, 0, 1), arrayOf(intArrayOf(2, 1, 0), intArrayOf(1, 4))
                ),
            equalTo(listOf(2))
        )
    }

    @Test
    fun numberOfAlternatingGroups2() {
        assertThat(
            Solution()
                .numberOfAlternatingGroups(
                    intArrayOf(0, 0, 1, 0, 1, 1),
                    arrayOf(intArrayOf(1, 3), intArrayOf(2, 3, 0), intArrayOf(1, 5))
                ),
            equalTo(listOf(2, 0))
        )
    }
}
