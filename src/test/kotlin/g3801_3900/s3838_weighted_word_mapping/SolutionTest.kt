package g3801_3900.s3838_weighted_word_mapping

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mapWordWeights() {
        assertThat<String>(
            Solution()
                .mapWordWeights(
                    arrayOf<String>("abcd", "def", "xyz"),
                    intArrayOf(
                        5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9,
                        9, 8, 3, 7, 7, 2,
                    ),
                ),
            equalTo<String>("rij"),
        )
    }

    @Test
    fun mapWordWeights2() {
        assertThat<String>(
            Solution()
                .mapWordWeights(
                    arrayOf<String>("a", "b", "c"),
                    intArrayOf(
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1,
                    ),
                ),
            equalTo<String>("yyy"),
        )
    }

    @Test
    fun mapWordWeights3() {
        assertThat<String>(
            Solution()
                .mapWordWeights(
                    arrayOf<String>("abcd"),
                    intArrayOf(
                        7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4,
                        1, 3, 4, 4, 5,
                    ),
                ),
            equalTo<String>("g"),
        )
    }
}
