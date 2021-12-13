package operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Operations {
	String fileName;
	FileWriter fWriter;
	BufferedWriter bWriter;

	public void finalize() throws IOException {
		// fWriter.close();
	}

	public Operations(String fileName) throws IOException {
		// TODO add log here IOException
		this.fileName = fileName;

	}

	public int createRecord(String details[]) throws IOException {
		this.bWriter = new BufferedWriter(new FileWriter(fileName, true));
		bWriter.write("ssss");
		for (String detail : details) {
			// TODO add log here ERROR CREATING RECORD
			bWriter.write(detail + ", ");
		}
		bWriter.write("\n");
		bWriter.close();
		return 0;
	}

	public boolean deleteRecord(String name) throws IOException {
		File inputFile = new File("detailsRam.txt");
		File tempFile = new File("myTempFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String lineToRemove = name;
		String currentLine;

		while ((currentLine = reader.readLine()) != null) {
			String trimmedLine = currentLine.trim();
			if (trimmedLine.split(",")[0].equals(lineToRemove))
				continue;
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		inputFile.delete();
		boolean successful = tempFile.renameTo(inputFile);
		return successful;
	}

}
