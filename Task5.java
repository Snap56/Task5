package HomeWork.Task5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// 1.Создать словарь HashMap. Обобщение <Integer, String>.
// 2.Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// 3.Изменить значения сделав пол большой буквой.
// 4.Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// 5.*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.

public class Task5 {
  public static void main(String[] args) {
    // 1.Создать словарь HashMap. Обобщение <Integer, String>.
    HashMap<Integer, String> hashMap = new HashMap<>();
    // 2.Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28
    // м"), добавить ключь, если не было!)
    hashMap.put(1, "Иванов Иван Иванович 32 М");
    hashMap.put(2, "Иванова Ольна Ивановна 12 Ж");
    hashMap.put(3, "Пупкин Свяирслав Игоревич 88 М");
    hashMap.put(4, "Петренко Клавдия Захаровна 54 Ж");
    hashMap.put(5, "Сивко Татьяна Сергеевна 34 Ж");

    Set<Integer> keySet = hashMap.keySet();
    for (Integer value : hashMap.keySet()) {
      System.out.println(value);
    }
    // 3.Изменить значения сделав пол большой буквой.
    // сделал маленькими . в большие тоже саме только toUpperCase()
    String[] tmp;
    for (int i = 0; i < keySet.size(); i++) {
      tmp = hashMap.get(keySet.toArray()[i]).split(" ");
      tmp[4] = tmp[4].toLowerCase();
      String tmp1 = String.join(" ", tmp);
      hashMap.put(i, tmp1);
      System.out.println(hashMap.get(keySet.toArray()[i]));
    }

    // 4.Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов
    // И.И."
    // Не стал менять колекцию . просто вывел
    Iterator<Integer> iterator = hashMap.keySet().iterator();
    while (iterator.hasNext()) {
      Integer l = iterator.next();
      tmp = hashMap.get(keySet.toArray()[l]).split(" ");
      tmp[1] = (tmp[1].charAt(0) + ".");
      tmp[2] = (tmp[2].charAt(0) + ".");
      String tmp1 = String.join(" ", tmp);
      System.out.println(tmp1);
    }
    // *Сортировать значения по возрасту и вывести отсортированную коллекция как в
    // четвёртом пункте.

  }

}
