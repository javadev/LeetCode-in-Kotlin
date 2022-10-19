# Read from the file file.txt and output all valid phone numbers to stdout.
# #Easy #Shell #2022_10_18_Time_98_ms_(88.64%)_Space_3.1_MB_(55.55%)
egrep '^[0-9]{3}-[0-9]{3}-[0-9]{4}$|^\([0-9]{3}\)\s[0-9]{3}-[0-9]{4}$' file.txt