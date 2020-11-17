class Student{  
    int id;  
    String name;  
    void set(int i, String n) {  
        id=i;  
        name=n;    
    }  
    void get(){
		System.out.println(id+" "+name+" ");
	}  
}  
public class Constructor{  
public static void main(String[] args) {  
    Student S1=new Student();  
    Student S2=new Student();  
    S1.set(1,"Thor");  
    S2.set(2,"Batman");  
    S1.get();  
    S2.get();  
}  
}
