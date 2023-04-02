/*
В кругу стоят N человек, пронумерованных от 1 до N.
При ведении счета по кругу вычеркивается каждый второй человек,
пока не останется один. Составить две программы, моделирующие процесс.
Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
 */
package individual_work;

import java.util.ArrayList;

public class task_5_1 {
        public static void main(String args[]) {

            int n = 10;                     // Задаю длину списка

            ArrayList<Integer> num = new ArrayList<>(); // Создаю пустой список

            for (int i = 1; i < n+1; i++){              // Заполняю его заданным
                num.add(i);                             // количеством чисел
            }

            int i = 0;                                  // Буферные переменные
            int size = 0;

            while (num.size() > 1){                     // Создаём петлю, которая повторяется
                // до тех пор пока длина не будет 1

                if (num.size() % 2 != 0) {              // Если длина списка Нечётная

                    i = 0;
                    size = num.size()/2;                // Количество элементов которые удалятся

                    for (int j = 0; j < size ; j++) {   // Удаляем их через for
                        num.remove(i+1);
                        i++;
                    }
                    num.remove(0);                      // После удаляем первый

                }else if (num.size() % 2 == 0) {        // Если длина списка Чётная
                    i = 0;                              // Далее тоже что и выше
                    size = num.size()/2;

                    for (int j = 0; j < size ; j++) {
                        num.remove(i+1);
                        i++;

                    }
                }
            }
            System.out.println(num.get(0));
        }
    }

