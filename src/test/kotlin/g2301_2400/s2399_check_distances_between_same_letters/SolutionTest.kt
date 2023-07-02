package g2301_2400.s2399_check_distances_between_same_letters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkDistances() {
        assertThat(
            Solution()
                .checkDistances(
                    "abaccb",
                    intArrayOf(
                        1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0
                    )
                ),
            equalTo(true)
        )
    }

    @Test
    fun checkDistances2() {
        assertThat(
            Solution()
                .checkDistances(
                    "aa",
                    intArrayOf(
                        1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0
                    )
                ),
            equalTo(false)
        )
    }
}
