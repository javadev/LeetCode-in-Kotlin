package g3801_3900.s3839_number_of_prefix_connected_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun prefixConnected() {
        assertThat<Int>(
            Solution()
                .prefixConnected(arrayOf<String>("apple", "apply", "banana", "bandit"), 2),
            equalTo<Int>(2),
        )
    }

    @Test
    fun prefixConnected2() {
        assertThat<Int>(
            Solution().prefixConnected(arrayOf<String>("car", "cat", "cartoon"), 3),
            equalTo<Int>(1),
        )
    }

    @Test
    fun prefixConnected3() {
        assertThat<Int>(
            Solution()
                .prefixConnected(arrayOf<String>("bat", "dog", "dog", "doggy", "bat"), 3),
            equalTo<Int>(2),
        )
    }
}
