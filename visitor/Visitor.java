//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Statement() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n);

   /**
    * f0 -> PackageDeclaration()
    *       | ImportStatement()
    *       | OtherStatement()
    */
   public void visit(Statement n);

   /**
    * f0 -> "package"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(PackageDeclaration n);

   /**
    * f0 -> "import"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(ImportStatement n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( RemainingIdentifier() )*
    */
   public void visit(DotIdentifier n);

   /**
    * f0 -> "."
    * f1 -> ( Identifier() | Asterisk() )
    */
   public void visit(RemainingIdentifier n);

   /**
    * f0 -> <MULT>
    */
   public void visit(Asterisk n);

   /**
    * f0 -> "["
    *       | "]"
    *       | "{"
    *       | "}"
    *       | ";"
    *       | "."
    *       | "="
    *       | "<="
    *       | "!="
    *       | "+"
    *       | "float"
    *       | "-"
    *       | "*"
    *       | "/"
    *       | "&&"
    *       | "||"
    *       | "!"
    *       | "boolean"
    *       | "class"
    *       | "interface"
    *       | "else"
    *       | "extends"
    *       | "false"
    *       | "if"
    *       | "while"
    *       | "int"
    *       | "main"
    *       | "new"
    *       | "public"
    *       | "return"
    *       | "static"
    *       | "String"
    *       | "this"
    *       | "true"
    *       | "System.out.println"
    *       | "void"
    *       | "#define"
    *       | <FLOAT_LITERAL>
    *       | <INTEGER_LITERAL>
    *       | <IDENTIFIER>
    *       | <STRING_LITERAL>
    */
   public void visit(OtherStatement n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n);

}
