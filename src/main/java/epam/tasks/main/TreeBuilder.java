package epam.tasks.main;

import java.io.File;

public class TreeBuilder {

    static void RecursivePrint(File[] arr, int index, int level) {
        if (index == arr.length)
            return;
        if (arr[index].isFile() && level == 100) {
            System.out.println("      " + arr[index].getName());
        }
         else if (arr[index].isFile()) {
            System.out.println("|     " + arr[index].getName());
            if(index == arr.length-1){
                System.out.println("|     ");
            }
        } else if (arr[index].isDirectory()) {
            if (index == arr.length - 1) {
                level = 100;
                System.out.println("|-----" + arr[index].getName());
                RecursivePrint(arr[index].listFiles(), 0, level);
            } else {
                System.out.println("|-----" + arr[index].getName());
                RecursivePrint(arr[index].listFiles(), 0, level + 1);
            }
        }
        RecursivePrint(arr, ++index, level);
    }

    public static void main(String[] args) {
        String mainDirPath = args[0];
        File mainDir = new File(mainDirPath);
        File arr[] = null;

        if (mainDir.exists() && mainDir.isDirectory()) {
            arr = mainDir.listFiles();
            RecursivePrint(arr, 0, 0);
        }
    }
}
