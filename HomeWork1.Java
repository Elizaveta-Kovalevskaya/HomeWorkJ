/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Main {
    public static void main(String[] args) {
        Method1(10, 0);
        int[] array = {4, 6, 12, 1};
        Method2(array,16);
        String[] arr = {"X", "Y", null};
        Method3(arr);

    }
    
    public static void Method1(int firstNum, int secondNum){
        if(secondNum ==  0) throw new ArithmeticException("На 0 делить нельзя!");
        int result = firstNum/secondNum;
        System.out.println("Результат деления" + " " + firstNum + " " + "на" + " " + secondNum + " " + "равен" + " " + result);
    }
     
    
    public static void Method2(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента c таким индексом не существует");
        else System.out.printf("Элемент с индексом" + " " + index + " " + "равен" + " " + array[index]);
    }

    
    public static void Method3(String[] arr){
        for (String item: arr){
            if(item == null) throw new NullPointerException("Элемент не найден или не существует");
            System.out.println(item);
        }
    }


}


Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 
public static int sum2d(String[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

Можно получить три типа исключний:
1. аргументом в массиве строк может быть null, в этом случае появится NullPointerException
2. в цикле for по j используется число 5, если размер массива окажется меньше, то получим ArrayIndexOutOfBoundsException
 




Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.


public class Main {
    public static void main(String args[]) {
        int[] arrayOne = {5, 2, 4};
        int[] arrayTwo = {3, 1};
        try {

            for (int i = 0; i < arrayOne.length; i++) {

                    int[] newArray;
                newArray = new int[arrayOne[i] + arrayTwo[i]];
                newArray[i] = arrayOne[i] - arrayTwo[i];
                    System.out.print(newArray[i] + " ");


            }


        } catch (ArrayIndexOutOfBoundsException e) {
            if (arrayOne.length != arrayTwo.length) {
                System.out.println("Ошибка индексации массива");
            }
        }

    }
}



* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Main {
    public static void main(String args[]) {
        int[] arrayOne = {10, 2, 4};
        int[] arrayTwo = {5, 1};

        for (int i = 0; i < arrayOne.length; i++) {

            int[] newArray;
            newArray = new int[arrayOne[i] + arrayTwo[i]];
            newArray[i] = arrayOne[i] / arrayTwo[i];
            System.out.print(newArray[i] + " ");
            if (arrayOne.length != arrayTwo.length) throw new RuntimeException("Длина массивов не равна");

        }



    }
}

*/