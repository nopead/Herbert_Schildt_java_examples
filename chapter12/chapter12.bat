del classes\* /s /q
forfiles /p javas /m *.java /c "cmd /c javac -d C:\Users\smirnov.ai.kst\Documents\JAVA_1\chapter12\classes @file"
timeout /T -1