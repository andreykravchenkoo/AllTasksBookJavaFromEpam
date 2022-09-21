package Task3;

import java.io.File;
import java.util.List;

public class FolderRider {
    public void listFolder(String directory, List<File> fileList) {
        File file = new File(directory);

        File[] fList = file.listFiles();
        if (fList != null) {
            for (File file1 : fList) {
                if (file1.isFile()) {
                    fileList.add(file1);
                } else if (file1.isDirectory()) {
                    listFolder(file1.getAbsolutePath(), fileList);
                }
            }
        }

        System.out.println(fileList);
    }
}
