import java.math.BigInteger;
import java.util.Scanner;
//import java.util.function.IntToDoubleFunction;

public class Main
{  
    public static void main(String[] args) 
    {
        cycle_task_8();
    }

    public static void linear_task_1()
    {
        // задача - вывести результат выражения ( (a - 3) * b / 2 ) + c
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа будет решать выражение ( (a - 3) * b / 2 ) + c");
        System.out.println("Введите a");
        Double a = scanner.nextDouble();
        System.out.println("Введите b");
        Double b = scanner.nextDouble();
        System.out.println("Введите c");
        Double c = scanner.nextDouble();
        scanner.close();


        double res = ( (a - 3) * b / 2 ) + c;
        System.out.println("Результат - " + res);
    }
    
    public static void linear_task_2()
    {
        // задача - вывести результат выражения ( (b + √(b^2 + 4ac) ) / (2a) ) - 3c(a^3) + b^-2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа будет решать выражение ( (b + √(b^2 + 4ac) ) / (2a) ) - 3c(a^3) + b^-2");
        System.out.println("Введите a");
        Double a = scanner.nextDouble();
        System.out.println("Введите b");
        Double b = scanner.nextDouble();
        System.out.println("Введите c");
        Double c = scanner.nextDouble();
        scanner.close();

        Double subres = (b + Math.sqrt( Math.pow(b, 2) + 4 * a * c ) ) / ( 2 * a );
        double res = subres  - c * Math.pow(a, 3) + Math.pow(b, -2);
        System.out.println("Результат - " + res);
    }
    
