public class Main {

    public static int yearPrint() {
      //  в этом методе мы задаем года
        //  введите гребанный год
        var year2 = 2000;
        return year2;
    }


    public static int proverkaGoda () {
        // этот метод считает високосный или нет и выводит
        var year = yearPrint() ;
        if ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0)) {
            System.out.println( "Год " + year+ " високосный");
             } else {
            System.out.println( "Год " +year+ " обычный");
        }
        return year;
    }
    public static int osName () {
        var clientOS = 1;
        return clientOS;
    }
    public static int osYear () {
        var clientDeviceYear = 2013;
        return clientDeviceYear;
    }
    public static int iOs () {
        if (osName() == 0 && osYear() >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osName() == 0 && osYear() < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        }


        return 0;
    }
    public static int android () {
        if (osName() == 1 && osYear() >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (osName() == 1 && osYear() < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        }
        return 1;
    }



    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Реализуйте метод, который получает в качестве параметра год, проверяет,
        // является ли он високосным, и выводит результат в консоль.
        //Эту проверку вы уже реализовывали в задании по условным операторам.
        // Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        //
        //Результат программы выведите в консоль. Если год високосный,
        // то напечатайте сообщение: «...  год — високосный год». Если год невисокосный,
        // то: «... год — невисокосный год».

       // а в меине мы просто выводим итоговый метод на принт :)
        // или я не правильно понял саму задачу о_О, но покастил именно так
        proverkaGoda();

        System.out.println("Задача 2");
        //Задача 2
        //
        //Вспомните задание 2 из урока «Условные операторы»,
        // где вы предлагали пользователю облегченную версию приложения.
        //Напишите метод, куда подаются два параметра: тип операционной
        // системы (0 — iOS, 1 — Android ) и год выпуска устройства.
       // Если устройство старше текущего года, предложите ему установить облегченную версию.
      //  Текущий год можно получить таким способом:
         //  int currentYear = LocalDate.now().getYear();
        // Или самим задать значение вручную — ввести в переменную числовое значение.
        //  В результате программа должна выводить в консоль сообщение,
        //  какую версию приложения (обычную или облегченную) и для
        //  какой ОС (Android или iOS) установить пользователю.
        //var clientOS = 0;
        //int clientDeviceYear = 2088;

        //if (clientOS == 0 && clientDeviceYear >= 2015) {
        //    System.out.println( "Установите версию приложения для iOS по ссылке");
        //} else if (clientOS == 0 && clientDeviceYear < 2015) {
        //    System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        //}else {
//
        //if (clientOS == 1 && clientDeviceYear >= 2015) {
        //    System.out.println( "Установите версию приложения для Android по ссылке");
        //} else if (clientOS == 1 && clientDeviceYear < 2015) {
        //    System.out.println(" Установите облегченную версию приложения для Android по ссылке");
       // }}
        osYear();
        osName();
        if (iOs()) {
            else android();
        }


    }
}