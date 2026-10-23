public class SoftwareDeveloper {
    public static int MAX_DEVELOPER = 100;
    private static int dev_count = 0;
    private IProgrammingLanguage language;

    public SoftwareDeveloper(IProgrammingLanguage language){
        if (hasBudget){
            this.language = language;
            dev_count++;
        }
    }

    public void setLanguage(IProgrammingLanguage language){
        this.language = language;
    }

    private boolean hasBudget(){
        if (dev_count > 3){
            System.out.println("Come on bro, we dont have budget...");
            return false;
        }
        return true;
    }
}