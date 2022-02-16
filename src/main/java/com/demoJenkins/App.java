package com.demoJenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GreetService service = new GreetServiceImpl();
        if(args.length==0) {
        	System.out.println(""+service.greet("somebody"));
        }else {
        	for(String uName:args) {
        		System.out.println(""+service.greet(uName));
        	}
        }
    }
}
