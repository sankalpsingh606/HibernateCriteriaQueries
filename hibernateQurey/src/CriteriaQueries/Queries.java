package CriteriaQueries;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.sankalpsingh.hibernate.MyConnection;

import Model.Empolyee;

public class Queries {
	public static void main(String[] args) {
Session s=MyConnection.getSessionFactory().openSession();
/*Empolyee e= new Empolyee();
//e.setE_id(Integer.parseInt("5"));;
e.setE_name("jeff");
e.setE_salary(Float.parseFloat("112000.0"));
e.setE_age(Integer.parseInt("27"));
e.setE_gender("Male");
e.setE_department("operation");
s.beginTransaction();
//s.delete(e);
s.save(e);
s.getTransaction().commit();
s.close();
*/

/*Criteria cr = s.createCriteria(Empolyee.class); 
List employees = cr.list(); 
for (Iterator iterator = employees.iterator(); iterator.hasNext();)
{ Empolyee employee = (Empolyee) iterator.next();
System.out.println(employee.toString());}
}*/  
Criteria cr = s.createCriteria(Empolyee.class);
cr.add(Restrictions.eq("e_salary", (float)95000)); 
//cr.add(Restrictions.gt("e_salary", (float)95000));
//cr.add(Restrictions.lt("e_salary", (float)95000));
//cr.add(Restrictions.like("e_department","%Analytics%" );
//cr.add(Restrictions.between("e_salary", (float)73000, (float)95000));
//cr.addOrder(Order.asc("e_salary")); 
//cr.addOrder(Order.desc("e_salary"));
List employees = cr.list(); 
for (Iterator iterator = employees.iterator(); iterator.hasNext();)
{ Empolyee employee = (Empolyee) iterator.next();
System.out.println(employee.toString());}
}


/*Criteria cr = s.createCriteria(Empolyee.class);
/*cr.setProjection(Projections.rowCount()); 
List rowCount = cr.list(); 
System.out.println("Total Coint: " + rowCount.get(0) ); 
*/
/*cr.setProjection(Projections.avg("e_salary"));
List employees = cr.list(); 
System.out.println("Average Salary: " + employees.get(0) );
*/


//cr.setProjection(Projections.max("e_salary"));
//List employee1 = cr.list(); 
//System.out.println("Max Salary: " + employee1.get(0) );
//
//cr.setProjection(Projections.min("e_salary"));
//List employee2 = cr.list(); 
//System.out.println("MIn Salary: " + employee2.get(0) );
//
//cr.setProjection(Projections.sum("e_salary"));
//List employee3 = cr.list(); 
//System.out.println("Sum Of Salary: " + employee3.get(0) );



}         

