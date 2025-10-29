package g3701_3800.s3722_lexicographically_smallest_string_after_reverse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexSmallest() {
        assertThat<String>(Solution().lexSmallest("dcab"), equalTo<String>("acdb"))
    }

    @Test
    fun lexSmallest2() {
        assertThat<String>(Solution().lexSmallest("abba"), equalTo<String>("aabb"))
    }

    @Test
    fun lexSmallest3() {
        assertThat<String>(Solution().lexSmallest("zxy"), equalTo<String>("xzy"))
    }
}
