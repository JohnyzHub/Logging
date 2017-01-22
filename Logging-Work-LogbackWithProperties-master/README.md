# Logging-Work-LogbackWithProperties

This is a sample project for Logback (v1.1.7) build with maven.

The important things to remember about logback configration are :
appenders, encoder, rollingPolicy, triggeringPolicy


-------------------------------------
to show the root exception at the beginning of the stack trace,  just add %rEx (or equivalent %rootException) at the end of your logging pattern, 
 eg : <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{8} - %msg%n%rEx </pattern>
Refer : https://www.javacodegeeks.com/2011/09/logging-exceptions-root-cause-first.html

