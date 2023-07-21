import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if (array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println(max-min);
    }
}