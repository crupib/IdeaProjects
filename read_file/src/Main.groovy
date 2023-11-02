import groovy.xml.XmlSlurper

static void main(String[] args) {
  println "Hello world!"
  def number = 0
  new File('../data.txt').eachLine {
    line ->
      number++
      println "$number: $line"
  }
  def classes = [String, List, File]
  for (clazz in classes) {
    println clazz.package.name
  }
  def customers = new XmlSlurper().parse(new File('../customers.xml'))
  for (customer in customers.corporate.customer) {
    println "${customer.@name} works for ${customer.@company}"
  }
}