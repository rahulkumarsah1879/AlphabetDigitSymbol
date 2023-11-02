import java.util.Scanner;
class AlphabetDigitSymbol {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scan.next().charAt(0);
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
        {
            if(ch>=65 && ch<=90)
            {
                System.out.println(ch+" is Upper case Alphabet");
            }
            else
            {
                System.out.println(ch+" is lower case Alphabet");
            }
        }
        else if (ch>=48 && ch<=57)
        {
            System.out.println(ch+" is Digit");
        }
        else
        {
            System.out.println(ch+ " is Symbol");
        }

    }
}
