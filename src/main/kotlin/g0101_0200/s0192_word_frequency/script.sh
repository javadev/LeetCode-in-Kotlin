# Read from the file words.txt and output the word frequency list to stdout.
# #Medium #Shell #2023_03_02_Time_96_ms_(80.40%)_Space_3.9_MB_(41.71%)
echo -e "$(cat words.txt)" | awk '{for(i=1;i<=NF;i++){if(arr[$i]==0){arr[$i]=1}else{arr[$i]=arr[$i]+1}}}END{for(i in arr) print i, arr[i]}' | sort -k2 -n -r
