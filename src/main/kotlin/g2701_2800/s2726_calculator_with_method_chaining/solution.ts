// #Easy #2023_08_03_Time_43_ms_(99.15%)_Space_43.4_MB_(9.15%)

class Calculator {
    init: number

    constructor(value: number) {
        this.init = value
    }

    add(value: number): Calculator { //NOSONAR
        this.init += value
        return this
    }

    subtract(value: number): Calculator { //NOSONAR
        this.init -= value
        return this
    }

    multiply(value: number): Calculator { //NOSONAR
        this.init *= value
        return this
    }

    divide(value: number): Calculator { //NOSONAR
        if (value === 0) throw Error('Division by zero is not allowed')
        this.init /= value
        return this
    }

    power(value: number): Calculator { //NOSONAR
        this.init = this.init ** value
        return this
    }

    getResult(): number {
        return this.init
    }
}

export { Calculator }
