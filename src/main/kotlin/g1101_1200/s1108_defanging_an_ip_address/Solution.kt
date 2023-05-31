package g1101_1200.s1108_defanging_an_ip_address

// #Easy #String

class Solution {
    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}
