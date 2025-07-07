package g3601_3700.s3606_coupon_code_validator

// #Easy #2025_07_07_Time_32_ms_(100.00%)_Space_60.79_MB_(100.00%)

class Solution {
    fun validateCoupons(code: Array<String>, businessLine: Array<String>, isActive: BooleanArray): List<String> {
        val validBusinessLines = hashSetOf("electronics", "grocery", "pharmacy", "restaurant")
        val filteredCoupons = mutableListOf<Pair<String, String>>()
        for (i in code.indices) {
            if (!isActive[i]) {
                continue
            }
            val currentBusinessLine = businessLine[i]
            if (currentBusinessLine !in validBusinessLines) {
                continue
            }
            val currentCode = code[i]
            if (currentCode.isEmpty()) {
                continue
            }

            var isValidCodeChar = true
            for (char in currentCode) {
                if (!(char == '_' || char.isLetterOrDigit())) {
                    isValidCodeChar = false
                    break
                }
            }

            if (isValidCodeChar) {
                filteredCoupons.add(Pair(currentCode, currentBusinessLine))
            }
        }
        filteredCoupons.sortWith(compareBy<Pair<String, String>> { it.second }.thenBy { it.first })
        return filteredCoupons.map { it.first }
    }
}
