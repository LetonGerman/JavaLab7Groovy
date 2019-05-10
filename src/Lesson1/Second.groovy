package Lesson1

class Second {
    static void main(String[] args) {
        String string
        println(string instanceof Integer)
        println(meth())
    }

    //В Груви возвращается значение последней переменной, с котороый работали,
    // т.е. в нашем случае - С
    static Integer meth() {
        Integer a, b, c
        a = 2
        b = 5
        c = a + b
    }

}
