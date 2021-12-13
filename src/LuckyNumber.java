import java.util.Locale;
import java.util.Scanner;
public class LuckyNumber {
    public static final int max=100;
    public static final int min = 0;
    public static void main(String[] args)
    {
        int a=0;
        int best_guess=max;
        int total_games=0;
        int total_guess=0;
        Scanner sc = new Scanner(System.in);
        String c;
        do {
            //Tinh toan so lan da choi + lan choi tot nhat + so lan da chon
            total_games++;
            a=play(sc);
            total_guess+=a;
            if(best_guess>a)
            {
                best_guess=a;
            }
            //Nhap chuoi input tu nguoi choi
            System.out.print("Do you want to play again? ");
            c= sc.next();
        }while(c. equalsIgnoreCase("y")||c. equalsIgnoreCase("yes"));
        //Vong lap se dung lai khi chuoi input == "yes" khong phan biet viet hoa hay thuong
        report(total_games,total_guess,best_guess);
    }
    //Thuc hien tro choi
    public static int play(Scanner sc)
    {
        int guess=0;
        //Chon ngau nhien 1 so khoang [min,max] luu vao bien x
        int x=(int)((Math.random()) * ((max - min) + 1) + min);
        System.out.println("I'm thinking of a number between 0 and 100...");
        //Vong lap de nhan input vao bien guess tu nguoi choi
        for(int i = 1;;i++) {
            System.out.print("Your guess? ");
            guess = sc.nextInt();
            //Neu guess = x -> thong bao chien thang -> return so luot guess
            if (guess == x) {
                System.out.println("You got it right in "+i+" guesses!");
                return i;
            }
            //Neu x > guess thong bao x lon hon
            else if(x>guess)
            {
                System.out.println("It's higher");
            }
            //Neu x < guess thong bao x nho hon
            else if(x<guess)
            {
                System.out.println("It's lower");
            }
        }

    }
    //Hien thi nhung thong bao ra man hinh
    public static void report(int total_game,int total_guess,int best_guess)
    {
        System.out.println("Overall results:");
        System.out.println("Total games = "+ total_game);
        System.out.println("Total guesses = "+total_guess);
        System.out.println("Guesses/game = "+ (double)total_guess/total_game);
        System.out.println("Best game = "+ best_guess);
    }
}
