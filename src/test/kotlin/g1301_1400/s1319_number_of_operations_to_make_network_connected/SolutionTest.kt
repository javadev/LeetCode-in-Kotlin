package g1301_1400.s1319_number_of_operations_to_make_network_connected

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeConnected() {
        assertThat(
            Solution().makeConnected(
                4,
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 2),
                ),
            ),
            equalTo(1),
        )
    }

    @Test
    fun makeConnected2() {
        assertThat(
            Solution()
                .makeConnected(
                    6,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(0, 3),
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                    ),
                ),
            equalTo(2),
        )
    }

    @Test
    fun makeConnected3() {
        assertThat(
            Solution().makeConnected(
                6,
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(0, 3),
                    intArrayOf(1, 2),
                ),
            ),
            equalTo(-1),
        )
    }
}
