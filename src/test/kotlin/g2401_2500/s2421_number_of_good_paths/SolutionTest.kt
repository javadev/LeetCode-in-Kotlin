package g2401_2500.s2421_number_of_good_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfGoodPaths() {
        assertThat(
            Solution()
                .numberOfGoodPaths(
                    intArrayOf(1, 3, 2, 1, 3),
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(2, 4)),
                ),
            equalTo(6),
        )
    }

    @Test
    fun numberOfGoodPaths2() {
        assertThat(
            Solution()
                .numberOfGoodPaths(
                    intArrayOf(1, 1, 2, 2, 3),
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4)),
                ),
            equalTo(7),
        )
    }
}
