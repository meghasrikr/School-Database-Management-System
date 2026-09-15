package student;

public class Student {

    private String name;
    private int id;
    private int age;
    private String blood_group;
    private int batch;
    private int standard;
	private String parent_name;
	private String parent_phoneno;
    private String city;

    public Student(String name, int id, int age, String blood_group, int batch, int standard, String parent_name, String parent_phoneno, String city) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.blood_group = blood_group;
        this.batch = batch;
        this.standard = standard;
		this.parent_name = parent_name;
		this.parent_phoneno = parent_phoneno;
        this.city = city;
    }
	
	public String getName(){
	 return name;
	}
	
	public void setName(String name){
	 this.name = name;
	}
	
	public int getId(){
	 return id;
	}
	
	public void setId(int id){
	 this.id = id;
	}
	
	public int getAge(){
	 return age;
	}
	
	public void setAge(int age){
	 this.age = age;
	}
	
	public String getBlood_group(){
	 return blood_group;
	}
	
	public void setBlood_group(String blood_group){
	 this.blood_group = blood_group;
	}
	
	public int getBatch(){
	 return batch;
	}
	
	public void setBatch(int batch){
	 this.batch = batch;
	}
	
	public int getStandard(){
	 return standard;
	}
	
	public void setStandard(int standard){
	 this.standard = standard;
	}
	
	public String getparent_name(){
	 return parent_name;
	}
	
	public void setparent_name(String parent_name){
	 this.parent_name = parent_name;
	}
	
	public String parent_phoneno(){
	 return parent_phoneno;
	}
	
	public void setparent_phoneno(String parent_phoneno){
	 this.parent_phoneno = parent_phoneno;
	}
	
	public String getCity(){
	 return city;
	}
	
	public void setCity(String city){
	 this.city = city;
	}

    public void display() {

        System.out.println("Name of the student : " + name);
        System.out.println("Student id : " + id);
        System.out.println("Student age : " + age);
        System.out.println("Student blood group : " + blood_group);
        System.out.println("Student batch : " + batch);
        System.out.println("Student standard : " + standard);
		System.out.println("Student Guardian name : " + parent_name);
		System.out.println("Student Guardian phone_no : " + parent_phoneno);
        System.out.println("Student city : " + city);
    }
}

