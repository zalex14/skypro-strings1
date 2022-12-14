public class Main {
    public static void main(String[] args) {
        System.out.println("\nskyPro Строки 1");
        task1(); // Метод для задачи 1 Конкатерация строк
        task2(); // Метод для задачи 2 Заглавные
        task3(); // Метод для задачи 3 Замена ё
    }

    public static void task1() {
        System.out.println("\nСтроки 1. Задача 1");

        String firstName = "Ivan"; // имя
        String middleName = "Ivanovich"; // отчество
        String lastName = "Ivanov"; // фамилия
        String fullName = lastName + firstName + middleName; // ФИО сотрудника
        System.out.println( "ФИО сотрудника —" + fullName );
    }

    public static void task2() {
        System.out.println("\nСтроки 1. Задача 2 ФИО сотрудника для заполнения отчета");

        String fullName = "Ivanov Ivan Ivanovich"; // ФИО сотрудника
        System.out.println( "Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase() );
    }

    public static void task3() {
        System.out.println("\nСтроки 1. Задача 3 Замена ё");

        String fullName = "Иванов Семён Семёнович"; // ФИО сотрудника
        System.out.println( "Данные ФИО сотрудника —" + fullName.replace("ё", "е") );
    }

}