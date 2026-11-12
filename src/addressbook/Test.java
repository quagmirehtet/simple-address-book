package addressbook;

import java.util.*;

public class Test {
	
	static List<PersonData> list=new ArrayList<>();

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter name :");
		String name=scanner.nextLine();
		
		
		System.out.println("Enter phone :");
		String phone=scanner.nextLine();
		
		
		System.out.println("Enter email :");
		String email=scanner.nextLine();
		
		
		PersonData personData=new PersonData(name,phone,email);
		list.add(personData);

		System.out.println("Contact added successfully");
		
		for(PersonData p : list) {
			
			p.showPersonalData();
			
		}
		
//		System.out.println("Enter only number 3 :");
//		
//		int num=scanner.nextInt();
//		scanner.nextLine();
//		
//		
//		
//		if(num==3) {
//			
//			boolean found=false;
//			
//			System.out.println("Enter contact search by name :");
//			String searchName=scanner.nextLine();
//			
//			
//			
//			
//			for(PersonData d : list) {
//				
//				
//			if(d.getName().equalsIgnoreCase(searchName)) {
//				
//				System.out.println("Found Name --> Name :"+d.getName()+"|"+" Phone :"+d.getPhone()+"|"+"Email : "+d.getEmail());
//				
//				found=true;
//				
//				
//				
//			}
//			
//			if(!found) {
//				
//				System.out.println("Contact not found with name : "+searchName);
//				
//			}
//				
//				
//			}
//			
//			
//		}
		
//		System.out.println("Enter only number 4 ");
//		int num=scanner.nextInt();
//		scanner.nextLine();
//		
//		if(num==4) {
//			
//			if(list.isEmpty()) {
//				
//				System.out.println("No contact found to delete.");
//				
//			}
//			
//			String deleteName="";
//		
//		boolean isDeleted=false;
//		
//		PersonData removePerson;
//		
//		for(int i=0; i < list.size();i++) {
//			
//			 removePerson=list.get(i);
//			
//			System.out.println("Enter contact to delete with name :");
//			 deleteName=scanner.nextLine();
//			
//			
//			
//			if(removePerson.getName().equalsIgnoreCase(deleteName)) {
//				
//				list.remove(i);
//				
//				isDeleted=true;
//				
//				if(removePerson.getName().isEmpty()) {
//					
//					System.out.println(deleteName+" is deleted successfully");
//					
//				}
//				
//			}
//			
//		
//			
//			
//			
//			
//			
//		}
//		}
	
		
	


	}

}