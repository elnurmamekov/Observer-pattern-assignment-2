public class Main {

    public static void main(String[] args) {
        MusicChannel telegramChannel1 = new MusicChannel("Warm Your Soul...");

        User mark = new User("markus");
        User nick = new User("white choco");

        telegramChannel1.join(mark);
        telegramChannel1.join(nick);

        telegramChannel1.addMusic("Виктор Цой- Белый снег.");
        telegramChannel1.addMusic("Michael Jackson - Billie Jean");

    }
}
