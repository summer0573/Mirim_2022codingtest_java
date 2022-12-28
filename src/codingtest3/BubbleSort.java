package codingtest3;

public class BubbleSort {
    public static void main(String[] args){
        int[] intArray = {89, 45, 67, 92, 39, 74};
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i] + " ");
        }

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        //버블 정렬 코드
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j<intArray.length-i-1; j++){
                //서로 교환
                if(intArray[j] > intArray[i]){
                    int temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

    }
}
