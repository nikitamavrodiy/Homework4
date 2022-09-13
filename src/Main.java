public class Main {
    public static void main(String[] args) {
        //задание 1
        int userAge = 18;
        if (userAge >= 18)
            System.out.println("Поздравляем с совершеннолетием! Вам " + userAge +"!");
        if (userAge < 18)
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать. Вам " + userAge +"!");

        //задание 2
        int age = 24;
        if (age >= 7 || age < 18)
            System.out.println("ребенок ходит в школу");
        if (age >= 18 || age < 24)
            System.out.println("человек уже закончил школу и может отправляться в университет");
        if (age >= 24)
            System.out.println("человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет");

        //задание 3
        int capacityCar = 102;
        int seatingPlaces = 60;
        int standingPlaces = capacityCar - seatingPlaces;
        int passengers = 80;

        if (passengers < 102) {
            if (passengers < seatingPlaces) {
                System.out.println("В вагоне еще есть сидячие места");
            } else {
                System.out.println("В вагоне еще есть места стоя");
            }
        } else {
            System.out.println("В вагоне нет мест");
        }

    }
}