    public static void linear_task_3()
    {
        // задача - вывести результат выражения ( (sin x + cos y) / (cos x - sin y) ) * tg(x * y)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа будет решать выражение ( (sin x + cos y) / (cos x - sin y) ) * tg(x * y)");
        System.out.println("Введите x");
        Double x = scanner.nextDouble();
        System.out.println("Введите y");
        Double y = scanner.nextDouble();
        scanner.close();


        double res = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) ) * Math.tan(x * y);
        System.out.println("Результат - " + res);
    }
    
    public static void linear_task_4()
    {
        // задача - получить число в формате nnn.ddd и поменять местами n и d
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа поменяет d и n в числе nnn.ddd");
        System.out.println("Введите число");
        Double num = scanner.nextDouble();
        Double whole = Math.floor(num);
        Double fractional = num % 1;
        scanner.close();

        Double res = fractional * 1000 + whole / 1000;
        System.out.println("Результат - " + res);
    }
    
    public static void linear_task_5()
    {
        // Задача - получить секунды и отформатировать их следующим образом:
        // HHч MMмин SSс
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа будет преводить секунды в часы и минуты");
        System.out.println("Введите количество секунд");
        Integer num = scanner.nextInt();
        Integer HH = num / 3600;
        Integer MM = num / 60 % 60;
        Integer SS = num % 60;
        scanner.close();

        System.out.println("Результат - " + HH + "ч " + MM + "мин " + SS + "с");
    }
    
    public static void linear_task_6()
    {
        // Задача - получить координаты точни и вывести true если она принадлежит конкретной области 
        // (область можно увидеть на https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа определит принадлежит ли введенная точка конкретной области");
        System.out.println("Введите x");
        Double x = scanner.nextDouble();
        System.out.println("Введите y");
        Double y = scanner.nextDouble();
        scanner.close();
        
        Boolean res = false;

        if (y < 4 & x < 2 & y > 0 & x > -2) res = true;
        if (y < 0 & x < 4 & y > -3 & x > -4) res = true;
        System.out.println("Результат - " + res);
    }
    
    public static void branched_task_1()
    {
        // Задача - получить два угла и определить может ли существовать треугольник с такими углами и является ли он правильным
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа определит может ли существовать треугольник с введенными углами и является ли он правильным");
        System.out.println("Введите первый угол");
        Integer x = scanner.nextInt();
        System.out.println("Введите второй угол");
        Integer y = scanner.nextInt();
        scanner.close();

        if (x+y < 180) 
        {
            System.out.println("Треугольник существует");
            if (x == 90 | y == 90 | x+y == 90) 
            {
                System.out.println("Треугольник правильный");
            }
        }
        else 
        {
            System.out.println("Треугольник не существует");
        }
    }
    
    public static void branched_task_2()
    {
        // Задача - найти max( min(a, b), min(c, d) )
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа определит max( min(a, b), min(c, d) )");
        System.out.println("Введите a");
        Integer a = scanner.nextInt();
        System.out.println("Введите b");
        Integer b = scanner.nextInt();
        System.out.println("Введите c");
        Integer c = scanner.nextInt();
        System.out.println("Введите d");
        Integer d = scanner.nextInt();
        scanner.close();

        System.out.println("Результат - " + Math.max( Math.min(a, b) , Math.min(c, d) ) );
    }
    
    public static void branched_task_3()
    {
        // Задача - получить три точки и определить находятся ли они на одной линии
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа определит находятся ли введенные точки на одной линии");
        System.out.println("Введите x1");
        Integer x1 = scanner.nextInt();
        System.out.println("Введите y1");
        Integer y1 = scanner.nextInt();
        System.out.println("Введите x2");
        Integer x2 = scanner.nextInt();
        System.out.println("Введите y2");
        Integer y2 = scanner.nextInt();
        System.out.println("Введите x3");
        Integer x3 = scanner.nextInt();
        System.out.println("Введите y3");
        Integer y3 = scanner.nextInt();
        scanner.close();

        if (x1 == x2 & x2 == x3 | y1 == y2 & y2 == y3) 
        {
            System.out.println("Точки на одной линии");
        }
        else 
        {
            System.out.println("Точки не на одной линии");
        }
    }
    
    public static void branched_task_4()
    {
        // Задача - даны размеры отверстия и кирпича
        // Определить сможет ли кирпич пройти через отверстие
        Scanner scanner = new Scanner(System.in);
        System.out.println("Эта программа получит размеры отверстия (x1, y1) и кирпича (x2, y2, z2)");
        System.out.println("Затем она определит сможет ли кирпич пройти через отверстие");
        System.out.println("Введите размер отверстия (x1):");
        Double x1 = scanner.nextDouble();
        System.out.println("Введите размер отверстия (y1):");
        Double y1 = scanner.nextDouble();
        System.out.println("Введите размер кирпича (x2):");
        Double x2 = scanner.nextDouble();
        System.out.println("Введите размер кирпича (y2):");
        Double y2 = scanner.nextDouble();
        System.out.println("Введите размер кирпича (z2):");
        Double z2 = scanner.nextDouble();
        scanner.close();

        // проверяем три возможных способа протиснуть кирпич через отверстие
        if ( (x2 < x1 & y2 < y1) | (z2 < x1 & y2 < y1) | (x2 < x1 & z2 < y1)) 
        {
            System.out.println("Кирпич проходит через отверстие");
        }  
        else
        {
            System.out.println("Кирпич не проходит через отверстие");
        }
    }

    public static void branched_task_5()
    {
        // Найти значение функции
        // функцию можно увидеть на https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
        Scanner scanner = new Scanner(System.in);
        System.out.println("Эта программа определит значение функции");
        System.out.println("Введите значение x:");
        Double x = scanner.nextDouble();
        scanner.close();

        Double res = 0.0;
        if (x <= 3) 
        {
            res = Math.pow(x, 2) - 3*x + 9;
        }
        if (x > 3) 
        {
            res = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("Результат - " + res);
    }

    public static void cycle_task_1()
    {
        // Задача - получить целое положительное число и вывести сумму всех чисел от 1 до введенного числа
        // в задании не сказано включительно или нет, так что я сделал включительно
        Scanner scanner = new Scanner(System.in);
        System.out.println("Эта программа получит целое положительное число и выведет сумму всех чисел от 1 до введенного числа (включительно)");
        System.out.println("Введите число:");
        Integer num = scanner.nextInt();
        scanner.close();
        // вариант без цикла - формула n первых членов арифметической прогрессии
        Double res = ( (1 + num.doubleValue()) / 2 ) * num;
        System.out.println("Результат(формула) - " + res);
        // вариант с циклом
        res = 0.0;
        for (Integer i = 0; i < num + 1; i++)
        {
            res += i;
        }
        System.out.println("Результат(цикл) - " + res);
    }

    public static void cycle_task_2()
    {
        // Задача - получить числа a, b, h и вывести значения f(x) на промежутке [a, b] с шагом h
        // f(x) можно найти по ссылке https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf

        System.out.println("Эта программа получит числа a, b, h и выведет значения f(x) на промежутке [a, b] с шагом h");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        Double a = scanner.nextDouble();
        System.out.println("Введите b");
        Double b = scanner.nextDouble();
        System.out.println("Введите h");
        Double h = scanner.nextDouble();
        scanner.close();
        System.out.println("");
        Double current_value = a;
        for (Integer i = 0; i < (b - a) / h; i++)
        {
            if (current_value <= 2) 
            {
                System.out.print( (current_value * -1) + " ");
            }
            else
            {
                System.out.print(current_value + " ");
            }
            current_value += h;
        }
    }

    public static void cycle_task_3()
    {
        // найти сумму квадратов первых ста чисел

        // вариант использую формулу, без циклов
        Integer sum = (100*(100+1)*(2*100+1)) / 6;
        System.out.println(sum);

        // вариант с циклом
        sum = 0;
        for (Integer i = 1; i < 101; i++)
        {
            sum += i*i;
        }
        System.out.println(sum);
        // если запустить программу то можно увидеть, что результат одинаковый
    }

    public static void cycle_task_4()
    {
        // найти произведение квадратов первых двухста чисел

        // из-за того что результат будет слишком большим, используем обьект BigInteger
        BigInteger res = BigInteger.valueOf(1);
        for(Integer i = 1; i < 201; i++)
        {
            res = res.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(res);
    }

    public static void cycle_task_5()
    {
        // даны числовой ряд и некоторое число е
        // найти сумму тех членов ряда, можуль которых больше или равен заданному е
        // общий член ряда имеет вид: (1/2^n)+(1/3^n)

        // в задании не сказано начинается ли ряд с нуля или минус бесконечности, так что я предположил что он начитнается с нуля
        // если бы ряд начинался с минус бесконечности, то при любом возможном вводе стоило бы выводить "результат: бескончность"

        System.out.println("Эта программа выведет сумму всех членов ряда, которые больше или равны е");
        System.out.println("Введите е");
        Scanner scanner = new Scanner(System.in);
        Double e = scanner.nextDouble();
        scanner.close();

        // т.к. ряд постоянно уменьшается, нам нужно только складывать все члены ряда,
        // пока текущий член ряда не станет меньше чем е
        // но если е > 2, то тогда ни один член ряда не будет больше или равен е, и стоит вывести это на экран

        if (e > 2)
        {
            System.out.println("Членов ряда со значением больше двух не существует");
            return;
        }
        Double current = 0.0;
        Double sum = 0.0;
        Integer n = 0;
        do
        {
            // сначала добавляем следующий член ряда к общей сумме
            sum += current;
            // затем находим следующий элемент
            current = ( 1.0 / Math.pow (2.0, n) ) + ( 1.0 / Math.pow(3.0, n) );
            n++;
        }// если найденный следующий элемент меньше е, то заканчиваем цикл т.к. дальше члены ряда будут только меньше
        while (e < current);
        System.out.println("Результат: " + sum);
    }

    public static void cycle_task_6()
    {
        // вывести на экран соответсвий между символами и их численными обозначаениями в памяти компьютера

        // честно говоря не знаю что значит "вывести на экран соответсвий"
        // ...
        // так что пока выведу на экран обозначаение ввееденных символов в памяти компьютера

        System.out.println("Эта программа выводит на экран численное обозначаение символов в памяти компьютера");
        //Character temp;
        for (Integer i = 0; i < 128; i++)
        {
            System.out.print(Character.toChars(i));
            System.out.println( " = " + i);
        }
    }

    public static void cycle_task_7()
    {
        // Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        // m и n вводятся с клавиатуры

        System.out.println("Эта программа выведет вывести все делители в промежутке от m до n, кроме единицы и самого числа");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите m");
        Double m = scanner.nextDouble();
        System.out.println("Введите n");
        Double n = scanner.nextDouble();
        scanner.close();

        Double num = 0.0;
        Double temp = 0.0;
        for(Integer i = 0; i < (n - m); i++)
        {
            num = m + i;
            System.out.print("Делители числа " + num + ":");
            for (Integer j = 2; j < num; j++)
            {
                temp = num % j;
                if ( temp == 0)
                {
                    System.out.print(" " + j);
                }
            }
            System.out.println(';');
        }
    }

    public static void cycle_task_8()
    {
        // даны два числа. Определить цифры, входящие в запись как первого так и второго числа

        System.out.println("Эта программа определит цифры, входящие в запись двух введенных чисел");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        Double num1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        Double num2 = scanner.nextDouble();

        print_digits(num1);
        print_digits(num2);

        scanner.close();
    }
    // функция, выводящая в консоль из каких цифр состоит число
    public static void print_digits(Double num)
    {
        
        System.out.print("Число " + num + " состоит из цифр: ");
        while (num % 1 != 0)
        {
            num *= 10;
        }
        while (num != 0)
        {
            System.out.print(Math.floor(num%10) + " ");
            
            num /= 10;
            num = Math.floor(num);
        }
        System.out.println();
    }
}