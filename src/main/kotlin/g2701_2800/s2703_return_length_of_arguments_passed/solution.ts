// #Easy #2023_07_29_Time_47_ms_(98.59%)_Space_41.5_MB_(100.00%)

function argumentsLength(...args: any[]): number {

	let result = 0;

	for(let index = 0 ; index < args.length ; index++){
		result = result + 1;
	}

	return result;
};

/*
 * argumentsLength(1, 2, 3); // 3
 */

 export { argumentsLength }