package g1001_1100.s1020_number_of_enclaves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numEnclaves() {
        assertThat(
            Solution()
                .numEnclaves(
                    arrayOf(
                        intArrayOf(0, 0, 0, 0),
                        intArrayOf(1, 0, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 0, 0, 0)
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun numEnclaves2() {
        assertThat(
            Solution()
                .numEnclaves(
                    arrayOf(
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(1, 0, 1, 0),
                        intArrayOf(0, 1, 1, 0),
                        intArrayOf(0, 0, 0, 0)
                    )
                ),
            equalTo(0)
        )
    }
}
