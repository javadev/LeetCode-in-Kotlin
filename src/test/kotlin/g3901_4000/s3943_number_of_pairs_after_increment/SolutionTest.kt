package g3901_4000.s3943_number_of_pairs_after_increment

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun numberOfPairs() {
        assertThat(
            Solution().numberOfPairs(
                intArrayOf(1, 2),
                intArrayOf(3, 4),
                arrayOf(intArrayOf(2, 5), intArrayOf(1, 0, 0, 2), intArrayOf(2, 5)),
            ),
            equalTo(intArrayOf(2, 1)),
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(
            Solution().numberOfPairs(
                intArrayOf(1, 1),
                intArrayOf(2, 2, 3),
                arrayOf(intArrayOf(2, 4), intArrayOf(1, 0, 1, 1), intArrayOf(2, 4)),
            ),
            equalTo(intArrayOf(2, 6)),
        )
    }

    @Test
    fun numberOfPairs3() {
        assertThat(
            Solution().numberOfPairs(
                intArrayOf(2, 5, 8, 4),
                intArrayOf(1, 3, 8),
                arrayOf(intArrayOf(2, 9), intArrayOf(1, 1, 2, 1), intArrayOf(2, 10)),
            ),
            equalTo(intArrayOf(1, 0)),
        )
    }

    @Test
    fun numberOfPairs4() {
        assertThat(
            Solution().numberOfPairs(
                intArrayOf(1),
                intArrayOf(1, 2, 3, 4),
                arrayOf(
                    intArrayOf(1, 1, 2, 1),
                    intArrayOf(1, 1, 2, 2),
                    intArrayOf(2, 5),
                    intArrayOf(2, 6),
                    intArrayOf(2, 7),
                ),
            ),
            equalTo(intArrayOf(1, 1, 1)),
        )
    }

    @Test
    fun numberOfPairs5() {
        assertThat(
            Solution().numberOfPairs(
                intArrayOf(1),
                intArrayOf(1, 2, 3),
                arrayOf(
                    intArrayOf(1, 0, 2, 5),
                    intArrayOf(1, 1, 1, 2),
                    intArrayOf(2, 7),
                    intArrayOf(2, 10),
                    intArrayOf(2, 9),
                ),
            ),
            equalTo(intArrayOf(1, 1, 1)),
        )
    }

    @Test
    fun numberOfPairs6() {
        assertThat(
            Solution().numberOfPairs(
                intArrayOf(1),
                intArrayOf(1),
                arrayOf(intArrayOf(1, 0, 0, 1)),
            ),
            equalTo(intArrayOf()),
        )
    }

    @Test
    fun numberOfPairs7() {
        val queries = Array(30001) { i ->
            if (i < 30000) intArrayOf(1, 0, 0, 100000) else intArrayOf(2, 1000000000)
        }
        assertThat(
            Solution().numberOfPairs(intArrayOf(1), intArrayOf(1), queries),
            equalTo(intArrayOf(0)),
        )
    }
}
