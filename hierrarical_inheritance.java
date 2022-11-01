package INHERITANCE;
//HIERARICAL INHERITANCE 
//TWO CHILD DEPENDS ON PARENT SO THAT PARENT CLASS CREATED,SON1 CLASS CREATED ,SON2 CLASS CREATED
// SON1 EXTEDS PARENT AND SON2 EXTENDS PARENT,THERE IS NO ANY EXTENSSION BETWEEN SON1 & SON2
class parentt{  // CLASS PARENT IS CREATED
	
	String fathername;   //INSTANCE VARIABLE fathername  DECLARED WITH DATATYPE
	public void insertinfo (String a) { //METHOD IS CREATED
		fathername=a;                   //VARIABLE IS ASIGNED WITH A
	                                  }

            void display(){     // METHOD IS CREATED TO DISPLAY PARENT DATA
		System.out.println("my father name is  "+fathername);
	                      }
             }
 

  
class son1 extends parentt    {   // CLASS SON1 IS CREATED
	  
     String son1name;                       //  VARIABLE IS DECLERD
	 public void insertinfos1 (String b) {  // METHOD IS CREATED
	 son1name=b;                            // THE VARIABLE IS ASIGNED WITH B
		                                 }
          void displays1(){            // METHOD display1 IS CREATED TO DISPLAY SON1 INFO
		    System.out.println("my name is  "+son1name);
	                      }
                              }
	
	

class son2 extends parentt{   // CLASS SON2 IS CREATED
	
     String son2name;         // VARIABLE IS DECLERED WITH DATA TYPE
	 public void insertinfos2 (String c) { //METHOD IS CREATED
	 son2name=c;
		                                 }
	    void displays2(){
		 System.out.println("my name is  "+son2name);
	                    }
	
                            }
public class hierrarical_inheritance {
	public static void main(String[] args) {

		son1 c1= new son1();                        // FOR SON1 OBJ C1 IS CREATED TO CALL METHODS
       System.out.println("first child info");
      
        c1.insertinfo("rajan");           // CALLING insertinfo FROM CLASS parent WITH C1 AND 
                                           //VALUES IS ADDEED AND ARGUMENTS IS PASSED
        c1.display();  //CALLING DISPLAY METHOD FROM CLASS PARENT
        c1.insertinfos1("pandiyarajan"); // CALLING insertinfo1 FROM CLASS SON1 WITH C1 AND 
                                         //VALUES IS ADDEED AND ARGUMENTS IS PASSED
        c1.displays1();  //CALLING DISPLAY1 METHOD FROM CLASS SON1
	
        son2 c2= new son2();                  // FOR SON2 OBJ C2 IS CREATED TO CALL METHODS
         System.out.println();
        System.out.println("second child info");
       
        c2.insertinfo("rajan");         // CALLING insertinfo FROM CLASS parent WITH C2 AND
                             //VALUES IS ADDEED AND ARGUMENTS IS PASSED
        c2.display();//CALLING DISPLAY METHOD FROM CLASS PARENT
        c2.insertinfos2("Mathirajan");
        c2.displays2();
	}
	}
           

