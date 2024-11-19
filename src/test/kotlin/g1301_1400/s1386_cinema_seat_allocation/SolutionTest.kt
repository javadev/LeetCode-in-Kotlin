package g1301_1400.s1386_cinema_seat_allocation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumberOfFamilies() {
        assertThat(
            Solution()
                .maxNumberOfFamilies(
                    3,
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 8),
                        intArrayOf(2, 6),
                        intArrayOf(3, 1),
                        intArrayOf(3, 10),
                    ),
                ),
            equalTo(4),
        )
    }

    @Test
    fun maxNumberOfFamilies2() {
        assertThat(
            Solution().maxNumberOfFamilies(2, arrayOf(intArrayOf(2, 1), intArrayOf(1, 8), intArrayOf(2, 6))),
            equalTo(2),
        )
    }

    @Test
    fun maxNumberOfFamilies3() {
        assertThat(
            Solution().maxNumberOfFamilies(
                4,
                arrayOf(
                    intArrayOf(4, 3),
                    intArrayOf(1, 4),
                    intArrayOf(4, 6),
                    intArrayOf(1, 7),
                ),
            ),
            equalTo(4),
        )
    }
}
