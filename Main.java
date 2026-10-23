public class Main {
    public static void main(String[] args){
        SoftwareDeveloper dev = new SoftwareDeveloper(new Java());
        dev.code();
        dev.setLanguage(new HTML());
        dev.code();
        SoftwareDeveloper dev2 = new SoftwareDeveloper(new Python());
        dev2.code();
        SoftwareDeveloper dev3 = new SoftwareDeveloper(new JS());
        dev3.code();
        SoftwareDeveloper dev4 = new SoftwareDeveloper(new CSS());
    }
}