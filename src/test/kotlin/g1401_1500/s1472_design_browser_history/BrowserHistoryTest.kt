package g1401_1500.s1472_design_browser_history

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class BrowserHistoryTest {
    @Test
    fun browserHistoryTest() {
        val browserHistory = BrowserHistory("leetcode.com")
        browserHistory.visit("google.com")
        browserHistory.visit("facebook.com")
        browserHistory.visit("youtube.com")
        assertThat(browserHistory.back(1), equalTo("facebook.com"))
        assertThat(browserHistory.back(1), equalTo("google.com"))
        assertThat(browserHistory.forward(1), equalTo("facebook.com"))
        browserHistory.visit("linkedin.com")
        assertThat(browserHistory.forward(2), equalTo("linkedin.com"))
        assertThat(browserHistory.back(2), equalTo("google.com"))
        assertThat(browserHistory.back(7), equalTo("leetcode.com"))
    }
}
