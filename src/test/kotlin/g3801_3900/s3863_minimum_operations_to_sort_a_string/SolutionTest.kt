package g3801_3900.s3863_minimum_operations_to_sort_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("dog"), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("card"), equalTo<Int>(2))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations("gf"), equalTo<Int>(-1))
    }

    @Test
    fun minOperations4() {
        assertThat<Int>(Solution().minOperations("abc"), equalTo<Int>(0))
    }

    @Test
    fun minOperations5() {
        assertThat<Int>(Solution().minOperations("a"), equalTo<Int>(0))
    }

    @Test
    fun minOperations6() {
        assertThat<Int>(Solution().minOperations("z"), equalTo<Int>(0))
    }

    @Test
    fun minOperations7() {
        assertThat<Int>(Solution().minOperations("ab"), equalTo<Int>(0))
    }

    @Test
    fun minOperations8() {
        assertThat<Int>(Solution().minOperations("aa"), equalTo<Int>(0))
    }

    @Test
    fun minOperations9() {
        assertThat<Int>(Solution().minOperations("ba"), equalTo<Int>(-1))
    }

    @Test
    fun minOperations10() {
        assertThat<Int>(Solution().minOperations("aaa"), equalTo<Int>(0))
    }

    @Test
    fun minOperations11() {
        assertThat<Int>(Solution().minOperations("abcde"), equalTo<Int>(0))
    }

    @Test
    fun minOperations12() {
        assertThat<Int>(Solution().minOperations("bca"), equalTo<Int>(2))
    }

    @Test
    fun minOperations13() {
        assertThat<Int>(Solution().minOperations("bac"), equalTo<Int>(1))
    }

    @Test
    fun minOperations14() {
        assertThat<Int>(Solution().minOperations("cba"), equalTo<Int>(3))
    }

    @Test
    fun minOperations15() {
        assertThat<Int>(Solution().minOperations("cbba"), equalTo<Int>(3))
    }

    @Test
    fun minOperations16() {
        assertThat<Int>(Solution().minOperations("cbca"), equalTo<Int>(2))
    }
}
