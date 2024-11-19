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
                    listOf<Int>(
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 2,
                    ),
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun lengthAfterTransformations2() {
        assertThat<Int>(
            Solution()
                .lengthAfterTransformations(
                    "azbk",
                    1,
                    listOf<Int>(
                        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                        2, 2, 2, 2, 2, 2,
                    ),
                ),
            equalTo<Int>(8),
        )
    }

    @Test
    fun lengthAfterTransformations3() {
        assertThat<Int>(
            Solution()
                .lengthAfterTransformations(
                    "sutnqlhkolxwjtrunkmaakgfyitzluklnrglpbnknbpdvxccpyupjzqldm",
                    2826,
                    listOf<Int>(
                        9, 1, 6, 3, 2, 7, 8, 10, 8, 3, 9, 5, 10, 8, 10, 2, 2, 9, 10,
                        1, 3, 5, 4, 4, 8, 10,
                    ),
                ),
            equalTo<Int>(557232981),
        )
    }

    @Test
    fun lengthAfterTransformations4() {
        assertThat<Int>(
            Solution()
                .lengthAfterTransformations(
                    "mppgvcssluzhipednraxbdfbyn",
                    3719,
                    listOf<Int>(
                        5, 3, 8, 1, 4, 2, 2, 4, 5, 2, 8, 5, 8, 2, 6, 10, 8, 1, 4, 1,
                        7, 4, 2, 4, 7, 5,
                    ),
                ),
            equalTo<Int>(467065288),
        )
    }
}
