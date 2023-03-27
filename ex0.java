import java.util.ArrayList;

public class ex0 {

    public static void main(String[] args) {
        // 1.Подумать над структурой класса Ноутбук для магазина техники — выделить поля
        // и методы. Реализовать в Java.
        // Laptop.java

        // 2.Создать множество ноутбуков.
        ArrayList<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("HUAWEI", "BoD-WFH9", "Intel Core i5 1135G7", (float) 2.4, (float) 15.6, (float) 1.56,
                16, 512, 57990));
        laptopList.add(
                new Laptop("MSI", "14 C5M-010XRU", "AMD Ryzen 5 5625U", (float) 2.3, (float) 14, (float) 1.4, 16, 512,
                        42890));
        laptopList.add(
                new Laptop("HIPER", "G16", "Intel Core i7 11700", (float) 2.5, (float) 16.1, (float) 2.7, 16, 1024,
                        169890));
        System.out.println(laptopList);
        System.out.println();

        // 3.Написать метод, который будет запрашивать у пользователя критерий (или
        // критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.

        showFilteredLaptops(laptopList, getRequest());

        // Предустановленная проверка (цена меньше 55 000р):
            // Laptop testLaptop = new Laptop();
            // testLaptop.setPrice(55000);
            // showFilteredLaptops(laptopList, testLaptop);
    }

    public static Laptop getRequest() {
        Laptop filter = new Laptop();
        Integer input = -1;
        System.out.println("Фильтрация ноутбуков по параметрам.");
        while (input != 0) {
            System.out.println(
                    "Введите цифру, соответствующую необходимому критерию.\n1.Размер экрана\n2.Частота процессора\n3.ОЗУ\n4.SSD\n5.Вес\n6.Цена\n0.Поиск по введенным параметрам");
            input = getIntegerInput();
            if (input == 1) {
                System.out.print("Введите минимальный размер экрана: ");
                filter.setScreenSize(getFloatInput());
            } else if (input == 2) {
                System.out.print("Введите минимальную частоту процессора: ");
                filter.setCpuFrequency(getFloatInput());
            } else if (input == 3) {
                System.out.print("Введите минимальный размер ОЗУ: ");
                filter.setRam(getIntegerInput());
            } else if (input == 4) {
                System.out.println("Введите минимальный размер SSD: ");
                filter.setSsd(getIntegerInput());
            } else if (input == 5) {
                System.out.println("Введите максимальный вес");
                filter.setWeight(getFloatInput());
            } else if (input == 6) {
                System.out.println("Введите максимальную цену:");
                filter.setPrice(getIntegerInput());
            }
        }
        return filter;
    }

    public static void showFilteredLaptops(ArrayList<Laptop> fullLaptopList, Laptop filter) {
        ArrayList<Laptop> filteredLaptops = new ArrayList<>();
        // Проверка: Размер экрана, Частота процессора, ОЗУ, SSD, Вес
        for (Laptop checkLaptop : fullLaptopList) {
            if (filter.getCpuFrequency() == null
                    || checkLaptop.checkCpuFrequency(filter.getCpuFrequency())) {
                if (filter.getScreenSize() == null || checkLaptop.checkScreenSize(filter.getScreenSize())) {
                    if (filter.getRam() == null || checkLaptop.checkRam(filter.getRam())) {
                        if (filter.getSsd() == null || checkLaptop.checkSsd(filter.getSsd())) {
                            if (filter.getWeight() == null || checkLaptop.checkWeight(filter.getWeight())) {
                                if (filter.getPrice() == null || checkLaptop.checkPrice(filter.getPrice())) {
                                    filteredLaptops.add(checkLaptop);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (filteredLaptops.isEmpty()) {
            System.out.println("По Вашему запросу результатов нет.");
            return;
        }
        System.out.println("Ноутбуки подходящие под запрашиваемые параметры: ");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
        return;
    }

    public static Integer getIntegerInput() {
        Integer input = -1;
        while (input < 0) {
            try {
                input = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                System.out.println("Ошибка ввода.");
            }
        }
        return input;
    }

    public static Float getFloatInput() {
        Float input = (float) 0;
        while (input <= 0) {
            try {
                input = Float.parseFloat(System.console().readLine());
            } catch (Exception e) {
                System.out.println("Ошибка ввода.");
            }
        }
        return input;
    }
}