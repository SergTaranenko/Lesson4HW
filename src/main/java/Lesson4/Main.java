package Lesson4;


public class Main {
    public static void main(String[] args) {
        Jobman[] Jobmans = {
                new Jobman("Petrov Petr Petrvich ", "manager ", "Petrov@mail.ru ", "+7-777-77-77 ", 30000 , 25 ),
        new Jobman("Ivanov Ivan Ivanovich ", "manager ", "2@mail.ru", "+7-777-77-76 ", 30000 , 28 ),
        new Jobman("Sidorov Stepan Stepanovich ", "small manager ", "6@mail.ru ", "+7-777-77-75 ", 15000 , 21 ),
        new Jobman("Borisov Boris Borisovich ", "main manager ", "4@mail.ru ", "+7-777-77-74 ", 50000 , 45 ),
        new Jobman("Putin Vladimir Volphovich ", "director ", "5@mail.ru ", "+7-777-77-73 ", 150000 , 52 ),
    };


        for (Jobman e : Jobmans) {
            if (e.getAge() > 40) {
                System.out.println(e.getInfo());
            }
        }
    }
}