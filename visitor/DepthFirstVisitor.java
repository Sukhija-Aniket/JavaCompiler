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
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Statement() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> PackageDeclaration()
    *       | StaticImportStatement()
    *       | ImportStatement()
    *       | OtherStatement()
    */
   public void visit(Statement n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "package"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(PackageDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> "import"
    * f1 -> "static"
    * f2 -> DotIdentifier()
    * f3 -> ";"
    */
   public void visit(StaticImportStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "import"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(ImportStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( RemainingIdentifier() )*
    */
   public void visit(DotIdentifier n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "."
    * f1 -> ( Identifier() | Asterisk() )
    */
   public void visit(RemainingIdentifier n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <MULT>
    */
   public void visit(Asterisk n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <LPAREN>
    *       | <RPAREN>
    *       | <LSQPAREN>
    *       | <RSQPAREN>
    *       | <LBRACE>
    *       | <RBRACE>
    *       | <AT>
    *       | <QUOTE>
    *       | <SEMICOLON>
    *       | <DOT>
    *       | <COMMA>
    *       | <ASSIGN>
    *       | <GREATER>
    *       | <GE>
    *       | <LESS>
    *       | <LE>
    *       | <NE>
    *       | <PLUS>
    *       | <FLOAT>
    *       | <MINUS>
    *       | <MULT>
    *       | <DIV>
    *       | <AND>
    *       | <OR>
    *       | <PIPE>
    *       | <BIT_AND>
    *       | <NOT>
    *       | <BOOLEAN>
    *       | <CLASS>
    *       | <INTERFACE>
    *       | <ELSE>
    *       | <EXTENDS>
    *       | <FALSE>
    *       | <IF>
    *       | <WHILE>
    *       | <INTEGER>
    *       | <MAIN>
    *       | <NEW>
    *       | <PUBLIC>
    *       | <RETURN>
    *       | <STATIC>
    *       | <STRING>
    *       | <THIS>
    *       | <TRUE>
    *       | <PRINT>
    *       | <VOID>
    *       | <OBJECT>
    *       | <INTEGER_LITERAL>
    *       | <FLOAT_LITERAL>
    *       | <STRING_LITERAL>
    *       | <IDENTIFIER>
    */
   public void visit(OtherStatement n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n) {
      n.f0.accept(this);
   }

}
