package g1001_1100.s1095_find_in_mountain_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findInMountainArray() {
        assertThat(
            Solution()
                .findInMountainArray(
                    3, MountainArrayImpl(intArrayOf(1, 2, 3, 4, 5, 3, 1))
                ),
            equalTo(2)
        )
    }

    @Test
    fun findInMountainArray2() {
        assertThat(
            Solution()
                .findInMountainArray(
                    3, MountainArrayImpl(intArrayOf(0, 1, 2, 4, 2, 1))
                ),
            equalTo(-1)
        )
    }
}
