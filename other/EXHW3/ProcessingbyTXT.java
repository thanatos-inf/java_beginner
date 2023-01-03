package other.EXHW3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ProcessingbyTXT {
    File outFile;
    String name;


    public void processingTXT(UserInfo userInfo) throws IOException {
        name = "D:/Learning/WorkFolder/java/other/EXHW3" + userInfo.getUserInfobyIndex(0) + ".txt";
        writeFile(userInfo, checkSameName());
    }

    private boolean checkSameName() {
        File oldFile = new File("D:/Learning/WorkFolder/java/other/EXHW3");
        return oldFile.exists();
    }

    private void writeFile(UserInfo userInfo, boolean value) throws IOException {
        outFile = new File(name);
        try (FileWriter fw = new FileWriter((outFile), StandardCharsets.UTF_8, value);
             BufferedWriter writer = new BufferedWriter(fw)) {

            for (String sourse : userInfo.getUserInfo()) {
                writer.append(sourse).append(" ");
            }
            writer.newLine();
        }
    }
}
