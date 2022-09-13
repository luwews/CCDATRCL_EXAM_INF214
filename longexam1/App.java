import java.util.Stack;
import java.util.LinkedList;

public class App {

        public static void main(String[] args) throws Exception {
                
    // ARRAYS (50 points)
    System.out.println("======================================================");
    // 1. Create an array of characters of your ssurname.
  // 2. Display each character of your ssurname on each line.
       char[] surname = {'V','E','R','Z','O','S','A'};
        for (int i= 0;i<surname.length;i++){
        System.out.println(surname[i]);
       }
    // 3. Display the first character of your ssurname.
     System.out.println("first:"+surname[0]);
      
       // 4. Display the last character of your ssurname.
       System.out.println("last:"+surname[5]);

    // 5. Display the character of your ssurname in reverse order.
       for (int i=surname.length-1;i >= 0;i--){
        System.out.println(surname[i]);
       } 
       // LINKED LIST (25 points)
    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> StudentNumber=new LinkedList<>();
        StudentNumber.add("1");
        StudentNumber.add("0");
        StudentNumber.add("5");
        StudentNumber.add("5");
        StudentNumber.add("3");
        StudentNumber.add("2");

    // 2. Add an asterisk (*) to the head/front of the Linked list.
 StudentNumber.addFirst("*");

    // 3. Add an asterisk (*) to the tail/end of the Linked list.
    StudentNumber.addLast("*");

    // 4. Display the Linked list.
System.out.println(StudentNumber);

    // 5. Display the last character of the Linked list.
  System.out.println(StudentNumber.get(6));

    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
 StudentNumber.set(6,"!");

    // 7. Remove the first character of the Linked list.
StudentNumber.remove(0);
    // 8. Display the LinkedList.
System.out.println(StudentNumber);


    // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your surname.
    Stack<String> ssurname = new Stack<>();
ssurname.push("V");
ssurname.push("E");
ssurname.push("R");
ssurname.push("Z");
ssurname.push("O");
ssurname.push("S");
ssurname.push("A");
    // 2. Print the Stack.
System.out.println(ssurname);

    // 3. Add a "INF214" to the stack.
ssurname.push("INF214");

    // 4. Print the Stack.
System.out.println(ssurname);
    // 5. Remove "INF214".
ssurname.pop();

    // 6. Add "CCDATRCL-INF214".
ssurname.push("CCDATRCL-INF214");

    // 7. Print the Stack.
System.out.println(ssurname);   
}
}
