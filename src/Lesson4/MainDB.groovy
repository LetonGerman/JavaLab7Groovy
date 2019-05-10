package Lesson4

import groovy.sql.Sql

def url = 'jdbc:hsqldb:men:marathon'
def user = 'root'
def password = 'root'
def driver = 'org.hsqldb.jdbcDriver'

def sql = Sql.newInstance(url, user, password, driver)

ArrayList<String> arrayList = new ArrayList()

String query = 'select * from employees'

if (sql != null) {
    println "Error!"
} else
    System.exit(0)
sql.eachRow(query) {
    def row = it.toRowResult()
    row.each {
        arrayList.add("$it.value")
    }
}

for (String string : arrayList)
    println(string)

sql.close()