package g3901_4000.s3921_score_validator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scoreValidator() {
        assertThat<IntArray>(
            Solution().scoreValidator(arrayOf<String>("1", "4", "W", "6", "WD")),
            equalTo<IntArray>(intArrayOf(12, 1)),
        )
    }

    @Test
    fun scoreValidator2() {
        assertThat<IntArray>(
            Solution().scoreValidator(arrayOf<String>("WD", "NB", "0", "4", "4")),
            equalTo<IntArray>(intArrayOf(10, 0)),
        )
    }

    @Test
    fun scoreValidator3() {
        assertThat<IntArray>(
            Solution()
                .scoreValidator(
                    arrayOf<String>(
                        "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W",
                    ),
                ),
            equalTo<IntArray>(intArrayOf(0, 10)),
        )
    }
}
