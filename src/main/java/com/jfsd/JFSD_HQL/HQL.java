package com.jfsd.JFSD_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;




public class HQL {
	
	public static void main(String[] args) {
		Configuration cg = new Configuration();
		cg.configure();
		SessionFactory sf = cg.buildSessionFactory();
		Session s = sf.openSession();
		
//		1. HQL query to display all student records with all columns
		
//		Query q = s.createQuery("from Student");
//		List<Student> lis = q.list();
//		System.out.println("hello world\n\n");
//		int count = 1;
//		for(Student std: lis) {
//			System.out.println("Data of the "+count+" member :");
//			System.out.println(std);
//			count += 1;
//			System.out.println("\n\n\n");
//		}
//		
		
//		2. HQL query to display all student records with specific columns
		
//		Query q1 = s.createQuery("Select sname, cgpa from Student");
//		List<Object[]> std = q1.list();
//		for(Object[] x : std) {
//			System.out.println(x[0]+" - "+x[1]);
//		}
//		
		
//		3. HQL query to display only names of all students whose CGPA is greater than 7.
		
		
//		Query q2 = s.createQuery("select sname,cgpa from Student where cgpa > 9.2");
//		List<Object[]> cgp = q2.list();
//		System.out.println("these are the poeple with 9.2 plus cgpa:\n");
//		for(Object[] c : cgp) {
//			System.out.println(c[0]+" - "+c[1]);
//		}
//		
		
		
//		4.HQL query to delete a Student whose Student ID is 30101 using input parameter (?) as
//		well as named parameter (:) 
		
		
//		Transaction tnx = s.beginTransaction();
//		Query q3 = s.createQuery("DELETE from Student where sid = :id");
//		q3.setParameter("id",39096);
//		int result = q3.executeUpdate();
//		System.out.println(result);
//		tnx.commit();
//		
		
//		5. HQL query to update few details of a student whose Student ID is 30102 using input
//		parameter (?) as well as named parameter (:)\
		
//		Transaction tnx = s.beginTransaction();
//		Query q4 = s.createQuery("update Student set sname = ?1 where sid = ?2");
//		q4.setParameter(1,"navya");
//		q4.setParameter(2,39100);
//		int result = q4.executeUpdate();
//		System.out.println(result);
//		tnx.commit();
//		
		
//		6. HQL query to perform aggregate functions like count (*), sum(), avg(), min(), max()
//		functions on CGPA column.
//		Query couq = s.createQuery("select count(*) from Student");
//		Object coures = couq.uniqueResult();
//		System.out.print("count : ");
//		System.out.println(coures);
//		
//		Query sumq = s.createQuery("select sum(cgpa) from Student");
//		Object sumres = sumq.uniqueResult();
//		System.out.print("sum : ");
//		System.out.println(sumres);
//		
//		Query avgq = s.createQuery("select avg(cgpa) from Student");
//		Object avgres = avgq.uniqueResult();
//		System.out.print("avg : ");
//		System.out.println(avgres);
//		
//		Query minq = s.createQuery("select min(cgpa) from Student");
//		Object minres = minq.uniqueResult();
//		System.out.print("min : ");
//		System.out.println(minres);
//		
//		Query maxq = s.createQuery("select max(cgpa) from Student");
//		Object maxres = maxq.uniqueResult();
//		System.out.println("max : "+maxres);

		
		
//		7. HCQL query to display specific columns from set of student records.
//		Query q7 = s.createQuery("select sid,sname from Student");
//		List<Object[]> lis = q7.list();
//		for(Object[] obj : lis) {
//			System.out.println(obj[0]+","+obj[1]);
//		}

		
//		8. HCQL query to get 5th to 10th records.
//		Query q8 = s.createQuery("from tudent");
//		q8.setFirstResult(1);
//		q8.setMaxResults(2);
//		List<Student> lis = q8.list();
//		for(Student obj : lis) {
//			System.out.println(obj.toString());
//		}
		
//		9. HCQL query to apply greater than, less than, greater than equal to, less than equal to, equal
//		to and not equal to on CGPA column
//		
		
//		Query greq9 = s.createQuery(" from Student where cgpa > 9.5");
//		Query lesq9 = s.createQuery("from Student where cgpa < 9.5");
//		Query eqeq9 = s.createQuery("from Student where cgpa = 9.5");
//		List<Student> grelis = greq9.list();
//		List<Student> leslis = lesq9.list();
//		List<Student> eqelis = eqeq9.list();
//		System.out.println("\n\nGreater than 9.5:\n");
//		for(Student obj : grelis) {
//			System.out.println(obj.getSname());
//		}
//		System.out.println("\n\nlesser than 9.5:\n");
//		for(Student obj : leslis) {
//			System.out.println(obj.getSname());
//		}
//		System.out.println("\n\nEqual to 9.5:\n");
//		for(Student obj : eqelis) {
//			System.out.println(obj.getSname());
//		}
		
//		10. HCQL query to get the records in ascending as well as descending order based on Student
//		Name
		
//		Query q10 = s.createQuery("from Student order by sname asc");
//		List<Student> lis = q10.list();
//		System.out.println("Students names in ascending order:\n");
//		for(Student std : lis) {
//			System.out.println(std.getSname());
//		}
//		Query q11 = s.createQuery("from Student order by sname desc");
//		List<Student> lis1 = q11.list();
//		System.out.println("\n\nStudents names in descending order:\n");
//		for(Student std1 : lis1) {
//			System.out.println(std1.getSname());
//		}
//		
		
		
		//hcql
		
//		CriteriaBuilder cb = s.getCriteriaBuilder();
//		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
//		Root<Student> root = cq.from(Student.class);
//		cq.select(root);
//		
//		Query q = s.createQuery(cq);
//		List<Student> lis = q.list();
//		for(Student k:lis) {
//			System.out.println(k);
//		}
		
		//hcql2
		
//		CriteriaBuilder cb = s.getCriteriaBuilder();
//		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
//		Root<Student> root = cq.from(Student.class);
//
//		// Explicitly cast the attribute type to Integer
//		Path<Integer> sidPath = root.get("sid");
//		cq.select(root).where(cb.between(sidPath, 30630, 39110));
//
//		Query q = s.createQuery(cq);
//		List<Student> lis = q.list();
//		for (Student k : lis) {
//		    System.out.println(k);
//		}
		
		//hcql3
		
		CriteriaBuilder cb = s.getCriteriaBuilder();
		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		Root<Student> root = cq.from(Student.class);
//        Path<Float> cgpaPath = root.get("cgpa");
//        cq.select(root).where(cb.gt(cgpaPath, 9.0f));
		cq.orderBy(cb.desc(root.get("sname")));

		Query q = s.createQuery(cq);
		List<Student> lis = q.list();
		for (Student k : lis) {
		    System.out.println(k);
		}


		
		
		s.close();
	}
}
