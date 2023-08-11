package g2301_2400.s2327_number_of_people_aware_of_a_secret

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun peopleAwareOfSecret() {
        assertThat(Solution().peopleAwareOfSecret(6, 2, 4), equalTo(5))
    }

    @Test
    fun peopleAwareOfSecret2() {
        assertThat(Solution().peopleAwareOfSecret(4, 1, 3), equalTo(6))
    }
}
