package g3001_3100.s3006_find_beautiful_indices_in_the_given_array_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulIndices() {
        assertThat(
            Solution()
                .beautifulIndices(
                    "isawsquirrelnearmysquirrelhouseohmy",
                    "my",
                    "squirrel",
                    15,
                ),
            equalTo(mutableListOf(16, 33)),
        )
    }

    @Test
    fun beautifulIndices2() {
        assertThat(
            Solution().beautifulIndices("abcd", "a", "a", 4),
            equalTo(mutableListOf(0)),
        )
    }
}
