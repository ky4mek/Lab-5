package com.company;

public class Main {
    // Example 4.1
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new RuntimeException("Непроверяемая ошибка");
//        } catch (RuntimeException e) {    // исключение перехвачено
//            System.out.println("1 " + e); // исключение обработано
//        }
//        System.out.println("2");
//    }

    // Example4.2
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new RuntimeException("Непроверяемая ошибка");
//        } catch (Exception e) {
//            System.out.println("2 " + e);
//        }
//        System.out.println("3");
//
//    }

    // Example4.3
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new RuntimeException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//        } catch (RuntimeException e) {
//            System.out.println("2");
//        } catch (Exception e) {
//            System.out.println("3");
//        }
//        System.out.println("4");
//    }

    // Example4.4
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new RuntimeException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//        } catch (Exception e) {
//            System.out.println("2");
//        } catch (Error e) {
//            System.out.println("3");
//        }
//        System.out.println("4");
//
//    }

    //Example 4.5
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new RuntimeException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//        }
//        System.out.println("2");
//    }

    //Example 4.6
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new NullPointerException("ошибка");
//        } catch (ArithmeticException e) {
//            System.out.println("1");
//        } catch (Exception e) {
//            System.out.println("2");
//        } catch (RuntimeException e) {
//            System.out.println("3");
//        }
//
//        System.out.println("4");
//    }

    //Example 4.7
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new NullPointerException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//            throw new ArithmeticException();
//        } catch (ArithmeticException e) {
//            System.out.println("2");
//        }
//        System.out.println("3");
//    }
//}


    //Example 4.8
//    public static int m() {
//        try {
//            System.out.println("0");
//            throw new RuntimeException();
//        } finally {
//            System.out.println("1");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(m());
//    }
//}

    // Example 4.9
//    public static int m() {
//        try {
//            System.out.println("0");
//            return 55;    // выход из метода
//        } finally {
//            System.out.println("1");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(m());
//    }
//}

    // Example 4.10
//    public static int m() {
//        try {
//            System.out.println("0");
//            return 15;
//        } finally {
//            System.out.println("1");
//            return 20;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(m());
//    }
//}

    // Example 4.11
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new NullPointerException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//        } finally {
//            System.out.println("2");
//        }
//        System.out.println("3");
//    }
//}

    // Example 4.12
//    public static void m(String str, double chislo) {
//        if (str == null) {
//            throw new IllegalArgumentException("Строка введена неверно");
//        }
//        if (chislo > 0.001) {
//            throw new IllegalArgumentException("Неверное число");
//        }
//    }
//
//    public static void main(String[] args) {
//        m(null, 0.000001);
//    }
//}

    // Example 4.13
//    public static void main(String[] args) {
//        try {
//            int l = args.length;
//            System.out.println("размер массива= " + l);
//
//            int h = 10 / l;
//            args[l + 1] = "10";
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Индекс не существует");
//        }
//    }
//}

    //Example 4.14
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
