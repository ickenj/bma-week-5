/**
 * @date 10/11/2012
 * @description BMA Week 5 Assignment
 */

import java.util.Date;
/**
 * @author Joanne Icken
 *
 */

  public class Assignment {
 
	public static void main(String[] args) {
		Task task1 = new Task("Task one", "Work");
		Task task2 = new Task("Task two", "Home");
		System.out.println("Tasks created:");
	
		task1.printtask();
		task2.printtask();

	}
	static String getElement(String values, int index) {
		if (values.length() <= index) {
			return "null"; //null is not allowed for a String method.
		} else {
			return Character.toString(values.charAt(index));
		}
	}
}

class Task {

	public String task_name;
	public Date task_date;
	public String task_category;
	public int task_id;
	public String task_state;

	public Task() {
		this.task_name = "new task";
		this.task_date = new Date();
		this.task_category = "new category";
		this.task_state = "open";
	}

	public Task(String Name, String Categ){
		this.task_id = this.task_id + 1;
		this.task_name = Name;
		this.task_date = new Date();
		this.task_category = Categ;
		this.task_state = "open";
	}

	public void printtask() {
		System.out.println("##################################################");
		System.out.println("### Task name: " + this.task_name);
		System.out.println("### Task Description: " + this.task_category);
		System.out.println("### Task Date: " + this.task_date);
		System.out.println("### Task ID: " + this.task_id);
		System.out.println("### Task State: " + this.task_state);
		System.out.println("##################################################\n");
	}
}
