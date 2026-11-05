package g3901_4000.s3992_rearrange_string_to_avoid_character_pair

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rearrangeString() {
        assertThat<String>(
            Solution().rearrangeString("aabc", 'a', 'c'),
            equalTo<String>("caba"),
        )
    }

    @Test
    fun rearrangeString2() {
        assertThat<String>(
            Solution().rearrangeString("dcab", 'd', 'b'),
            equalTo<String>("bcad"),
        )
    }

    @Test
    fun rearrangeString3() {
        assertThat<String>(
            Solution().rearrangeString("axe", 'o', 'x'),
            equalTo<String>("xae"),
        )
    }
}
