// Определение класса Газета
public class New {
    // Поля класса
    private String nazvanie; // Название газеты
    private int tirazh;      // Тираж газеты
    private int kolichestvoPolos; // Количество полос

    // Конструктор для инициализации всех полей
    public New(String nazvanie, int tirazh, int kolichestvoPolos) {
        this.nazvanie = nazvanie;
        this.tirazh = tirazh;
        this.kolichestvoPolos = kolichestvoPolos;
    }

    // Метод для получения полной информации о газете
    public String info() {
        return "Газета: " + nazvanie + ", Тираж: " + tirazh + ", Количество полос: " + kolichestvoPolos;
    }

    // Метод для изменения названия газеты
    public void changeName(String newNazvanie) {
        this.nazvanie = newNazvanie;
    }

    // Метод для изменения количества полос
    public void changeNumber(int newKolichestvoPolos) {
        this.kolichestvoPolos = newKolichestvoPolos;
    }
}