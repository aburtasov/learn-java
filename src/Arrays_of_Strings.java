public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]); // 0 значение по умолчанию для int 

        String[] strings = new String[3]; // массив из 3 объектов класса String
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "Java";

        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println("====================");

        for(int i = 0; i < strings.length; i ++) {
            System.out.println(strings[i]);
        }

        System.out.println("====================");

        for(String str:strings) {
           System.out.println(str);
        }

        System.out.println("====================");

        int[]nums1 = {1,2,3,4};
        int sum = 0;

        for(int x:nums1) {
            
            sum = sum + x;
            
        }

        System.out.println(sum);

        System.out.println("====================");

        //int value = 10;
         String s; //память под ссылку == nul в данной ситуации
         s = null;
        System.out.println(s);

        
    }
}
