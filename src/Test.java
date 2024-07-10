import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào nội dung: ");
        String inputString = scanner.nextLine();
        System.out.print("Nhập vào 1 ký tự: ");
        char inputCharacter = scanner.next().charAt(0);
        int count = countCharacter(inputString, inputCharacter);
        System.out.println("Ký tự '" + inputCharacter + "' xuất hiện " + count + " lần");
    }
    public static int countCharacter(String str, char character){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count++;
            }
        }
        return count;
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size;
//        int[] array;
//        System.out.print("Input size: ");
//        do {
//            size = scanner.nextInt();
//            if (size < 1){
//                System.out.print("Input size again: ");
//            }
//        }while (size < 1);
//        array = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Input element " + (i + 1) + " : ");
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("Array created: " + Arrays.toString(array));
//        //Sắp xếp mảng
////        Arrays.sort(array);
////        System.out.println("After array sort: " + Arrays.toString(array));
//        //Đảo ngược mảng
//        for (int i = 0, j = array.length - 1 ; i < j; i++, j--) {
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//        }
//        System.out.println("After array reversed: " + Arrays.toString(array));
//    }
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    Random rd = new Random();
//    int size;
//    int[] array;
//    System.out.print("Input size: ");
//    do {
//        size = scanner.nextInt();
//        if (size < 1){
//            System.out.print("Input size again: ");
//        }
//    }while (size < 1);
//    array = new int[size];
//
//    for (int i = 0; i < size; i++) {
//        int random = rd.nextInt(7);
//        array[i] = random;
//    }
//    System.out.println("Array: " + Arrays.toString(array));
//    int tatol = 0;
//    for (int ele : array){
//        tatol += ele;
//    }
//    System.out.println("Tatol: " + tatol);
//}
}
