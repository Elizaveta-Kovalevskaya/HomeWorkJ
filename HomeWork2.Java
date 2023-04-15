/* 
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import  java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try {


            Scanner in = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            float number = in.nextFloat();
            System.out.printf("Ваше число: " + number);
            in.close();
        }catch (Exception e){
            System.out.println("Ошибка ввода числа, попробуйте снова.");
        }

    }
}
*/

/* 
2. Если необходимо, исправьте данный код (задание 2)
Код из задания:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

Исправления:


public class Main {
    public static void main (String[] args) {

        try {
            int d = 0;
            int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
            double catchedRes1;
            catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }





    }
}


*/

/*
Дан следующий код, исправьте его там, где требуется (задание 3)
Код из задания:

 public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/
/* 
Исправленный вариант:


public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3; /** ArithmeticException */
            System.out.println(a / b);
            printSum(23, 234); /** NullPointerException */
            int[] abc = { 1, 2 };
            abc[3] = 9; /** IndexOutOfBoundsException */
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Делить на 0 нельзя!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
*/
/* 
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import  java.util.Scanner;

public class Main {
    public static void main (String[] args) {

           Scanner in = new Scanner(System.in);
           System.out.print("Введите число или символ: ");
           String element = in.nextLine();
           System.out.println("Ваше число/символ: " + element);
           in.close();
           if (element == "") {
               throw new RuntimeException("Пустую строку вводить нельзя!");
           }




    }
}
*/