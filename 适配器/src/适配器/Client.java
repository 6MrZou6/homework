package ÊÊÅäÆ÷;
public class Client {
    public static void main(String[] args) {
        InewJuicer newJuicer = new Adapter();
        System.out.println(newJuicer.newPort("Apple","Banana"));
    }
}