package g3801_3900.s3823_reverse_letters_then_special_characters_in_a_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseByType() {
        assertThat<String>(
            Solution().reverseByType(")ebc#da@f("),
            CoreMatchers.equalTo<String?>("(fad@cb#e)"),
        )
    }

    @Test
    fun reverseByType2() {
        assertThat<String>(Solution().reverseByType("z"), CoreMatchers.equalTo<String?>("z"))
    }

    @Test
    fun reverseByType3() {
        assertThat<String>(
            Solution().reverseByType("!@#$%^&*()"),
            CoreMatchers.equalTo<String?>(")(*&^%$#@!"),
        )
    }
}
