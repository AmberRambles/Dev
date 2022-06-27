package largerJavaTest;

public class Example {
    String testString = "This is a default message from Example";



    public void showMessage(){
        System.out.println(testString);
    }


    public Example(){
        //this is the constructor method for this object
    }

    public Example(String input){
        testString = input;
    }
}
