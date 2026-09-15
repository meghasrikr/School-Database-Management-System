package student;

public class StudentMarks {

    private int studentId;
    private int tamil;
    private int english;
    private int maths;
    private int physics;
    private int chemistry;
    private int total_marks;
    private double average_mark;

    public StudentMarks(int studentId, int tamil, int english, int maths, int physics, int chemistry) {

        this.studentId = studentId;
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;

        this.total_marks = tamil + english + maths + physics + chemistry;
    }
	
	public int getstudentId(){
	 return studentId;
	}
	
	public void setstudentId(int studentId){
	 this.studentId = studentId;
	}
	
	public int gettamil(){
	 return tamil;
	}
	
	public void settamil(int tamil){
	 this.tamil = tamil;
	}
	
	public int getenglish(){
	 return english;
	}
	
	public void setenglish(int english){
	 this.english = english;
	}
	
	public int getmaths(){
	 return maths;
	}
	
	public void setmaths(int maths){
	 this.maths = maths;
	}
	
	public int getphysics(){
	 return physics;
	}
	
	public void setphysics(int physics){
	 this.physics = physics;
	}
	
	public int getchemistry(){
	 return chemistry;
	}
	
	public void setchemistry(int chemistry){
	 this.chemistry = chemistry;
	}
	
	public int gettotal_marks(){
	 return total_marks;
	}
	
	public void settotal_marks(int total_marks){
	 this.total_marks = total_marks;
	}
	
	public double getaverage_mark(){
	 return average_mark;
	}
	
	public void setaverage_mark(double average_mark){
	 this.average_mark = average_mark;
	}

    public double average() {

        average_mark = total_marks / 5.0;
        return average_mark;
    }

    public void total() {

        System.out.println("Total marks : " + total_marks);
    }

    public void displayMarks() {

        System.out.println("Tamil mark : " + tamil);
        System.out.println("English mark : " + english);
        System.out.println("Maths mark : " + maths);
        System.out.println("Physics mark : " + physics);
        System.out.println("Chemistry mark : " + chemistry);
        System.out.println("Total marks : " + total_marks);
        System.out.println("Average mark : " + average());
    }
}
