public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Первая задача");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println(lastName+" "+firstName+" "+middleName);

        // Задача 2
        System.out.println("Вторая задача");
        String fullName = lastName+" "+firstName+" "+middleName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        // Задача 3
        System.out.println("Третяя задача");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }

}