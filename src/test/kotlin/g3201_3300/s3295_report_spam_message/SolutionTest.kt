package g3201_3300.s3295_report_spam_message

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reportSpam() {
        assertThat<Boolean>(
            Solution()
                .reportSpam(
                    arrayOf<String>("hello", "world", "leetcode"),
                    arrayOf<String>("world", "hello"),
                ),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun reportSpam2() {
        assertThat<Boolean>(
            Solution()
                .reportSpam(
                    arrayOf<String>("hello", "programming", "fun"),
                    arrayOf<String>("world", "programming", "leetcode"),
                ),
            equalTo<Boolean>(false),
        )
    }
}
