package g1501_1600.s1598_crawler_log_folder

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(arrayOf("d1/", "d2/", "../", "d21/", "./")),
            equalTo(2)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution()
                .minOperations(arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/")),
            equalTo(3)
        )
    }

    @Test
    fun minOperations3() {
        assertThat(
            Solution().minOperations(arrayOf("d1/", "../", "../", "../")),
            equalTo(0)
        )
    }
}
