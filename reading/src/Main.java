import java.io.*;

public class Main {

    static String[] mainArray = new String[219];
    static int[] valueArray = new int[219];
    static String[] typeArray = new String[219];

    public static void main(String[] args) throws IOException {
        //http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html
        File file = new File("pathname");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        int i = 0;
        while((line = bufferedReader.readLine()) != null){
            putIntoArray(line, i);
            i++;
        }
        insertIntoValueArray();
        sortArray();
        writeToFile();
    }
    public static void insertIntoValueArray() {
        valueArray[0] = 0;
        for (int i = 1; i < mainArray.length; i++) {
            if (mainArray[i] != null) {
                String[] sub = mainArray[i].split("\\|", 6);
                typeArray[i] = sub[0];
                int val = Integer.parseInt(sub[4]);
                valueArray[i] = val;
            }
        }
    }
    public static void putIntoArray(String line,int i){
            mainArray[i] = line;
    }

    public static void sortArray() {
        for (int i = 1; i < mainArray.length-1; i++) {
            for (int j=0; j < mainArray.length-i-1; j++) {
                if(typeArray[j]!=null && typeArray[j+1] !=null)
                    if (typeArray[j].equals(typeArray[j+1])) {
                        if (valueArray[j] > valueArray[j + 1]) {
                            int valueTemp = valueArray[j];
                            String mainTemp = mainArray[j];

                            valueArray[j] = valueArray[j + 1];
                            valueArray[j + 1] = valueTemp;

                            mainArray[j] = mainArray[j + 1];
                            mainArray[j + 1] = mainTemp;


                        }
                    }
            }
        }
    }
    public static void writeToFile() throws IOException {
        //https://www.programcreek.com/2011/03/java-write-to-a-file-code-example/
        File out = new File("pathname");
        FileOutputStream fileOutputStream = new FileOutputStream(out);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        for(int i = 0; i < mainArray.length; i++){
            bufferedWriter.write(mainArray[i]);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
