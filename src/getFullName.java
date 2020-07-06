public class getFullName {

    String fName;
    String sName;

    public void getName(String fName, String sName) {
        this.fName = fName;
        this.sName = sName;
        String upperCsName = sName.toUpperCase();
        System.out.println("First name= " + fName  + "\nSecond name= "+upperCsName+"\n");
    }
    @Override

    public String toString(){
        return fName + " " + sName;

    }



}
