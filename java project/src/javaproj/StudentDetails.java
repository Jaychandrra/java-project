package javaproj;

public class StudentDetails {
	   String name;
       int rollno;
       char Section;
       String branch;
       String state;
       String district;
       String colony;
       int Roadno;
       Double aggregate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        StudentDetails stud1=new StudentDetails();
        stud1.initStudentDetails("Jayachandrra",256,'A',"CSE","Telangana","Nizamabad","Sitaram",8,83.554);
        stud1.display();
        StudentDetails stud2=new StudentDetails();
        stud2.initStudentDetails("Mithraprajwal",257,'A',"CSE","Telangana","hyderabad","subash nagar",13,63.54);
        stud2.display();
	}
      void initStudentDetails(String name_temp,int rollno_temp, char Section_temp,String branch_temp,String state_temp,String district_temp,String colony_temp,int Roadno_temp,Double aggregate_temp)
      {
    	          name=name_temp;
    	    	  rollno=rollno_temp;
    	    	  branch=branch_temp;
    	    	  state=state_temp;
    	    	  district=district_temp;
    	    	  colony=colony_temp;
    	    	  Roadno=Roadno_temp;
    	    	  aggregate=aggregate_temp;
    	    			
      }
      void display()
      {
    	  System.out.println("Student name is " +name);
  		System.out.println("Student rolno is " +rollno);
  		System.out.println("Student branch is " +branch);
  		System.out.println("Student state is " +state); 
       System.out.println("Student district is " +district);
       System.out.println("Student colony is "+colony);
      System.out.println("Student roadno is " +Roadno);
       System.out.println("Student aggregate is " + aggregate);  
      }
      
}
