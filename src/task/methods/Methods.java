//package task.methods;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // String a = "12";
        // int[] arr = {2,2,2,2,4};
        // int b = 30;
        // boolean c = true;
        // boolean d = false;
        // String n = "Mike";
        // String m = "Mikew";
        // int amount = 100;
        // int with = 20;
        // int years = 5;
        // System.out.println(yearsToHours(years));
        // wallet(amount, with);
        // int[] copiedArray = sumArray(arr);
        // for (int num : copiedArray) {
        //     System.out.print(num + " ");
        // }
        // Вызовы ваших методов

    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int sum(int a, int b){
        return a+b;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String concetenateString(String a, String b){
        return a+b;
    }

    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой
    public static String sumStringNum(String a, int b){
        return Integer.toString(Integer.parseInt(a)+b);
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean strNum(String a, int b){
        return (Integer.parseInt(a)<b);
    }


    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
    //  если обе false верни false
    public static boolean eq(boolean a, boolean b){
        if(a == false && b == false) return false;
        else return true;
    }


    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean eq2(int a){
        return (a%2 == 0);
    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String checkArray(int[] arr){
        boolean allEven = false;
        boolean allOdd = false;
        for (int num : arr){
            if (num%2 == 0) allEven = true;
            if (num%2 == 1) allOdd = true;
        }
        if (allEven) return "Массив четных чисел";
        else if (allOdd) return "Массив нечетных чисел";
        else return "Массив чеитных и нечетных чисел";
    }


    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] sumArray(int[] arr){
         int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++)  newArray[i] = arr[i];   
        return newArray;
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    //  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int summa(int[] arr){
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
    //  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static int yearsToMonth(int years){
        return years * 12;
    }
    public static int yearsToHours(int years){
        return years * 8760;
    }
    public static int yearsToMinutes(int years){
        return years * 525600;
    }
    

    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static String eqName(String a, String b){
        a.toLowerCase();
        b.toLowerCase();
        if (a==b) return "Имена одинаковые";
        else return "Имена разные";
    }

    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int lastElement(int[] arr){
        return arr[arr.length-1];
    }

    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int countA(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') count++;
        }
        return count;
    }
    

    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    public static void wallet(int amount, int withdrawal){
        if(amount >= withdrawal){
        amount -= withdrawal;
        System.out.println("В кошельке осталось " + amount);
        }
        else System.out.println("Недостаточно средств");
    }
}