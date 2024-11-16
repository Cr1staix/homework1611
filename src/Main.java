//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("javaDoc", 3, "Documentation");
        Task task2 = new Task("doubleDebiting", 1, "Bug");
        Task task3 = new Task("newOperatingLogic", 2, "Feature");
        Task task4 = new Task("newDescription", 3, "Documentation");
        Task task5 = new Task("addNewClass", 2, "Feature");
        Task task6 = new Task("PAGE_FAULT_IN_NONPAGED_AREA", 1, "Bug");

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);
        taskManager.addTask(task5);
        taskManager.addTask(task6);


        System.out.println(taskManager.getTasks().poll());
        System.out.println(taskManager.getTasks().poll());
        System.out.println(taskManager.getTasks().poll());
        System.out.println(taskManager.getTasks().poll());
        System.out.println(taskManager.getTasks().poll());
        System.out.println(taskManager.getTasks().poll());
    }
}