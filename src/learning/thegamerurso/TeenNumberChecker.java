package learning.thegamerurso;

//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//Write a method named hasTeen with 3 parameters of type int.
//The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

public class TeenNumberChecker {

    public static boolean hasTeen(int a,int b,int c)
    {
        if(isTeen(a) || isTeen(b) || isTeen(c)){
            return  true;
        }
        return  false;
    }

    public static boolean isTeen(int a){
        if(a >= 13 && a <=19){
            return  true;
        }
        return false;
    }

}
