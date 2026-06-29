import java.util.Scanner;
class size{
  public static void main(String[] args){
    System.out.print("Enter the size:");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    switch(size){
      case 30:
      System.out.println("size is medium");
      break;
      case 38:
      System.out.println("size is large");
      break;
      case 40:
      System.out.println("size XLarge");
      break;
      default:
      System.out.println("invalid");
      break;
    }
  }
}