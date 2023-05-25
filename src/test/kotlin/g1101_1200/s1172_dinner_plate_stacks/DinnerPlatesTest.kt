package g1101_1200.s1172_dinner_plate_stacks

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class DinnerPlatesTest {
    @Test
    fun dinnerPlatesTest() {
        val d = DinnerPlates(2)
        d.push(1)
        d.push(2)
        d.push(3)
        d.push(4)
        d.push(5)
        MatcherAssert.assertThat(d.popAtStack(0), CoreMatchers.equalTo(2))
        d.push(20)
        d.push(21)
        MatcherAssert.assertThat(d.popAtStack(0), CoreMatchers.equalTo(20))
        MatcherAssert.assertThat(d.popAtStack(2), CoreMatchers.equalTo(21))
        MatcherAssert.assertThat(d.pop(), CoreMatchers.equalTo(5))
        MatcherAssert.assertThat(d.pop(), CoreMatchers.equalTo(4))
        MatcherAssert.assertThat(d.pop(), CoreMatchers.equalTo(3))
        MatcherAssert.assertThat(d.pop(), CoreMatchers.equalTo(1))
        MatcherAssert.assertThat(d.pop(), CoreMatchers.equalTo(-1))
    }
}
