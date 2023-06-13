package g1501_1600.s1598_crawler_log_folder

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        MatcherAssert.assertThat(
            Solution().minOperations(arrayOf("d1/", "d2/", "../", "d21/", "./")),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun minOperations2() {
        MatcherAssert.assertThat(
            Solution()
                .minOperations(arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/")),
            CoreMatchers.equalTo(3)
        )
    }

    @Test
    fun minOperations3() {
        MatcherAssert.assertThat(
            Solution().minOperations(arrayOf("d1/", "../", "../", "../")),
            CoreMatchers.equalTo(0)
        )
    }
}
