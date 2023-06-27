package g0401_0500.s0468_validate_ip_address

// #Medium #String #2022_12_29_Time_192_ms_(62.50%)_Space_35.9_MB_(87.50%)

class Solution {
    fun validIPAddress(ip: String): String {
        if (ip.isEmpty()) {
            return NEITHER
        }
        val arr = ip.split("\\.".toRegex()).toTypedArray()
        val arr1 = ip.split(":".toRegex()).toTypedArray()
        if (arr.size == 4) {
            for (num in arr) {
                try {
                    if (num.length > 1 && num.startsWith("0") || num.toInt() > 255) {
                        return NEITHER
                    }
                } catch (e: Exception) {
                    return NEITHER
                }
            }
            return "IPv4"
        } else if (arr1.size == 8) {
            for (num in arr1) {
                if (num.length < 1 || num.length > 4) {
                    return NEITHER
                }
                for (j in 0 until num.length) {
                    val ch = num[j]
                    if (ch.code > 9 &&
                        (
                            Character.isLowerCase(ch) && ch > 'f' ||
                                Character.isUpperCase(ch) && ch > 'F'
                            )
                    ) {
                        return NEITHER
                    }
                }
            }
            return "IPv6"
        }
        return NEITHER
    }

    companion object {
        private const val NEITHER = "Neither"
    }
}
