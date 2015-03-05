/**
 * Created by Kubish on 05.03.2015.
 */
public class DocZip {
    public static void main(String[] argc) {
        String outFile = "G:\\out.txt";
        UnZipp file = new UnZipp();
        System.out.println(file.zipName);
        System.out.println(file.unZipName);
        file.RunZipp();
        file.runparse(outFile);
    }
}
