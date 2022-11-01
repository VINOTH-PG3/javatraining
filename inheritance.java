package INHERITANCE;
//MULTIPLE INHERITANCE // HERE THE VALUS IS GIVEN IN MAIN CLASS (ARGUEMENT IS PASSED WITH INSERT-(USER DEFINED) TO CLASS AND DISPLAYED
// CHILD CAN ACESS FATHER AND GRAND FATHER
//FATHER CAN ACESS GRAND FATHER
class grand_father{                        // SUPER CLASS
	
     String name;                           // INSTANCE VARIABLE NAME AND AGE DECLARED WITH DATATYPE
     int age;
 public void insertinfo (String a ,int b) {   //1ST METHOD IS CREATED UNDER CLASS grand_father,
	 age=b;     //a and b IS ASIGNED         //insertinfo USER DEFINED TERM IS CREATED TO GET VALUES FROM MAIN CLASS WITH CHILD OBJECT
	 name =a;
	                                         }
       void dislay()  { // 1ST.A METHOD IS CREATED UNDER CLASS grand_father,TO DISPLAY THE grand_father VARIABLE valuES
	   System.out.println("my grandfather name is "+ name);
	                  }
	
                  }
class father extends grand_father{  //2ND CLASS father IS CREATED AND LINK WITH grand_father WITH KEYWORD EXTENDS

	 public void insertinfo (String a) { //2ND METHOD IS CREATED UNDER CLASS father,
		 name=a;                           //insertinfo USER DEFINED TERM IS CREATED TO GET VALUES FROM MAIN CLASS WITH CHILD OBJECT         
	                                   }
         void dislayf(){                   // 2ND.A METHOD IS CREATED UNDER CLASS father,TO DISPLAY THE father VARIABLE valuES FROM GRAND FATHER
		 System.out.println("my father name is "+ name);
	                   }	
                                 }


class child extends father{       //3RD CLASS CHILD  IS CREATED AND LINK WITH grand_father WITH KEYWORD EXTENDS


 void insertinfoch (String a) { //3RD METHOD IS CREATED UNDER CLASS CHILD,
	 name=a;                      //insertinfo USER DEFINED TERM IS CREATED TO GET VALUES FROM MAIN CLASS WITH CHILD OBJECT
		                      }


	void dislaych(){   //3RD.A METHOD IS CREATED UNDER CLASS father,TO DISPLAY THE CHILD VARIABLE valuES FROM GRAND FATHER
		 System.out.println("my  name is "+ name);
		 System.out.println("my gran father age is  "+age);
	 }	
}


public class inheritance {
public static void main(String[] args) {
	
	child ch=new child();   // OBJECT CH IS CREATED FOR CHILD TO CALL AND PASS ARGUEMENTS
	ch.insertinfo("pandian",26);  //CALLING insertinfo IN CLASS WITH CH AND VALUES IS ADDEED AND ARGUMENTS IS PASSED  
	ch.dislay();  // CALLING display  1ST.A METHOD 
    ch.insertinfo("raja");
    ch.dislayf();
    ch.insertinfoch("ADHVIK");
    ch.dislaych();
}
}

	
	