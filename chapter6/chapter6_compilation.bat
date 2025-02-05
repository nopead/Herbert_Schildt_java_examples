del classes\* /s /q
forfiles /p javas /m *.java /c "cmd /c javac -classpath C:\Users\smirnov.ai.kst\Documents\JAVA_1\chapter6 -d C:\Users\smirnov.ai.kst\Documents\JAVA_1\chapter6 @file"
timeout /T -1