package g1701_1800.s1786_number_of_restricted_paths_from_first_to_last_node

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRestrictedPaths() {
        assertThat(
            Solution()
                .countRestrictedPaths(
                    5,
                    arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 3),
                        intArrayOf(2, 3, 1),
                        intArrayOf(1, 4, 2),
                        intArrayOf(5, 2, 2),
                        intArrayOf(3, 5, 1),
                        intArrayOf(5, 4, 10),
                    ),
                ),
            equalTo(3),
        )
    }

    @Test
    fun countRestrictedPaths2() {
        assertThat(
            Solution()
                .countRestrictedPaths(
                    7,
                    arrayOf(
                        intArrayOf(1, 3, 1),
                        intArrayOf(4, 1, 2),
                        intArrayOf(7, 3, 4),
                        intArrayOf(2, 5, 3),
                        intArrayOf(5, 6, 1),
                        intArrayOf(6, 7, 2),
                        intArrayOf(7, 5, 3),
                        intArrayOf(2, 6, 4),
                    ),
                ),
            equalTo(1),
        )
    }
}
