package java11_features;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

public class FileMethods {
	@Test
	public void test() throws IOException {
		Path filePath = Files.writeString(Files.createTempFile("tempDir", ".txt"), "Sample text");
		String fileContent = Files.readString(filePath);
		assertThat(fileContent).isEqualTo("Sample text");
	}
}
