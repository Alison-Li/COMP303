/**
 * Proxy Pattern Demo
 * Credit: https://www.geeksforgeeks.org/proxy-design-pattern/
 */
public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet(); 
        try { 
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("facebook.com");
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        } 
    }    
}