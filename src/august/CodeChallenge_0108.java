package august;/*
Given a list of tasks with deadlines and total profit earned on completing a task,
find the maximum profit earned by executing the tasks within the specified deadlines.
Assume that each task takes one unit of time to complete, and a task can’t execute beyond its deadline.
Also, only a single task will be executed at a time.

        For example, consider the following set of tasks with a deadline and the profit associated with it.
        If we choose tasks 1, 3, 4, 5, 6, 7, 8, and 9, we can achieve a maximum profit of 109.
        Note that task 2 and task 10 are left out.
        Tasks	Deadlines	Profit
        1	9	15
        2	2	2
        3	5	18
        4	7	1
        5	4	25
        6	2	20
        7	5	8
        8	7	10
        9	4	12
        10	3	5
*/

import java.util.Arrays;
import java.util.List;

class CodeChallenge_0108
{
    public static void schedule(List<Task> tasks, int target)
    {
        int profit = 0;
        int[] timeline = new int[target];
        for(int i=0; i<target; i++){
            timeline[i]=-1;
        }
        for (Task task: tasks){
            for (int j=task.deadline-1; j>= 0; j--){
                if (timeline[j]==-1 &&j<target){
                    timeline[j]=1; //occupied
                    profit+= task.profit;
                    break;
                }
            }
        }
        System.out.println("Profit " + profit);
    }

    public static void main(String[] args)
    {
        List<Task> tasks = Arrays.asList(
                new Task(5, 4, 25),
                new Task(6, 2, 20),
                new Task(3, 5, 18),
                new Task(1, 9, 15),
                new Task(9, 4, 12),
                new Task(8, 7, 10),
                new Task(7, 5, 8),
                new Task(10, 3, 5),
                new Task(2, 2, 2),
                new Task(4, 7, 1));
        int target = 15;

        schedule(tasks, target);
    }
}

class Task
{
    public int taskId, deadline, profit;
    public Task(int taskId, int deadline, int profit)
    {
        this.taskId = taskId;
        this.deadline = deadline;
        this.profit = profit;
    }
}
