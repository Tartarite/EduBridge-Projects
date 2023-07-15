package frameworks;

import java.util.*;

public class Implementation {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		LinkedList<Employee> ll = new LinkedList<Employee>();
		Vector<Employee> v = new Vector<Employee>();
		Stack<Employee> st = new Stack<Employee>();
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>();
		ArrayDeque<Employee> ad = new ArrayDeque<Employee>();
		HashSet<Employee> hs = new HashSet<Employee>();
		LinkedHashSet<Employee> lhs = new LinkedHashSet<Employee>();
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {

			System.out.println("Which collection framework class do you want to use?");
			System.out.println("1.  Array List");
			System.out.println("2.  Linked List");
			System.out.println("3.  Vector");
			System.out.println("4.  Stack");
			System.out.println("5.  Priority Queue");
			System.out.println("6.  Array Deque");
			System.out.println("7.  Hash Set");
			System.out.println("8.  Linked Hash Set");
			System.out.println("9.  Tree Set");
			System.out.println("10. Exit");
			System.out.println("Enter your choice: ");

			ch = sc.nextInt();

			switch (ch) {
			case 1:
				ArrayListImp(al);
				break;
			case 2:
				LinkedListImp(ll);
				break;
			case 3:
				VectorImp(v);
				break;
			case 4:
				StackImp(st);
				break;
			case 5:
				PriorityQueueImp(pq);
				break;
			case 6:
				ArrayDequeImp(ad);
				break;
			case 7:
				HashSetImp(hs);
				break;
			case 8:
				LinkedHastSetImp(lhs);
				break;
			case 9:
				TreeSetImp(ts);
				break;

			}

		} while (ch > 0 && ch < 10);

	}

	public static void ArrayListImp(ArrayList<Employee> al) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();

			switch (ch) {

			case 1:
				if (al.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : al) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;

			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				al.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = al.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : al) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;

			}
		} while (ch > 0 && ch < 5);
	}

	public static void LinkedListImp(LinkedList<Employee> ll) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (ll.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : ll) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				ll.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = ll.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : ll) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}
				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void VectorImp(Vector<Employee> v) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (v.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : v) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				v.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = v.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : v) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void StackImp(Stack<Employee> st) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (st.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : st) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				st.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = st.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : st) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void PriorityQueueImp(PriorityQueue<Employee> pq) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (pq.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : pq) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				pq.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = pq.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : pq) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void ArrayDequeImp(ArrayDeque<Employee> ad) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (ad.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : ad) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				ad.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = ad.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : ad) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void HashSetImp(HashSet<Employee> hs) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (hs.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : hs) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				hs.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = hs.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : hs) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void LinkedHastSetImp(LinkedHashSet<Employee> lhs) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (lhs.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : lhs) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				lhs.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = lhs.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : lhs) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}

	public static void TreeSetImp(TreeSet<Employee> ts) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int eid;
		do {
			System.out.println("What operation do you want to do?: ");
			System.out.println("1. Display all employees");
			System.out.println("2. Add an employee");
			System.out.println("3. Delete an employee");
			System.out.println("4. Search for an employee");
			System.out.println("5. Exit");

			ch = sc.nextInt();
			switch (ch) {

			case 1:
				if (ts.isEmpty()) {
					System.out.println("No employees available");
				} else {

					for (Employee emp1 : ts) {
						emp1.displayDetails();
						System.out.println("-------------------------------");
					}
				}
				break;
			case 2:
				Employee emp = new Employee();
				emp.setDetails();
				ts.add(emp);
				break;
			case 3:

				System.out.println("Enter emp id to delete: ");
				eid = sc.nextInt();
				int flag = 0;
				Iterator<Employee> itr = ts.iterator();
				while (itr.hasNext()) {
					Employee emp1 = itr.next();
					if (emp1.getEid() == eid)
						itr.remove();
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("Employee removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			case 4:

				flag = 0;
				System.out.println("Enter emp id to search: ");
				eid = sc.nextInt();
				for (Employee emp1 : ts) {
					if (emp1.getEid() == eid) {
						emp1.displayDetails();
						flag = 1;
					}

				}
				if (flag == 0) {
					System.out.println("Employee does not exist");
				}
				break;
			}
		} while (ch > 0 && ch < 5);
	}
}

//Maintain employee records,
//maintain a switch case("Which collection framework class do you want to use?")
//Create an Employee class with fields eid,age,salary,dept,position,fname,lname
//Use different collection framework classes to create a list of objects of Employee class
//Inside each class you need a switch case to add,remove,display and search employees	