// #Easy #2023_07_17_Time_47_ms_(99.33%)_Space_43.5_MB_(17.55%)

function map(arr: number[], fn: (n: number, i: number) => number): number[] {
  const res:number[]=[];
  for(let i=0;i<arr.length;i++){
      res.push(fn(arr[i],i));
  }
    return res;
};
