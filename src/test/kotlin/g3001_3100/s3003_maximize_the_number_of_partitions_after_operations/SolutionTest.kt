package g3001_3100.s3003_maximize_the_number_of_partitions_after_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPartitionsAfterOperations() {
        assertThat(Solution().maxPartitionsAfterOperations("accca", 2), equalTo(3))
    }

    @Test
    fun maxPartitionsAfterOperations2() {
        assertThat(Solution().maxPartitionsAfterOperations("aabaab", 3), equalTo(1))
    }

    @Test
    fun maxPartitionsAfterOperations3() {
        assertThat(Solution().maxPartitionsAfterOperations("xxyz", 1), equalTo(4))
    }
}
