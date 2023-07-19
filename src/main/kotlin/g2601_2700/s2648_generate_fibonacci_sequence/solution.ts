// #Easy #2023_07_19_Time_53_ms_(93.66%)_Space_42.8_MB_(84.05%)

function* fibGenerator(): Generator<number, any, number> {
    let first = 0;
    let second = 1;
    let value = 0;
    let count = 0;
    while (true){
        if (count <= 1){
            count++;
            yield value++;
        } else {
            value = first + second;
            first = second;
            second = value;
            yield value;
        }
    }
};

/*
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
