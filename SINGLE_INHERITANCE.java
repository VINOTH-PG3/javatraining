package INHERITANCE;

//SINGLE INHERITANCE// here value is given in super/parent class
//child can access parent but parent can't access child
 class parent{
	String name="pandiyan";
	String c_name="ADHVIK";   // VALUES ASSIGNED DIRECTLY IN SUPR CLASS
	String religion="hindu";
	String native_p="madurai";
	
	void display(){
		System.out.println("    MY PERSONEL INFO");
		System.out.println("my name is "+ c_name  );
		
	}
}


class son extends parent{
	String pet_name="advik kutty";
	 
	void dislpay1(){
		System.out.println("my father name is  "+name);
		System.out.println( "my religion is  "+religion ); // VALUES TAKEN FROM SUPER/PARENT CLASS
		System.out.println("my native is  "+native_p );
	}
}


public class SINGLE_INHERITANCE {
public static void main(String[] args) {
	//creating object for child
	son son1= new son();   // son1 object is created
	son1.display();       //USING OBJ  son1 ACCESING SUPER/PARENT CLASS
	son1.dislpay1();      //USING OBJ  son1 ACCESING sub class/sub CLASS//values taken from parent by using Extends term 
System.out.println(son1.name);
parent father=new parent();      // father obj is created 
//System.out.println(father.pet_name);  // father cant access child info


}

}
