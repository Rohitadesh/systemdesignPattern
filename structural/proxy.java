import java.util.*;
interface Internet{
    void connectTo(String serverHost) throws Throwable;


}

class RealInternet implements Internet{
    @Override
    public void connectTo(String serverHost){
        System.out.println("Hosting the server"+serverHost);
    }
}

class ProxyInternet implements Internet{
    RealInternet realInternet = new RealInternet();
     private static List<String> bannedSites;
     static {
        bannedSites =new ArrayList<>();
        bannedSites.add("ww.csdds.com");
        bannedSites.add("www.fhsdfjdf.com");
     }
     @Override
     public void connectTo(String serverHost) throws Throwable{
        if(bannedSites.contains(serverHost)){
            throw new Exception("Denied to"+serverHost);
        }
        realInternet.connectTo(serverHost);
     }

}
class proxy{
    public static void main(String[] args) throws Throwable{
        ProxyInternet proxyInternet = new ProxyInternet();
        try {
            proxyInternet.connectTo("ww.csdds.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      try {
            proxyInternet.connectTo("ww.csdds.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}