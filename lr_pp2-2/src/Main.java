import java.util.Scanner;

public class Main {
    /**
     * Метод пошуку за заданою назвою
     * @param data - дані задані в програмі
     * @param inputName - ім'я для пошуку
     */
    public static void nameEquals(Product[] data, String inputName){
        for(Product product:data){
            if(product.getName().equals(inputName)){
                System.out.println(product);
            }
        }
    }
    /**
     * Метод пошуку даних за заданою назвою і ціною, що менша за задану
     * @param data - дані задані в програмі
     * @param inputName - ім'я для пошуку
     * @param inputPrice - ціна для порівняння
     */
    public static void nameEqualsAndPriceLessThanOther(Product[] data, String inputName, double inputPrice){
        for(Product product:data){
            if(product.getName().equals(inputName) && product.getPrice() <= inputPrice)
                System.out.println(product);
        }
    }
    /**
     * Метод пошуку даних за періодом зберігання, що більший за заданий
     * @param data - дані задані в програмі
     * @param inputStoragePeriod - термін зберігання для порівняння
     */
    public static void storagePeriodIsAfter(Product[] data, double inputStoragePeriod){
        for(Product product:data){
            if(product.getStoragePeriod() > inputStoragePeriod)
                System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Product[] data =
                new Product[]{
                        new Product("1", "цукерки", "Рошен",
                                12.2, 900, 100),
                        new Product("2", "цукерки", "ТоВ \"Гарячі\"",
                                15.5, 365, 20),
                        new Product("3", "печеня", "Світоч",
                                30,12, 500),
                        new Product("4", "печеня", "Тернопільський м'ясокомбінат",
                                19.5, 20, 220),
                        new Product("5", "гель для душу", "ТОВ \"Проектед Енд\"",
                                80, 365, 110),
                        new Product("6", "гель для душу", "ТОВ \"Чисто\"",
                                30.5, 180, 180),
                        new Product("7", "печеня", "Рошен",
                                20.9, 62, 350),
                        new Product("8","цукерки","Данута \"Ленд\"",
                                2.1, 50, 100),
                        new Product("9", "печеня",  "ТоВ \"КатеРина\"",
                                9.9, 10, 5)};

        Scanner input = new Scanner(System.in);
        int key = -1;
        while (key != 0){
            System.out.println("""
                    Пошук продуктів \
                    
                    1) За заданим найменуванням \
                    
                    2) За заданим найменуванням та ціною яка не перевищує задану \
                    
                    3) За терміном зберігання, що більший заданого\
                    
                    4) Вивести усі продукти\
                    
                    0) - Щоб закінчити програму""");
            key = input.nextInt();
            String inputName;
            switch (key){
                case (1):
                    input.nextLine();
                    System.out.println("Введіть назву продукту ");
                    inputName = input.nextLine();
                    nameEquals(data, inputName);
                    break;
                case (2):
                    input.nextLine();
                    System.out.println("Введіть назву продукту ");
                    inputName = input.nextLine();
                    System.out.println("Введіть ціну для пошуку");
                    double inputPrice = input.nextDouble();
                    nameEqualsAndPriceLessThanOther(data, inputName ,inputPrice);
                    break;
                case (3):
                    input.nextLine();
                    System.out.println("Введіть термін зберігання в днях для пошуку");
                    double inputStoragePeriod = input.nextDouble();
                    storagePeriodIsAfter(data, inputStoragePeriod);
                    break;
                case(4):
                    input.nextLine();
                    for (Product p: data)
                        System.out.println(p);
                    break;
                case (0): System.out.println("Завершення роботи"); break;
                default:
                    System.out.println("Можливі опції для введення лише 1-4");
            }
        }
    }
}
