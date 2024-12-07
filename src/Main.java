public class Main {
    public static void main(String[] args) {

        Author bulychev = new Author("Kir","Bulychev");
        Author pushkin = new Author("Alexandr", "Pushkin");

        Book Alisa = new Book("Alisa v strane chudes", bulychev, 2024);
        Book EvgeniyOnegin = new Book("Evgeniy Onegin", pushkin, 1986);

        System.out.println(Alisa.getBookName() + " " + Alisa.getAuthor());
        System.out.println(EvgeniyOnegin.getBookName() + " " + EvgeniyOnegin.getYear());

        Alisa.setYear(2018);
        System.out.println(Alisa.getBookName() + " " + Alisa.getYear());

    }
}