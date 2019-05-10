package Lesson1.For11

class Ex {
    def a = 1
    Integer b = 2
    //с = 3

    static void main(String[] args) {
        //Ничего не видит, выдаёт ошибку
        //println(a)
        //println(b)
        //println(c)

        Ex ex = new Ex();
        ex.a
        ex.b
        // C не видит
        ex.c
    }
}
