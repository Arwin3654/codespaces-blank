import java.util.Scanner;
public class Age_calc{
    public static void main(String[] args){
        int Actual_Age;

        System.out.println("Calculates your actual age");
        Scanner in;

        in = new Scanner(System.in);
       
        System.out.print("Enter Birth year: ");
        int Birth_year = in.nextInt();
       
        System.out.print("Give your birth month: ");
        int Birth_month = in.nextInt();
       
        System.out.print("Give your day of birth: ");
        int date_OB = in.nextInt();

        System.out.print("Enter which part of day you were born: Give time as in 24hr :");
        int part_day = in.nextInt();

        System.out.print("Enter current year: ");
        int year_Now = in.nextInt();
       
        System.out.print("Give today's date: ");
        int today = in.nextInt();
       
        System.out.print("Give today's month: ");
        int month = in.nextInt();
       
        Actual_Age = Age_calcu(Birth_year , year_Now , Birth_month , date_OB , today , month, part_day);
        System.out.println(Actual_Age);
        in.close();
    }
    public static int Age_calcu(int Birth_year,int year_Now, int Birth_month, int date_OB, int today, int month, int part_day){
        
        int Actual_Age = 0;

        if (month < Birth_month){
            Actual_Age = (year_Now - Birth_year) - 1;
        }
        else if(month == Birth_month){
            if(today < date_OB){
                Actual_Age = (year_Now - Birth_year) - 1;
            }
            else if(today > date_OB){
                Actual_Age = year_Now - Birth_year;
            }
            else{
                System.out.print("Enter time as in 24 hour time: ");
                Scanner time_in = new Scanner(System.in);
                int time = time_in.nextInt();
                if (time < part_day){
                    Actual_Age = (year_Now - Birth_year) - 1;
                }
                else if(time > part_day){
                    Actual_Age = year_Now - Birth_year;
                }
                else{
                    Actual_Age = year_Now - Birth_year;
                    System.out.println("Happy birthday!!!");
                }
            }
        }
        else{
            Actual_Age = year_Now - Birth_year;
        }
        
        return Actual_Age;
        
    }
}
    