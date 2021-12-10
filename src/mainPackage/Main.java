package mainPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {     //Главный метод главного класса
        Food[] breakfast = new Food[args.length];                 // Определение ссылок на продукты завтрака
        //массив(завтрак) состоит из всех аргументов строки. каждый продукт с новым значением параметра-это новый продукт завтрака

        // Анализ аргументов командной строки и создание для них экземпляров соответствующих классов для завтрака
        for (int i = 0; i < args.length; i++) {//создаем для каждого продукта экземпляр соответсвующего названию класса
           String[] parts = args[i].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Tea")) {
                breakfast[i] = new Tea(parts[1]);
            }
        }

       for (Food item : breakfast) {//цикл отвечает за вывод данных о продукте
            item.consume();
        }

//        Food food = new Tea("черный");
//        System.out.println(food + ": " + countFoods(breakfast, food));//считает сколько раз был выпит черный чай

        printFoods(breakfast);//функция для подсчета продукта
        System.out.println("Всего хорошего!");
    }

    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }

    static void printFoods(Food[] breakfast){
        int c = 0;
        int a = 1;
        int p = 0;
        for(int i = 0; i < breakfast.length; i++) { //сколько раз были употреблены все продукты

            if(breakfast[i] instanceof Cheese){
                c++;
            }
            else if (breakfast[i] instanceof Apple){
                a++;
            }
            else if (breakfast[i] instanceof Tea){
                p++;
            }
        }
        System.out.println("CЫР - " + c);
        System.out.println("ЯБЛОКО - " + a);
        System.out.println("ЧАЙ - " + p);
    }
}





