package chapter3

val String.lastChar: Char
    get() = get(length - 1)


var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        setCharAt(length - 1, value)
    }