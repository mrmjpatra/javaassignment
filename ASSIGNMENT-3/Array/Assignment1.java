package Array;
/*Write a program to find average and also find total no. of odd, even, prime and palindrome number available in an array of 30 user defined numbers? */

public class Assignment1 {
    public static void main(String[] args) {

        int codd=0,ceven=0,cprime=0,cpalin=0;
        //User definder array of 30 numbers
        int []arr=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            int rem=0,rev=0;
            int og=arr[i];
            if (arr[i]%2==0) {
                ceven++;
            }else{
                codd++;
            }

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i]%j==0) {
                    count++;
                }
            }
            if(count==2){
                cprime++;
            }
            while(og>0){
                rem=og%10;
                rev=rev*10+rem;
                og=og/10;
            }
            if (arr[i]==rev) {
                cpalin++;
            }
        }

        System.out.println("The even digit are "+ceven);
        System.out.println("The odd digit are "+codd);
        System.out.println("The prime digit are "+cprime);
        System.out.println("The palindrome digit are "+cpalin);

        

    }
}
