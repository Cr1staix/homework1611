/**
 * Класс создает объект типа Task. Содержит реализацию интерфейса Comparable.
 */

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String name;
    private Integer priority;
    private String category;

    public Task(String name, Integer priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(priority, task.priority) && Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority, category);
    }

    @Override
    public String toString() {
        return name + " " + priority + " " + category;

    }


    /**
     * Сортирует задачи по приоритету, в случае одного приоритета сортирует по категории.
     *
     * @param o Принимает параметр типа Task.
     * @return возвращает значение int для сортировки.
     */
    @Override
    public int compareTo(Task o) {
        int c = Integer.compare(this.priority, o.priority);
        if (c == 0) {
            c = this.category.compareTo(o.category);
        }
        return c;
    }
}
