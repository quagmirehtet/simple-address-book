package addressbook;

import java.util.*;

public class Main {

	static List<PersonData> list = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("========== ADDRESS BOOK MENU =========");
			System.out.println("1.Add New Contact\n" + "2.View All Contacts\n" + "3.Search Contact by Name \n"
					+ "4.Delete Contact \n" + "5.Exit");

			System.out.println("Choose and option (1-5) :");
			int optionNum = scanner.nextInt();
			scanner.nextLine();

			if (optionNum == 1) {

				System.out.println("Enter Name :");
				String name = scanner.nextLine();

				System.out.println("Enter Phone :");
				String phone = scanner.nextLine();

				System.out.println("Ener Email :");
				String email = scanner.nextLine();

				PersonData contactList = new PersonData(name, phone, email);
				list.add(contactList);

				System.out.println("Contact added successfully");

			}

			else if (optionNum == 2) {

				if (list.isEmpty()) {

					System.out.println("No contact not found.");

				}

				for (PersonData data : list) {

					data.showPersonalData();

				}

			}

			else if (optionNum == 3) {

				System.out.println("Enter the name to search for :");
				String searchName = scanner.nextLine();

				

				boolean found = false;

				for (int i = 0; i < list.size(); i++) {

					if (list.get(i).getName().equalsIgnoreCase(searchName)) {

						System.out.println("Found ==> Name :" + list.get(i).getName() + "|" + " Phone : "
								+ list.get(i).getPhone() + "|" + " Email :" + list.get(i).getEmail());

						found = true;

					}

				}
				
				if (list.isEmpty()) {

					System.out.println("No contact found to search");

				}else {

				if (!found) {

					System.out.println("Contact not found with name :" + searchName);

				}
				
				}
			}

			else if (optionNum == 4) {

				for (int i = 0; i < list.size(); i++) {

					System.out.println("Enter the exact name of the contact to delete :");
					String deleteName = scanner.nextLine();

					boolean isDeleted = list.removeIf(person -> person.getName().equalsIgnoreCase(deleteName));

					
					if(isDeleted) {
						
						System.out.println("Success: Contact deleted successfully!");

						
					}else {
						
						System.out.println("Contact not found to delete.");
						
					}

				}
			}

			else {

				System.out.println("Goodbye!");

				return;
			}

		}

	}
}
