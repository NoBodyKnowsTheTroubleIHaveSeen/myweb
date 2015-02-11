package myweb;

import com.jfinal.core.JFinal;

public class Pragram
{
    public static void main(String[] args)
    {
        JFinal.start("/src/main/webapp",80,"/",10);
    }
}
