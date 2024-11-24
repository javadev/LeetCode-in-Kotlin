package g3301_3400.s3361_shift_distance_between_two_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shiftDistance() {
        assertThat<Long>(
            Solution()
                .shiftDistance(
                    "abab",
                    "baba",
                    intArrayOf(
                        100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0,
                    ),
                    intArrayOf(
                        1, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0,
                    ),
                ),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun shiftDistance2() {
        assertThat<Long>(
            Solution()
                .shiftDistance(
                    "leet",
                    "code",
                    intArrayOf(
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1,
                    ),
                    intArrayOf(
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1,
                    ),
                ),
            equalTo<Long>(31L),
        )
    }
}
