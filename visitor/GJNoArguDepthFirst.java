//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class GJNoArguDepthFirst<R> implements GJNoArguVisitor<R> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n) {
      if ( n.present() )
         return n.node.accept(this);
      else
         return null;
   }

   public R visit(NodeSequence n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Statement() )*
    * f1 -> <EOF>
    */
   public R visit(Goal n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> PackageDeclaration()
    *       | ImportStatement()
    *       | OtherStatement()
    */
   public R visit(Statement n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "package"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public R visit(PackageDeclaration n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> "import"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public R visit(ImportStatement n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( RemainingIdentifier() )*
    */
   public R visit(DotIdentifier n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "."
    * f1 -> ( Identifier() | Asterisk() )
    */
   public R visit(RemainingIdentifier n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> <MULT>
    */
   public R visit(Asterisk n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

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
   public R visit(OtherStatement n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

}