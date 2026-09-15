package teacher;

import java.util.*;

public class Teacher {

    private String name;
    private int id;
    private int age;
    private ArrayList<String> subject;
    private int experience;
    private String city;

    public Teacher(String name, int id, int age, ArrayList<String> subject, int experience, String city) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.subject= subject;
        this.experience = experience;
        this.city = city;
    }
	
	public String getname(){
	 return name;
	}
	
	public void setname(String name){
	 this.name = name;
	}
	
	public int getid(){
	 return id;
	}
	
	public void setid(int id){
	 this.id = id;
	}
	
	public int getage(){
	 return age;
	}
	
	public void setage(int age){
	 this.age = age;
	}
	
	public ArrayList<String> getsubject(){
	 return subject;
	}
	
	public void setsubject(ArrayList<String> subject){
	 this.subject = subject;
	}
	
	public int getexperience(){
	 return experience;
	}
	
	public void setexperience(int experience){
	 this.experience = experience;
	}
	
	public String getcity(){
	 return city;
	}
	
	public void setcity(String city){
	 this.city = city;
	}

    public void display() {

        System.out.println("Teacher name : " + name);
        System.out.println("Teacher id : " + id);
        System.out.println("Teacher age : " + age);
        System.out.println("Teacher subject : " + subject);
        System.out.println("Teacher experience : " + experience + " years");
        System.out.println("Teacher city : " + city);
    }
}
