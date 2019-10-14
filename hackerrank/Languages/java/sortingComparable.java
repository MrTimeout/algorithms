import java.util.*;

class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    public int compareTo(Student s)
    {
        if(s.getCgpa() > this.getCgpa()) return 1;
        else if(s.getCgpa() < this.getCgpa()) return -1;
        if(s.getFname().compareTo(this.getFname()) != 0) 
            return -1*s.getFname().compareTo(this.getFname());
        if(s.getId() > this.getId()) return 1;
        return -1;
    }
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
        Collections.sort(studentList);

      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
