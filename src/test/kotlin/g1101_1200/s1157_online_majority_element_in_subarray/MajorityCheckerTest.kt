package g1101_1200.s1157_online_majority_element_in_subarray

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class MajorityCheckerTest {
    @Test
    fun majorityCheckerTest() {
        val majorityChecker = MajorityChecker(intArrayOf(1, 1, 2, 2, 1, 1))
        MatcherAssert.assertThat(majorityChecker.query(0, 5, 4), CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(majorityChecker.query(0, 3, 3), CoreMatchers.equalTo(-1))
        MatcherAssert.assertThat(majorityChecker.query(2, 3, 2), CoreMatchers.equalTo(2))
    }
}
