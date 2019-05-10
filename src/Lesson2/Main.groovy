package Lesson2

import groovy.time.TimeCategory

class Main {

    static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(3.4)
        BigDecimal bigDecimal1 = new BigDecimal(1.7)

        println("Равенство объектов (equals)")
        println(bigDecimal == bigDecimal1)
        println()
        println("Равенство ссылок")
        println(bigDecimal.is(bigDecimal1))
        println()

        println("Прибавляем")
        println(bigDecimal.add(bigDecimal1))
        println(bigDecimal + bigDecimal1)
        println()

        println("Делим") //С делением какая то хрень!!
        println(bigDecimal.divide(bigDecimal1))
        println(bigDecimal / bigDecimal1)
        println()

        println("Умножаем")
        println(bigDecimal.multiply(bigDecimal1))
        println(bigDecimal * bigDecimal1)
        println()

        println("10 -> f -> First")
        def a = 10
        println(a.getClass().getName())
        a = 'f'
        println(a.getClass().getName())
        a = 'First'
        println(a.getClass().getName())
        println()

        println("10 -> First -> f")
        def b = 10
        println(b.getClass().getName())
        b = 'First'
        println(b.getClass().getName())
        b = 'f'
        println(b.getClass().getName())
        println()

        println("First -> f -> 10")
        def c = 'First'
        println(c.getClass().getName())
        c = 'f'
        println(c.getClass().getName())
        c = 10
        println(c.getClass().getName())
        println()

        println("First -> 10 -> f")
        def d = 'First'
        println(d.getClass().getName())
        d = 10
        println(d.getClass().getName())
        d = 'f'
        println(d.getClass().getName())
        println()

        println("f -> 10 -> First")
        def e = 'f'
        println(e.getClass().getName())
        e = 10
        println(e.getClass().getName())
        e = 'First'
        println(e.getClass().getName())
        println()

        println("f -> First -> 10")
        def f = 'f'
        println(f.getClass().getName())
        f = 'First'
        println(f.getClass().getName())
        f = 10
        println(f.getClass().getName())
        println()

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2015, GregorianCalendar.FEBRUARY, 28)
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar(2015, GregorianCalendar.JANUARY, 31)

        println(gregorianCalendar - gregorianCalendar1)

        use (TimeCategory) {
            Date date = gregorianCalendar.time
            Date date1 = date - 1.month
            println(date1)
            Date date2 = date1 + 1.month + 1.day
            println(date2)
        }

    }

}
