package g3301_3400.s3337_total_characters_in_string_after_transformations_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthAfterTransformations() {
        assertThat<Int>(
            Solution()
                .lengthAfterTransformations(
                    "abcyy",
                    2,
                    mutableListOf<Int>(
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 2
                    )
                ),
            equalTo<Int>(7)
        )
    }

    @Test
    fun lengthAfterTransformations2() {
        assertThat<Int>(
            Solution()
                .lengthAfterTransformations(
                    "azbk",
                    1,
                    mutableListOf<Int>(
                        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                        2, 2, 2, 2, 2, 2
                    )
                ),
            equalTo<Int>(8)
        )
    }
}
