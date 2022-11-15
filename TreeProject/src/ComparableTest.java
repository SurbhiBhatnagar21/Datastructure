
public class ComparableTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Jack",5.6f,"Wheatish",65.0f,"DBA",75000.0f);
		Employee emp2 = new Employee("Jim",5.6f,"Wheatish",65.0f,"DBA",65000.0f);
		Employee emp3 = new Employee("John",5.6f,"Wheatish",65.0f,"DBA",95000.0f);
		Employee emp4 = new Employee("Jill",5.6f,"Wheatish",65.0f,"DBA",75000.0f);
		Employee emp5 = new Employee("Joy",6.0f,"Wheatish",65.0f,"DBA",175000.0f);
		
		emp1.compareSalary(emp2);
		emp1.compareSalary(emp3);
		emp1.compareSalary(emp4);
		emp1.compareSalary(emp5);
		
		Office off = new Office();
		off.work(emp4,emp5);
	}
}
	class Employee	
	{
		String name;
		float height;
		String color;
		float weight;
		String designation;
		float salary;
		public Employee(String name, float height, String color, float weight, String designation, float salary) {
			super();
			this.name = name;
			this.height = height;
			this.color = color;
			this.weight = weight;
			this.designation = designation;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", height=" + height + ", color=" + color + ", weight=" + weight
					+ ", designation=" + designation + ", salary=" + salary + "]";
		}
		
		
		void selfTalk() {
			System.out.println(name+"having selftalk....");
		}
		void compareSalary(Employee x) {
			if(salary > x.salary) {
				System.out.println(name+"'s salary is more than"+x.name+"'s salary...");}
			else if(salary < x.salary) {
				System.out.println(name+"'s salary is less than"+x.name+"'s salary...");}
			else{
				System.out.println(name+"'s salary is equal to"+x.name+"'s salary...");
			}
		}
	}
	
	class Office{
		
		void work(Employee x,Employee y) {
			System.out.println("Employees is working..."+x.name+","+y.name);
			if(x.salary > y.salary) {
				System.out.println(x.name+"is earning more than"+y.name);
			}
			else if (x.salary < y.salary) {
				System.out.println(x.name+"is earning less than"+y.name);
		}
	}
			
	}	
	
	                                                                                                                                                         
	

		
	
		


		

		
	


