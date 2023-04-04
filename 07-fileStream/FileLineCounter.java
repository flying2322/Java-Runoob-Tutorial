import java.io.*;
public class FileLineCounter {
    private static int totalLines = 0;   // 总行数
    private static int filecounter = 0; // file number counter
    public static void main(String[] args) {
	// 1. pbs algorithm lines statistics
	File dir = new File("/home/dominic/dev/Haiq6/path_planning/algo/path_planning_pbs/src");
	// 2. g5 algorithm lines statistics
        File dir2 = new File("/home/dominic/dev/Haiq6/path_planning/algo/path_planning_g5/impl");  // 文件夹路径
	// 3. charging algorithm
	File dir3 = new File("/home/dominic/dev/Haiq6/charging_strategy/FlexibleChargingAlgorithm");
        // 4. mc_v4
	File dir4 = new File("/home/dominic/dev/Haiq6/mission_control/src/MCAlgorithm_v4");
	// 5. op
	File dir5 = new File("/home/dominic/dev/Haiq6/order_processor/src");
	// 6. mc_v5
	File dir6 = new File("/home/dominic/dev/Haiq6/mission_control/src/MCAlgorithm_v5");
	// 7. ess-core
	File dir7 = new File("/home/dominic/dev/ess/ess-core/src/main/java/com/hairoutech/ess");	
        countLines(dir7);
        System.out.println("Total lines and file number: " + totalLines + ", " + filecounter + ".");
    }
    private static void countLines(File file) {
        if (file.isFile()) {    // 如果是文件，统计行数
	    filecounter ++;
            int lines = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.readLine() != null) {
                    lines++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File Num: " + filecounter + ", LineNum: " + lines + " : " + file.getAbsolutePath() );
            totalLines += lines;
        } else if (file.isDirectory()) {    // 如果是文件夹，遍历子文件和子文件夹
            File[] files = file.listFiles();
            for (File subFile : files) {
                countLines(subFile);
            }
        }
    }
}

