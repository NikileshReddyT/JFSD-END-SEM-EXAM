package com.jfsd.JFSD_HQL;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Scanner n = new Scanner(System.in);
        
        System.out.println("Warm Greetings");
        while(true) {
        System.out.println("What operation do you want to perform?\n1-Inserting values\n2-Retrieving values\n3-Updating values\n4-Deleting values\n5-Exit");
        int a = n.nextInt();
        n.nextLine();
        
        if(a == 5) {
        	break;
        }
        if(a == 1) { // insert
            while(true) {
                System.out.println("Do you want to enter the Details of a new member?\n1-yes\n2-no\n");
                int choice = n.nextInt();
                n.nextLine(); 
                
                if(choice == 2) {
                    break;
                }
                
                Transaction tnx = s.beginTransaction();
                Student sd = new Student();
                
                System.out.println("\nEnter the ID of the student (make sure it's unique)\n");
                sd.setSid(n.nextInt());
                n.nextLine();
                
                System.out.println("\nEnter the Name of the student\n");
                sd.setSname(n.nextLine());
                
                System.out.println("\nEnter the Gender of the student\nm-male\nf-female\n");
                sd.setGender(n.nextLine().charAt(0));
                
                System.out.println("\nEnter the Department of the student\n");
                sd.setDepartment(n.nextLine());
                
                System.out.println("\nEnter the Contact of the student\n");
                sd.setContact(n.nextLong());
                n.nextLine(); 
                
                System.out.println("\nEnter the CGPA of the student\n");
                sd.setCgpa(n.nextFloat());
                n.nextLine(); 
                
                s.persist(sd);
                tnx.commit();
                System.out.println("\n\nThank you for providing your details.Your details are inserted succesfully\n");
            }
//            System.out.println("Thank you so much for inserting the values.");
            
            
        }else if(a == 2) { // retrieve 
        	
        	System.out.println("\nWhat is the id number of the student you want to see?");
        	int b = n.nextInt();
        	n.nextLine();
        	Student sd = s.find(Student.class, b);
        	System.out.println(sd.toString());
        	
        	
        	
        }else if(a == 3) { // update
        	
        	while(true) {
        		
        	
        	Transaction tnx = s.beginTransaction();
        	System.out.println("What is the student number?");
        	int num = n.nextInt();
        	n.nextLine();
        	System.out.println("What do you want to select for updating?\n1-student name\n2-gender\n3-department\n4-contact\n5-cgpa");
        	int b = n.nextInt();
        	n.nextLine();
        	Student sd = s.find(Student.class, num);
        	if(b == 1) {
        		System.out.println("Enter the Name you want to modify for student id: "+num);
        		sd.setSname(n.nextLine());
        	}else if(b == 2) {
        		System.out.println("Enter the Gender you want to modify for student id: "+num+"\nm-male\nf-female");
        		sd.setGender(n.nextLine().charAt(0));
        	}else if(b == 3) {
        		System.out.println("Enter the Department you want to modify for student id: "+num);
        		sd.setDepartment(n.nextLine());
        	}else if(b == 4) {
        		System.out.println("Enter the Contact you want to modify for student id: "+num);
        		sd.setContact(n.nextInt());
        		n.nextLine();
        	}else if(b == 5) {
        		System.out.println("Enter the CGPA you want to modify for student id: "+num);
        		sd.setCgpa(n.nextFloat());
        		n.nextLine();

        	}else {
        		System.out.println("You entered a wrong number continue again");
        		continue;
        		
        	}
        	System.out.println("Do you want to change the details again?\n1-yes\n2-no");
  
        	s.merge(sd);
        	tnx.commit();
          	if(n.nextInt() == 2) {
        		break;
        	}
          	n.nextLine();
        	}
        }else if(a == 4) { // delete
        	
        	while(true) {
        	Transaction tnx = s.beginTransaction();
        	System.out.println("Which id number data you want to delete?");
        	int deldata = n.nextInt();
        	Student sd = s.find(Student.class, deldata);
        	
        	s.remove(sd);
        	System.out.println("Data deleted succesfully");
        	tnx.commit();
        	System.out.println("do you want to delete another account??\n1-yes\n2-no");
        	int c = n.nextInt();
        	n.nextLine();
        	if(c == 2) {
        		break;
        	}
        	
        	}
        }else {
        	System.out.println("the number you entered is wrong please re-run the program to execute the task you want");
        }
        
    }
        System.out.println("Thank you for your operation.");
        
        n.close();
        s.close();
        sf.close();
    }
}