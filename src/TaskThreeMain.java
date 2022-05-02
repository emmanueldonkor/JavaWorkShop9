 class TaskThreeMain {
    public static void main(String[] args){
        //Exception catching
        //Creating account object with parameters
        Account ac1 = new Account("Emmanuel",300,22324);
        Account ac2 = new Account("Donkor",400,244432);
        try{
            // Printing the user data
            System.out.println( ac1.methodPrint());
            //Calling the method transfer
            ac1.methodTransferEmman(300);
        }
        catch (NotEnoughMoneyException ex){
            System.out.println(ex.getMessage());
        }
        finally{
           System.out.println( "The Current Balance left is " + ac1.balance);
        }
    }

}
