public class Main {
    public static void main(String[] args) {
        //задание 1
        int userAge = 18;
        if (userAge >= 18)
            System.out.println("Поздравляем с совершеннолетием! Вам " + userAge + "!");
        else
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать. Вам " + userAge + "!");

        //задание 2
        int age = 24;
        if (age >= 7) {
            if (age < 18)
                System.out.println("ребенок ходит в школу");
            else if (age < 24)
                System.out.println("человек уже закончил школу и может отправляться в университет");
            else
                System.out.println("человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");
        }

        //задание 3
        int capacityCar = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacityCar - seatingPlaces;
        int passengers = 80;

        if (passengers < 102) {
            if (passengers < seatingPlaces) {
                System.out.println("В вагоне остались сидячие места и стоя");
            } else {
                System.out.println("В вагоне еще есть места стоя");
            }
        } else {
            System.out.println("В вагоне нет свободных мест");
        }

        // Третья часть домашнего задания

        //Задание 3.1
        int ageHuman = 15;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека "+ageHuman+", то человеку нужно ходить в детский сад");
        } else if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("Если возраст человека "+ageHuman+", то человеку нужно ходить в школу");
        } else if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Если возраст человека "+ageHuman+", то человеку нужно ходить в университет");
        } else if (ageHuman > 24) {  //по условию задания - "больше" 24-х (т.е. не равно)
            System.out.println("Если возраст человека "+ageHuman+", то человеку пора ходить на работу");
        }

        //Задание 3.2
        int babyAge = 4;
        if (babyAge < 5)
            System.out.println("Если ребенку "+babyAge+", то он не может кататься на аттракционе");
        else if (babyAge > 5 || babyAge < 14)  //соответствует условию задания, знак ">=" не нужен.
            System.out.println("Если ребенку "+babyAge+", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        else if (babyAge > 14)
            System.out.println("Если ребенку "+babyAge+", то он может кататься без сопровождения взрослого");

        //Задание 3.3
        int one = 423;
        int two = 223;
        int free = 234;
        int largest;
        if (free > one && free > two)
            largest = free;
        else if (one > two)
            largest = one;
        else
            largest = two;
        System.out.println("Из трех чисел большим является " + largest);
    }
}