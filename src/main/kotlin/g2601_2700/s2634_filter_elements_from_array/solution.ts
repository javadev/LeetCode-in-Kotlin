// #Easy #2023_07_17_Time_55_ms_(90.38%)_Space_44.6_MB_(12.44%)

function filter(arr: number[], fn: (n: number, i: number) => boolean): number[] {
    const filteredArr:number[] = [];

    for(let i=0; i<arr.length; i++){
        if(fn(arr[i], i)) filteredArr.push(arr[i]);
    }

    return filteredArr;
};
