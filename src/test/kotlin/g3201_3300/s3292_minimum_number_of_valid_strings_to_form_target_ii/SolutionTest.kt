package g3201_3300.s3292_minimum_number_of_valid_strings_to_form_target_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minValidStrings() {
        assertThat<Int?>(
            Solution().minValidStrings(arrayOf<String>("abc", "aaaaa", "bcdef"), "aabcdabc"),
            equalTo<Int?>(3)
        )
    }

    @Test
    fun minValidStrings2() {
        assertThat<Int?>(
            Solution().minValidStrings(arrayOf<String>("abababab", "ab"), "ababaababa"),
            equalTo<Int?>(2)
        )
    }

    @Test
    fun minValidStrings3() {
        assertThat<Int?>(
            Solution().minValidStrings(arrayOf<String>("abcdef"), "xyz"),
            equalTo<Int?>(-1)
        )
    }
}
