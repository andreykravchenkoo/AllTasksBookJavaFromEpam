package Task3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        FolderRider folderRider = new FolderRider();

        String directory = "C:\\Users\\Andrey\\IdeaProjects\\Task9";
        List<File> fileList = new ArrayList<>();

        folderRider.listFolder(directory, fileList);
    }
}
