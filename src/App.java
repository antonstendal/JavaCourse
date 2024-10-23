public class App {

    public String name;
    public int version;

    public void appInfo(){
        System.out.println("App " +name+ " version is " + version);
    }

    public App(String name, int version){
        this.name = name;
        this.version = version;
    }

}
