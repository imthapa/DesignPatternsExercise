package question3;

/**
 * Created by ishwar on 16/4/17.
 */
public class FileUtility {

    private volatile static FileUtility fileUtility;
    int checker;
    private FileUtility() {
    }

    public static FileUtility getInstance(){
        if(fileUtility == null){
            synchronized (FileUtility.class){
                if(fileUtility == null){
                    fileUtility = new FileUtility();
                }
            }
        }
        return fileUtility;
    }

    public void readFile() {
        System.out.println("reading file........");
    }

    public int getChecker() {
        return checker;
    }

    public void setChecker(int checker) {
        this.checker = checker;
    }
}
