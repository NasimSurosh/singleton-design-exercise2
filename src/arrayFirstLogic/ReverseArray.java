package arrayFirstLogic;

public class ReverseArray {
  public static void reverse(int[] array) {
    int start = 0;
    int end = array.length-1;
    
    while(start < end) {
      int rever = array[start];
      array[start] = array[end];
      array[end] = rever;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    
    int[] number = {4,7,2,1,9,45};
    
    for(int num : number) {
      System.out.print(num+" ");
      
    }
    System.out.println();
    reverse(number);
    for(int num : number) {
      System.out.print(num+" ");
    }

  }

}
