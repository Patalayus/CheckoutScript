import java.util.Scanner;

public class mainclas {
    public static void main(String args[]){
            String responce;
            String responce2;
            String responce3;
            double responce4;
            String responce5;
            char check = 0;

            Scanner thisscan = new Scanner(System.in);
            System.out.println("Hi there, do you want bags?");
            responce = thisscan.nextLine();
            if(responce.equals("yes")){
                System.out.println("Getting bags...");
            }else{
                System.out.println("Don't get bags...");
            }
            System.out.println("Start scanning shop\nTalk to customer\nScanning completed\n Do you have a clubcard?");
            responce2 = thisscan.nextLine();
            if(responce2.equals("yes")){
                System.out.println("Scan clubcard");
            }else{
                System.out.println("Do not scan clubcard");
            }
            System.out.println("Do you need help packing?");
            responce5 = thisscan.nextLine();
            if(responce5.equals("yes")){
                System.out.println("Help packing");
            }else{
                System.out.println("Don't help packing");
            }
            System.out.println("That's X please");
            responce3 = thisscan.nextLine();
            if(responce3.equals("Can I have cashback?"))
            {
                System.out.println("Yeah sure, how much?");
                responce4 = thisscan.nextDouble();
                System.out.println("Press cashback on till");
                if(responce4 >= 50) {
                    System.out.println("That is too much I'm afraid");
                }else{
                    check = 1;
                }
            }
            else if(responce3.equals("Can I put some on my card and some in cash?"))
            {

            }
            else if(responce3.equals(""))
            {

            }
            System.out.println("Have a nice day\nHand them receipt");
        }
}
