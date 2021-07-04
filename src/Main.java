public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(23226));
    }
    public static boolean isPalindrome (int number){
        int sum = 0; // for reverse the number
        number = Math.abs(number);
        int temp = number;
        int remain = 0;
        while(temp > 0){
            remain = temp % 10;
            sum = (sum * 10) + remain;
            temp /= 10;
        }
        return number == sum;

    }
}

