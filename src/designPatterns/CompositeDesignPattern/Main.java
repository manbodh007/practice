package designPatterns.CompositeDesignPattern;

public class Main {
	public static void main(String[] args) {
       Directory directory = new Directory("Movies");
	   File file = new File("hulk");
	   directory.add(file);
	   Directory bollywoodDirectory = new Directory("Bollywood Movies");
	   File movie = new File("gajni");
	   bollywoodDirectory.add(movie);
	   directory.add(bollywoodDirectory);
	   directory.ls();
	}
}
