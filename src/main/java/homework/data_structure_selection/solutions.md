## 1. Хранение уникальных идентификаторов пользователей

    В системе есть список уникальных идентификаторов пользователей. 
    Необходимо быстро проверять, присутствует ли пользователь с заданным идентификатором.

* Answer: DS - Hash Set
* Explanation: stores unique elements and supports fast search O(1)

## 2. Очередь задач для обработки

    Система должна обрабатывать запросы в порядке их поступления. Требуется поддерживать последовательность.

* Answer: Queue
* Explanation: FIFO supports the order of arrival

## 3. Хранение ключей и значений

    Необходимо хранить настройки приложения, где каждый параметр имеет имя (ключ) и значение.

* Answer: Dictionary
* Explanation: Every key has a hash, O(1)

## 4. Иерархия сотрудников компании

    Требуется сохранить данные о сотрудниках в виде дерева: каждый сотрудник имеет подчинённых.

* Answer: Tree
* Explanation: naturally represents hierarchy with parent/children

## 5. Поиск элементов по приоритету

    Система обрабатывает задачи, причём приоритет задачи определяет, когда она будет выполнена.

* Answer: Heap
* Explanation: defines /oders tasks to be executed by their priority

## 6. Управление друзьями пользователя

    Требуется хранить связи между пользователями в социальной сети, где каждый пользователь может быть связан с несколькими другими.

* Answer: Graph
* Explanation: many-to-many relationships btw nodes/users

## 7. Упорядоченный список

    Необходимо хранить список чисел в отсортированном виде, чтобы быстро находить минимальное и максимальное значения.

* Answer:Balanced Binary Search Tree
* Explanation: keeps elements sorted and allows to retrieve min and max values quickly - O(log n), because we go either
  only left or right during our search

## 8. Учет посещений страниц

    Система должна отслеживать уникальные посещения страниц на веб-сайте и вести подсчёт общего числа посещений.

* Answer: HashSet
* Explanation: contains unique values
* counter???

## 9. История действий пользователя:

     Последнее действие должно быть доступно первым для отмены, затем предыдущее и так далее.

* Answer: Stack
* Explanation - LIFO - undo

## 10. Структура телефонной книги:

     Нужно быстро находить телефонный номер по имени.

* Answer: dictionary
* Explanation: key(hash)/value, 0(1)

## 11. Проверка корректности скобочной последовательности:

    Обратите внимание, что последняя открытая скобка должна закрываться первой.

* Answer: Stack
* Explanation: we compare every element with the first one, if the stack is empty in the end, this means, we found a
  pair to each brace/parenthesis

## 12. Хранение объектов с частым доступом:

    Нужно хранить фиксированное количество элементов и быстро получать любой из них.

* Answer: Array/List
* Explanation: index-based access, O(1)

## 13. Уникальные слова в тексте:

    Нужно хранить только неповторяющиеся слова и быстро проверять, встречалось ли слово раньше.

* Answer: check any data structure => Store in HashSet
* Explanation: Set stores unique values

## 14. Структура электронной очереди:

    Пациенты должны вызываться в том порядке, в котором записывались.

* Answer: Queue
* Explanation: Implements FIFO

## 15. Список дел:

    Задачи можно упорядочивать по сроку выполнения, поэтому важен удобный доступ к наибольшему приоритету (сначала срочные).

* Answer: Heap (Priority Queue)
* Explanation: Prioritizes tasks

## 16. Анализ частоты слов:

    Нужно хранить слова и считать, сколько раз каждое встречается.

* Answer: Dictionary
* Explanation: the word is a key and its frequency is a value

## 17. Система рейтингов

    Вам нужно хранить список игроков с их рейтингами, чтобы быстро находить игрока с самым высоким рейтингом.

* Answer: Heap
* Explanation: highest-rated player is on top O(1)

## 18. Проверка дубликатов в потоке данных

    Данные поступают в потоковом режиме, и нужно проверять, был ли данный элемент уже получен ранее.

* Answer: HashSet
* Explanation: check if we already have this element with contains() method
