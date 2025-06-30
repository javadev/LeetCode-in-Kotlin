package g3501_3600.s3597_partition_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partitionString() {
        assertThat<List<String>>(
            Solution().partitionString("abbccccd"),
            equalTo<List<String>>(mutableListOf<String>("a", "b", "bc", "c", "cc", "d")),
        )
    }

    @Test
    fun partitionString2() {
        assertThat<List<String>>(
            Solution().partitionString("aaaa"),
            equalTo<List<String>>(mutableListOf<String>("a", "aa")),
        )
    }
}
