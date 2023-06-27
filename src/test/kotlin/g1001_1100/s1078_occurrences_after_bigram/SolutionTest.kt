package g1001_1100.s1078_occurrences_after_bigram

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findOcurrences() {
        assertThat(
            Solution()
                .findOcurrences("alice is a good girl she is a good student", "a", "good"),
            equalTo(arrayOf("girl", "student"))
        )
    }

    @Test
    fun findOcurrences2() {
        assertThat(
            Solution().findOcurrences("we will we will rock you", "we", "will"),
            equalTo(arrayOf("we", "rock"))
        )
    }
}
