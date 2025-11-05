package g3701_3800.s3731_find_missing_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMissingElements() {
        assertThat<List<Int>>(
            Solution().findMissingElements(intArrayOf(1, 4, 2, 5)),
            equalTo<List<Int>>(mutableListOf<Int>(3)),
        )
    }

    @Test
    fun findMissingElements2() {
        assertThat<List<Int>>(
            Solution().findMissingElements(intArrayOf(7, 8, 6, 9)),
            equalTo<List<Int>>(mutableListOf<Int>()),
        )
    }

    @Test
    fun findMissingElements3() {
        assertThat<List<Int>>(
            Solution().findMissingElements(intArrayOf(5, 1)),
            equalTo<List<Int>>(mutableListOf<Int>(2, 3, 4)),
        )
    }
}
