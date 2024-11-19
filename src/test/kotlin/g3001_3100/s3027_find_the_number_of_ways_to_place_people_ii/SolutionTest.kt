package g3001_3100.s3027_find_the_number_of_ways_to_place_people_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPairs() {
        assertThat(
            Solution().numberOfPairs(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                ),
            ),
            equalTo(0),
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(
            Solution().numberOfPairs(
                arrayOf(
                    intArrayOf(6, 2),
                    intArrayOf(4, 4),
                    intArrayOf(2, 6),
                ),
            ),
            equalTo(2),
        )
    }

    @Test
    fun numberOfPairs3() {
        assertThat(
            Solution().numberOfPairs(
                arrayOf(
                    intArrayOf(3, 1),
                    intArrayOf(1, 3),
                    intArrayOf(1, 1),
                ),
            ),
            equalTo(2),
        )
    }
}
