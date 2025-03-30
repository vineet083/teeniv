class vineetException extends Exception{
    public vineetException(String name){
        super(name);
    }
}


public class CustomException {

    public static void main(String[] args) {
        int i = 20;
        int j = 1;
        try{
            j = 18/i;
            if(j==0)
                throw new vineetException("this is the custom excetion");
        }catch (vineetException e){
            System.out.println("Exception caught" +e);
        }

    }

}
