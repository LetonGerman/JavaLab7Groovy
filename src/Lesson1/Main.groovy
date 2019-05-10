package Lesson1

import javax.naming.Binding

class Main1 {

    def i = 1 as Integer
    Integer b = 2
    String string = "String"
    double aDouble = 0.24

    /*
    Main(i, Integer b, String string, double aDouble) {
        this.i = i
        this.b = b
        this.string = string
        this.aDouble = aDouble
    }
    */

    static void test(i, Integer b, String str, double aDouble) {
        def j
        Integer c
        String string
        double bDouble
        Binding binding = new Binding()
        binding.setVariable("j", i)
        binding.setVariable("c", b)
        binding.setVariable("string", str)
        binding.setVariable("bDouble", aDouble)

        println(j)
        println(c)
        println(string)
        println(bDouble)
    }
}

Main1 main = new Main1()
main.test(1, 2, "String", 0.56)
Binding binding = new Binding()
binding.setProperty("i", "j")
binding.setProperty("b", "c")
binding.setProperty("string", "string")
binding.setProperty("aDouble", "bDouble")
println(binding.getProperties("i"))

