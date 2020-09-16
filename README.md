# Selenium-Test-Framework-Page-Object-Model
Test Framework to automate the complete cycle of ordering merchandise on an E-Commerce website

1)This is a robust test framework to automate the full cycle of ordering merchandise on E-Commerce website http://automationpractice.com/index.php
2)The DriverFactory class is a utility that Sets System Property and initializes driver for the type of browser passed as an argument to its constructor(chrome or firefox)
3)This framework is built using Page Object Model and uses TestNG Framework
4)There are 10 page classes, each representing a separate page on the E-Commerce website.
5)The test class TestNGOrderingDressFullCycle.java uses TestNG framework to implement test cases
6)Class TestNGOrderingDressFullCycle.java creates instances of all 10 page classes to perform the test
7)Assert statements are used to:
a)Verify Final Amount on various pages is consistent
b)The system generates a genuine message once the order is placed and thanks the customer for his/her order.
8) This Test Framework is very robust,readable and organized. If web elements are changed at any point, they can be changed easily on Page classes without any overhead to update them on individual lines of code in Test Class.
