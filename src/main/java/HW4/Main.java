package HW4;

import Lesson4.Jobman;


public class Main {
    public static void main(String[] args) {
        Lesson4.Jobman[] Jobmans = {
                new Lesson4.Jobman("Petrov Petr Petrvich ", "manager ", "Petrov@mail.ru ", "+7-777-77-77 ", 30000 , 25 ),
                new Lesson4.Jobman("Ivanov Ivan Ivanovich ", "manager ", "2@mail.ru", "+7-777-77-76 ", 30000 , 28 ),
                new Lesson4.Jobman("Sidorov Stepan Stepanovich ", "small manager ", "6@mail.ru ", "+7-777-77-75 ", 15000 , 21 ),
                new Lesson4.Jobman("Borisov Boris Borisovich ", "main manager ", "4@mail.ru ", "+7-777-77-74 ", 50000 , 45 ),
                new Lesson4.Jobman("Putin Vladimir Volphovich ", "director ", "5@mail.ru ", "+7-777-77-73 ", 150000 , 52 ),
        };


        for (Jobman e : Jobmans) {
            if (e.getAge() > 40) {
                System.out.println(e.getInfo());
            }
        }
    }
}