package lesson2;

public class HomeworkAdvanced {
  public static void main(String[] args) {
// Задание 1
    int number = Integer.parseInt("234");
    String str = "some_text";
    number = number + str.length();
    System.out.println(number);

// Задание 2
    int a = 3;
    int b = 5;
    double result = Math.sqrt(a + b);
    System.out.println(result);

// Задание 3
    boolean hasFuel = true;
    boolean hasElectricsProblem = false;
    boolean hasMotorProblem = false;
    boolean hasTransmissionProblem = true;
    boolean hasWheelsProblem = true;
    boolean hasProblem = hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem; // флаг наличия неисправности
    int price = 0; // итоговая стоимость ремонтп
    int problemsCount = 0; // кол-во неисправностей

    if (!hasFuel && !hasProblem) {  // платная диагностика при соблюдении условий задачи
      price = price + 1000;
    }

    if (hasElectricsProblem) {
      problemsCount++;
      price += 5000;
    }

    if (hasMotorProblem) {
      problemsCount++;
      price += 10000;
    }

    if (hasTransmissionProblem) {
      problemsCount++;
      price += 4000;
    }

    if (hasWheelsProblem) {
      problemsCount++;
      price += 2000;
    }

    // расчет скидки за ремонт
    if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
      price = price - (price / 100 * 20);
    } else if (problemsCount >= 2) {
      price = price - (price / 100 * 10);
    }

    System.out.println("Стоимость ремонта: " + price);

  }
}
