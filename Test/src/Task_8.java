public class Task_8 {
    public static void main(String[] args){
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < myArr.length; ++i){
            if (i == 0){
                System.out.print(" ");
                for (int j : myArr){
                    System.out.print(" "+j+" ");
                }
                System.out.print("\n");
            }else{
                System.out.print(i);
                for (int j : myArr){
                    System.out.print(" "+i*j+" ");
                }
                System.out.print("\n");
            }
        }
    }
}
