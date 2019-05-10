package Lesson3

class Main {
    static void main(String[] args) {
        Closure divClosure = { a, b -> return a / b }
        Closure subClosure = { d, c -> return d - c }
        Closure mixClosure = { Closure div, Closure sub, a, b, c -> return sub(div(a, b), c) }

        println divClosure(1, 2)
        println subClosure (1, 2)
        println mixClosure (divClosure, subClosure, 6, 3, 1)
    }
}