package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empolyee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int e_id;
private String e_name;
private float e_salary;
private int e_age;
private String e_gender;
private String e_department;
public int getE_id() {
	return e_id;
}
public void setE_id(int e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public float getE_salary() {
	return e_salary;
}
public void setE_salary(float e_salary) {
	this.e_salary = e_salary;
}
public int getE_age() {
	return e_age;
}
public void setE_age(int e_age) {
	this.e_age = e_age;
}
public String getE_gender() {
	return e_gender;
}
public void setE_gender(String e_gender) {
	this.e_gender = e_gender;
}
public String getE_department() {
	return e_department;
}
public void setE_department(String e_department) {
	this.e_department = e_department;
}
@Override
public String toString() {
	return "Empolyee [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", e_age=" + e_age
			+ ", e_gender=" + e_gender + ", e_department=" + e_department + "]";
}


}
