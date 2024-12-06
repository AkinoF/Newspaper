// Главный класс для тестирования
public class Newspaper {
    public static void main(String[] args) {
        // Создание объектов класса Gazeta
        New gazeta1 = new New("Новости Сегодня", 50000, 20);
        New gazeta2 = new New("Время", 30000, 30);
        New gazeta3 = new New("Наука и Жизнь", 15000, 15);

        // Получение полной информации обо всех объектах
        System.out.println(gazeta1.info());
        System.out.println(gazeta2.info());
        System.out.println(gazeta3.info());

        // Изменение названия и количества полос одного объекта
        gazeta1.changeName("Сегодняшние Новости");
        gazeta1.changeNumber(25);

        // Получение полной информации об измененном объекте
        System.out.println(gazeta1.info());
    }
}