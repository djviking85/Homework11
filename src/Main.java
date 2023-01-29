public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задача 1");
        //Реализуйте метод, который получает в качестве параметра год, проверяет,
        // является ли он високосным, и выводит результат в консоль.
        //Эту проверку вы уже реализовывали в задании по условным операторам.
        // Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        //
        //Результат программы выведите в консоль. Если год високосный,
        // то напечатайте сообщение: «...  год — високосный год». Если год невисокосный,
        // то: «... год — невисокосный год».


        proverkaGoda(2000);
        proverkaGoda(222);
        proverkaGoda(26489);

    }

    public static int proverkaGoda(int year) {
        // этот метод считает високосный или нет и выводит
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " обычный");
        }
        return year;
    }


    public static void task2() {


        System.out.println("Задача 2");
        //Задача 2
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

        getUpLink(2004, 1);

        getUpLink(2017, 0);
    }

    public static String osYear(int year) {
        // в этом методе мы считаем какой год производства девайся
        if (year > 2015) {
            return ("Установите полную версию приложения  ");
        } else {
            return ("Установите облегченную версию приложения  ");
        }
    }

    public static String osSistem(int os) {
        // в это методе мы считаем какая у нас версия osа
        if (os == 0) {
            return ("  iOS  ");
        } else {
            return ("  Vedroid  ");
        }
    }

    public static void getUpLink(int plsYyear, int plsOs) {
        System.out.println(" " + osYear(plsYyear) + " для " + osSistem(plsOs));
    }


    public static void task3() {

        System.out.println("Задача 3");
        // Возвращаемся к задаче на расчет дней доставки банковской карты.
        // Ваша задача — доработать код, а именно написать метод,
        // который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        //    В банке для клиентов организовывается доставка карт на дом.
        //   Чтобы известить клиента о том, когда будет доставлена его карта,
        //  нужно знать расстояние от офиса до адреса доставки.
        //  Правила доставки такие:
        //  Доставка в пределах 20 км занимает сутки.
        //  Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //  Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
        //  Свыше 100 км доставки нет.
        //  То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //  Напишите программу, которая выдает сообщение в
        //  консоль: "Потребуется дней: " + срок доставки.
        //  Объявите целочисленную переменную deliveryDistance = 95,
        //  которая содержит дистанцию до клиента.

        // подкорректировал

        int dist = writeDistance(101);
        if (dist < 0 || dist > 100) {
            System.out.println("доставка не осуществляется ");
        } else {
            System.out.println( "требуется  " + dist+ " дней на доставку");
        }
    }

    public static int writeDistance(int distance) {

        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        }
        return distance;
    }
}



