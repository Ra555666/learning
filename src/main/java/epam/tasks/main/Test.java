package epam.tasks.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Test {

    public void listf(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if (fList != null)
            for (File file : fList) {
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    listf(file.getAbsolutePath(), files);
                }
            }
    }


    public static void countingDirectory(String path) {
        int count = new File(path).list().length;
    }

    static void countDirectoryWhenPathToFile(String pathTo) {
        long count = 0;
        try {
            count = Files.find(Paths.get(pathTo), 1,  // how deep do we want to descend
                    (path, attributes) -> attributes.isDirectory()
            ).count() - 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Directories " + count);
    }

    public static void main(String[] args) {
        String path = "e:\\forMain\\music\\Everlast - Whitey Ford's House of Pain (2018)\\Cover.jpg";
        Test test = new Test();
        try {
            File mainPath = new File(path);
            if (mainPath.exists() && mainPath.isFile()) {
                System.out.println("is file");
                test.countingDirectory(path);
                System.out.println("after counting");
            }
        } catch (NullPointerException e) {
            System.out.println("Null");
        }
    }
}
