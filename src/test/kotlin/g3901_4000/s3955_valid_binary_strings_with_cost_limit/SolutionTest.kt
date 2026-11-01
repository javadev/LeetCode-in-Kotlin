package g3901_4000.s3955_valid_binary_strings_with_cost_limit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateValidStrings() {
        assertThat<MutableList<String>>(
            Solution().generateValidStrings(3, 1),
            equalTo<MutableList<String>>(mutableListOf<String>("000", "010", "100")),
        )
    }

    @Test
    fun generateValidStrings2() {
        assertThat<MutableList<String>>(
            Solution().generateValidStrings(1, 0),
            equalTo<MutableList<String>>(mutableListOf<String>("0", "1")),
        )
    }

    @Test
    fun generateValidStrings3() {
        assertThat<MutableList<String>>(
            Solution().generateValidStrings(2, 0),
            equalTo<MutableList<String>>(mutableListOf<String>("00", "10")),
        )
    }
}
