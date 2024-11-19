package g2201_2300.s2258_escape_the_spreading_fire

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumMinutes() {
        assertThat(
            Solution()
                .maximumMinutes(
                    arrayOf(
                        intArrayOf(0, 2, 0, 0, 0, 0, 0),
                        intArrayOf(0, 0, 0, 2, 2, 1, 0),
                        intArrayOf(0, 2, 0, 0, 1, 2, 0),
                        intArrayOf(0, 0, 2, 2, 2, 0, 2),
                        intArrayOf(0, 0, 0, 0, 0, 0, 0),
                    ),
                ),
            equalTo(3),
        )
    }

    @Test
    fun maximumMinutes2() {
        assertThat(
            Solution()
                .maximumMinutes(arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 1, 2, 0), intArrayOf(0, 2, 0, 0))),
            equalTo(-1),
        )
    }

    @Test
    fun maximumMinutes3() {
        assertThat(
            Solution().maximumMinutes(arrayOf(intArrayOf(0, 0, 0), intArrayOf(2, 2, 0), intArrayOf(1, 2, 0))),
            equalTo(1000000000),
        )
    }
}
