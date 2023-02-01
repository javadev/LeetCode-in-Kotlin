# Read from the file file.txt and print its transposed content to stdout.
# #Medium #Shell #2022_11_25_Time_461_ms_(33.47%)_Space_3.9_MB_(34.89%)
wordcount=$(head -1 file.txt | wc -w)
col_n=1
while [[ $col_n -le $wordcount ]]; do
	awk "{ print \$$col_n }" file.txt | paste -sd " "
	col_n=$((col_n + 1))
done
