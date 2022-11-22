package lesson2;

public class HomeworkBase {

  public static void main(String[] args) {

// Задание 1
    float height = 177.5F;
    float weight = 82.5F;

    System.out.println(weight / (height * height));

// Задание 2
    int ageChildren = 10;

    if (ageChildren <= 0) {
      System.out.println("Ребенок еще не родился");
    } else if (ageChildren <= 6) {
      System.out.println("пошел в сад");
    } else if (ageChildren <= 11) {
      System.out.println("пошел в младшую школу");
    } else if (ageChildren <= 17) {
      System.out.println("пошёл в среднюю школу");
    } else {
      System.out.println("пошёл в университет");
    }

// Задание 3
    boolean chicken = true;
    boolean vegetables = false;
    boolean sour = true;
    boolean toast = true;
    boolean sausage = true;
    boolean eggs = true;

    boolean isReadyCaesar = chicken && vegetables && sour && toast; //курица, овощи, соус и гренки
    boolean isReadyRussianSalad = vegetables && (sausage || chicken) && eggs; //овощи, колбаса или курица, яйца
    //boolean isReadyVegetableSalad = vegetables; //нужны только овощи

    if (isReadyCaesar) {
      System.out.println("Приготовлю Цезарь");
    } else if (isReadyRussianSalad) {
      System.out.println("Приготовлю Оливье");
    } else if (vegetables) {
      System.out.println("Приготовлю Овощной салат");
    } else {
      System.out.println("У меня ничего нет :(");
    }


  }
}
