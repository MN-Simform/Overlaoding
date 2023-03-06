public class Overload {
    private String constructorName = "Default Constructor";
//    Constructor Overloading
    Overload(){
        System.out.println(constructorName);
    }
    Overload(String s){
        System.out.println(s);
    }

//    Method Overloading
    public int show(int n1, int n2){
        return n1 + n2;
    }
    public int show(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double show(double n1, double n2){
        return n1 + n2;
    }
    public String show(String s1){
        return s1;
    }
    public String show(String s1, String s2){
        return s1 + s2;
    }
}
