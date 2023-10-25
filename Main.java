import syntaxtree.*;
import visitor.*;
import java.util.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new Javagrammer(System.in).Goal();
         System.out.println("Program Parsed Successfully");
         root.accept(new GJNoArguDepthFirst()); // Your assignment part is invoked here.
   } catch (ParseException e) {
      System.out.println(e.toString());
   }
}
}
