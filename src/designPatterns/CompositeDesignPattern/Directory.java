package designPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	String directoryName;
	List<FileSystem> fileSystemList;

	public Directory(String name) {
		directoryName = name;
		fileSystemList = new ArrayList<>();
	}

	public void add(FileSystem fileSystem) {
		fileSystemList.add(fileSystem);
	}

	@Override
	public void ls() {
		System.out.println("Directory name " + directoryName);
		for (FileSystem fileSystemObj : fileSystemList) {
			fileSystemObj.ls();
		}
	}
}
