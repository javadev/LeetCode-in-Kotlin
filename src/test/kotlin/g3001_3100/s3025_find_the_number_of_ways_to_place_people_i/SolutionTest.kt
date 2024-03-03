package g3001_3100.s3025_find_the_number_of_ways_to_place_people_i

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPairs() {
        assertThat(
            Solution()
                .numberOfPairs(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1],[2,2],[3,3]"
                    )
                ),
            equalTo(0)
        )
    }

    @Test
    fun numberOfPairs2() {
        assertThat(
            Solution()
                .numberOfPairs(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[6,2],[4,4],[2,6]"
                    )
                ),
            equalTo(2)
        )
    }

    @Test
    fun numberOfPairs3() {
        assertThat(
            Solution()
                .numberOfPairs(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[3,1],[1,3],[1,1]"
                    )
                ),
            equalTo(2)
        )
    }
}
