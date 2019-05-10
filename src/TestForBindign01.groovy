class TestForBinding01 {

    String strOne

    void testMethod(String pStrOne) {

        String strVar
        Binding bndWork = new Binding()
        bndWork.setVariable("strVar", "one")
        println bndWork.getVariable("strVar")
        println pStrOne + ", strVar=" + strVar
    }
}

TestForBindign01 tstOne = new TestForBindign01()
tstOne.testMethod("Test")
Binding bndMain = new Binding()
bndMain.setProperty("strOne", "oneStr")
println bndMain.getProperty("strOne")
println "strOne=" + tstOne.strOne
println bndMain.hasVariable("strOne")
println bndMain.hasVariable("strone")