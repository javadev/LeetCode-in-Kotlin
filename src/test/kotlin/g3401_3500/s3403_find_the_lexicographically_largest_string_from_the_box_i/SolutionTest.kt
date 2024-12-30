package g3401_3500.s3403_find_the_lexicographically_largest_string_from_the_box_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun answerString() {
        assertThat<String>(Solution().answerString("dbca", 2), equalTo<String>("dbc"))
    }

    @Test
    fun answerString2() {
        assertThat<String>(Solution().answerString("gggg", 4), equalTo<String>("g"))
    }

    @Test
    fun answerString3() {
        assertThat<String>(Solution().answerString("a", 1), equalTo<String>("a"))
    }
}
