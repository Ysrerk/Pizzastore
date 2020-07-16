import java.util.Scanner;

public class Training15072020session2 {


    public  static  void main(String[] args){
        double totalprice=0.0;

        Scanner oku=new Scanner(System.in);
        System.out.println("Welcome to our pizza store");
        System.out.println("please enter your email adress if you have student email we will do %5 discount for you");
        String email=oku.nextLine();

        System.out.println("what size of pizza small:7.5$  medium 8.5$ large 9.5$");
        String size=oku.next();
        System.out.println("what type  of pizza  you want cheese +2.0$ or pepperoni +5$");
        String type=oku.next();
        System.out.println("which topping  you want  you can only have one  onion +1.75$ ,mushroom +2$ ,pineaaple +3.75$ ,chicken +4.75$");
        String topping=oku.next();

        totalprice+=priceofsize(size);
        totalprice+=priceofchoice(type);
        totalprice+=priceoftopping(topping);

        if (email.endsWith(".edu")){
            totalprice*=0.95;
        }

        System.out.println("Your receipt here.Total price is :"+totalprice);




    }

    static  double priceofsize(String size){
        if(size.equalsIgnoreCase("small")){
            return 7.5;
        }
        else if (size.equalsIgnoreCase("medium")){
            return 8.5;
        }
        else if (size.equalsIgnoreCase("large")){
            return 9.5;
        }
        else{
            return -1.0;
        }

    }

    static double priceofchoice(String type){

        if(type.equalsIgnoreCase("cheese")){
            return 2.0;
        }
        else if (type.equalsIgnoreCase("pepperoni")){
            return 5.0;
        }
        else {
            return 0.0;
        }

    }

    static double priceoftopping(String topping){

        if(topping.toLowerCase().equals("onion")){
            return 1.75;
        }
        else if(topping.toLowerCase().equals("mushroom")){
            return  2.00;


        }
        else if (topping.toLowerCase().equals("pineaaple")){
            return 3.75;

        }
        else if(topping.toLowerCase().equals("chicken")){
            return 4.75;
        }
        else{
            return 0.0;
        }
    }

}
