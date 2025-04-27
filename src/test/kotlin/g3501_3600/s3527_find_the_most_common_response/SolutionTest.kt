package g3501_3600.s3527_find_the_most_common_response

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCommonResponse() {
        assertThat(
            Solution()
                .findCommonResponse(
                    listOf(
                        mutableListOf("good", "ok", "good", "ok"),
                        mutableListOf("ok", "bad", "good", "ok", "ok"),
                        mutableListOf("good"),
                        mutableListOf("bad"),
                    ),
                ),
            equalTo("good"),
        )
    }

    @Test
    fun findCommonResponse2() {
        assertThat(
            Solution()
                .findCommonResponse(
                    listOf(
                        listOf("good", "ok", "good"),
                        listOf("ok", "bad"),
                        listOf("bad", "notsure"),
                        listOf("great", "good"),
                    ),
                ),
            equalTo("bad"),
        )
    }

    @Test
    fun findCommonResponse3() {
        assertThat(
            Solution()
                .findCommonResponse(
                    listOf(
                        listOf("fed", "vgdb", "w", "zs", "fed"),
                        listOf("f", "cz", "pah", "gj", "rpxr", "ugyi"),
                        listOf("t", "oja", "c"),
                        listOf("ni", "fed", "mcox", "a", "f", "ni", "g"),
                        listOf("ybk", "xght", "jje"),
                    ),
                ),
            equalTo("f"),
        )
    }
}
