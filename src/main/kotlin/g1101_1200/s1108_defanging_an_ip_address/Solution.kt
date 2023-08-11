package g1101_1200.s1108_defanging_an_ip_address

// #Easy #String #2023_05_31_Time_159_ms_(62.10%)_Space_39.5_MB_(35.48%)

class Solution {
    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}
