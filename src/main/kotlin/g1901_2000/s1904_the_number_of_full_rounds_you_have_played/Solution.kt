package g1901_2000.s1904_the_number_of_full_rounds_you_have_played

// #Medium #String #Math #2023_06_19_Time_149_ms_(100.00%)_Space_33.4_MB_(100.00%)

class Solution {
    fun numberOfRounds(loginTime: String, logoutTime: String): Int {
        var loginSerializeTime = serializeTime(loginTime)
        var logoutSerializeTime = serializeTime(logoutTime)
        if (logoutSerializeTime - 14 < loginSerializeTime &&
            logoutSerializeTime > loginSerializeTime
        ) {
            return 0
        }
        loginSerializeTime = maskSerializeTime(loginSerializeTime, 14)
        logoutSerializeTime = maskSerializeTime(logoutSerializeTime, 0)
        if (loginSerializeTime == logoutSerializeTime) {
            return 0
        }
        return if (loginSerializeTime > logoutSerializeTime + 14) {
            (
                calculateFullRounds(loginSerializeTime, MID_NIGHT_END) +
                    calculateFullRounds(MID_NIGHT_START, logoutSerializeTime)
                )
        } else calculateFullRounds(loginSerializeTime, logoutSerializeTime)
    }

    private fun maskSerializeTime(serializeTime: Int, mask: Int): Int {
        return (serializeTime + mask) / ROUND_INTERVAL * ROUND_INTERVAL
    }

    private fun serializeTime(time: String): Int {
        return time.substring(0, 2).toInt() * 60 + time.substring(3, 5).toInt()
    }

    private fun calculateFullRounds(login: Int, logout: Int): Int {
        return (logout - login) / ROUND_INTERVAL
    }

    companion object {
        private const val MID_NIGHT_END = 1440
        private const val MID_NIGHT_START = 0
        private const val ROUND_INTERVAL = 15
    }
}
