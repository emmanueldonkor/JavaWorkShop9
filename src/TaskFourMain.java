public class TaskFourMain {
    public static void main(String[] args){
        try{
            TaskFour tf = new TaskFour();
            System.out.println( tf.exceptionMethod("Man","Woman"));
           throw new NewException1("Error");

        }
        catch(NewException1 ex ){
          ex.getMessage();
        }


    }
}
