package Mypack;
import java.io.Serializable;

public class Pojo  implements Serializable
{
    public  String n,fn,mn,a,g,d,e,pa;
    public Pojo(String n,String fn,String mn,String a,String g,String d,String e,String pa)
    {
        this.n=n;
        this.fn=fn;
        this.mn=mn;
        this.a=a;
        this.g=g;
        this.d=d;
        this.e=e;
        this.pa=pa;
    }

    public String getN() {
        return n;
    }

    public String getFn() {
        return fn;
    }

    public String getMn() {
        return mn;
    }

    public String getA() {
        return a;
    }

    public String getG() {
        return g;
    }

    public String getD() {
        return d;
    }

    public String getE() {
        return e;
    }

    public String getPa() {
        return pa;
    }
    
}



