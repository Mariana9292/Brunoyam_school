//Задана строка «Hello Java!».
//Найти номер буквы «J» при помощи операции .indexOf() (смотри конец 4 урока!)
//Вывести строку в верхнем регистре (то есть заглавными буквами) с помощью операции .toUpperCase()
public class Module3Middle3 {
    public static void main(String[] args) {
        String s = "Hello Java!";
        System.out.println("Поиск символа - " + s.indexOf('J'));
        System.out.println("Возведение в верхний регистр - " + s.toUpperCase ());
    }
}