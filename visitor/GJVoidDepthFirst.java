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
public class GJVoidDepthFirst<A> implements GJVoidVisitor<A> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n, A argu) {
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
   }

   public void visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
         }
      }
   }

   public void visit(NodeOptional n, A argu) {
      if ( n.present() )
         n.node.accept(this,argu);
   }

   public void visit(NodeSequence n, A argu) {
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
   }

   public void visit(NodeToken n, A argu) {}

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Statement() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> PackageDeclaration()
    *       | StaticImportStatement()
    *       | ImportStatement()
    *       | OtherStatement()
    */
   public void visit(Statement n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> "package"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(PackageDeclaration n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> "import"
    * f1 -> "static"
    * f2 -> DotIdentifier()
    * f3 -> ";"
    */
   public void visit(StaticImportStatement n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
   }

   /**
    * f0 -> "import"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(ImportStatement n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( RemainingIdentifier() )*
    */
   public void visit(DotIdentifier n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> "."
    * f1 -> ( Identifier() | Asterisk() )
    */
   public void visit(RemainingIdentifier n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> <MULT>
    */
   public void visit(Asterisk n, A argu) {
      n.f0.accept(this, argu);
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
   public void visit(OtherStatement n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu) {
      n.f0.accept(this, argu);
   }

}
