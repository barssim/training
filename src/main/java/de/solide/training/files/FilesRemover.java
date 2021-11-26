package de.solide.training.files;

import java.io.File;
import java.util.Arrays;

public class FilesRemover {
	private void
			remove(String FolderName) {
		Arrays.stream(new File(FolderName).listFiles()).forEach(File::delete);
	}

	public static void
			main(String[] args) {
		FilesRemover filesRemover = new FilesRemover();
		filesRemover.remove("./folderRemoverTest/");

	}

}
