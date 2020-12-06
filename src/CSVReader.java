import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    String file;
    String row;
    int roomDataRows = 3;
    int roomDataColumns = 2;
    int i;

    public CSVReader(String filePath) {
        file = "gamerooms.csv";
    }

    public String[][] readData() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(file));
        String[][] allRoomData = new String[roomDataRows][roomDataColumns];
        i = 0;
        while ((row = csvReader.readLine()) != null) {
            String[] roomData = row.split(",");
            allRoomData[i] = roomData;
            i++;
        }
        csvReader.close();
        return allRoomData;
    }
}
