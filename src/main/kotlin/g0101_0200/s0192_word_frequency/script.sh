# Read from the file words.txt and output the word frequency list to stdout.
# #Medium #Shell #2022_10_18_Time_114_ms_(73.60%)_Space_3.8_MB_(32.09%)sed -e 's/ /\n/g' words.txt |
sed -e '/^$/d' | sort | uniq -c | sort -r | awk '{print $2" "$1}'