package g3701_3800.s3798_largest_even_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestEven() {
        assertThat<String>(Solution().largestEven("1112"), equalTo<String?>("1112"))
    }

    @Test
    fun largestEven2() {
        assertThat<String>(Solution().largestEven("221"), equalTo<String?>("22"))
    }

    @Test
    fun largestEven3() {
        assertThat<String>(Solution().largestEven("1"), equalTo<String?>(""))
    }
}
