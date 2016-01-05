# GoJava
##Homework of the course
##Module 4 
###Задание №1
Мы допускаем, что фигуры описываются целыми числами;
Различные типы фигур определяются кол-вом аргументов, переданных в конструктор:
* 1 - круг (радиус)
* 2 - прямоугольник (две разные стороны)
* 3 - треуголник (3 разные стороны)

В зависимости от кол-ва аргументов, переданных в конструктор инициализируется конструктор соответствующей фигуры.
В результате выполнения программы, на экран выводится ее площадь в условных единицах.
Класс Figure - рабочая программа
Класс Main - тестовая программа

###Задание №2 
в одном файле Ex2, два класса Main и Convert
В классе Main создается объект Convert, конструктор которого принимает два значения: температура и ее тип. Далее выводятся обе температупы созданного объекта: по Цельсию и по Кельвину

###Задание №3 
в одном файле Ex3_notCorrect, два класса Main и Point. Программа не рабочая, но выполнена с точки зрения ООП (на мой взгляд):
В классе Main создаются два объекта класса Point, с переменными, которые содержат их координаты.
Далее, один объект применяет метод findDistance класса Point на второй объект, получает расстояние и выводит на экран. (по задумке)
Проблема в реализации данного метода, получаю ошибку Exception in thread "main" java.lang.NoSuchMethodException: Module4ex3.Main3.main([Ljava.lang.String;) 
Нужны идеи, что я делаю не так. Метод findDistance оперирует переменными объекта a через "this." и объекта b, который мы передаем в метод как параметр (сигнатура метода Point x), как x.
Синтаксис я проверил.
Библиотеку метода sqrt класса Math импортировала среда разработки, я в ней еще не разобрался, но уверен, что ошибка не в этом.

####Правильный ответ
Сделал задание второй раз, вышло правильно, даже использовал сканнер, но мне не нравится архитектура (как бы это смешно не звучало):

Класс Distance описывает объект, который содержит координаты сразу ДВУХ точек и метод по нахождению расстояния между ними.

Класс Main тестовый: создает объект класса Distance, просит ввести 4 точки, считывает их и инициализирует ими переменные созданного объекта, выводит на экран расстояние между точками.
Ответ правильный, но я вижу что у меня проблемы, как только объектов больше одного (не считая служебные типа Scanner, или статические методы абстрактных классов типа Math).
