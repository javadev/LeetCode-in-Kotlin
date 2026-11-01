package g3901_4000.s3912_valid_elements_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findValidElements() {
        assertThat<MutableList<Int>>(
            Solution().findValidElements(intArrayOf(1, 2, 4, 2, 3, 2)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(1, 2, 4, 3, 2)),
        )
    }

    @Test
    fun findValidElements2() {
        assertThat<MutableList<Int>>(
            Solution().findValidElements(intArrayOf(5, 5, 5, 5)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(5, 5)),
        )
    }

    @Test
    fun findValidElements3() {
        assertThat<MutableList<Int>>(
            Solution().findValidElements(intArrayOf(1)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(1)),
        )
    }

    @Test
    fun findValidElements4() {
        assertThat<MutableList<Int>>(
            Solution().findValidElements(intArrayOf(1, 2, 3, 4)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(1, 2, 3, 4)),
        )
    }

    @Test
    fun findValidElements5() {
        assertThat<MutableList<Int>>(
            Solution().findValidElements(intArrayOf(4, 3, 2, 1)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(4, 3, 2, 1)),
        )
    }

    @Test
    fun findValidElements6() {
        assertThat<MutableList<Int>>(
            Solution().findValidElements(intArrayOf(5, 1, 5)),
            equalTo<MutableList<Int>>(mutableListOf<Int>(5, 5)),
        )
    }
}
