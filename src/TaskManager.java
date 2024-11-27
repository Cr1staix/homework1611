/**
 * Класс создает объект типа TaskManager. Содержит методы для управления задачами.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskManager {
    private Queue<Task> tasks;

    public TaskManager() {
        tasks = new PriorityQueue<>();
    }

    /**
     * Метод для добавления задачи, в TaskManager.
     *
     * @param task Принимает параметр типа Task.
     */
    public void addTask(Task task) {
        tasks.offer(task);
    }

    public Queue<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return tasks.toString();
    }
}
