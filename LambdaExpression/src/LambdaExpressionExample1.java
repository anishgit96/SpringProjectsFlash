
/*
 * interface MyName { void showmyname(); }
 * 
 * public class LambdaExpressionExample1 {
 * 
 * public static void main(String[] args) {
 * 
 * MyName name=()->{
 * 
 * System.out.println("Anish"); }; name.showmyname();
 * 
 * } }
 */

/*
 * interface MyName { void showmyname(String str1, String str2); }
 * 
 * public class LambdaExpressionExample1 {
 * 
 * public static void main(String[] args) {
 * 
 * MyName name=(String a,String b)-> { System.out.print(a+b); };
 * 
 * name.showmyname("Anish","Sethiya");
 * 
 * }
 * 
 * 
 * }
 */

/*
 * class LambdaExpressionExample1 {
 * 
 * public static void main(String[] args) {
 * 
 * Runnable runit=()->{
 * 
 * System.out.println("Anish"+" "+"Sethiya");
 * 
 * }; Thread namethread=new Thread(runit); namethread.start(); } }
 */





