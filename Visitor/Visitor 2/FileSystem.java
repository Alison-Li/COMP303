/**
 * Tester Class
 */
public class FileSystem {
    public static void main(String[] args) {
        Folder docFolder = new Folder("Documents");
        Folder musicFolder = new Folder("Music");

        File f1 = new File("COMP303_assignment.java");
        File f2 = new File("COMP273_assignent.asm");
        File f3 = new File("baby_shark.mp3");
        docFolder.add(f1);
        docFolder.add(f2);
        musicFolder.add(f3);

        File f4 = new File("lonely_file.txt");

        Directory homeDirectory = new Directory("Home");
        homeDirectory.add(docFolder);
        homeDirectory.add(musicFolder);
        homeDirectory.add(f4);

        Visitor printVisitor = new PrintVisitor();
        homeDirectory.accept(printVisitor);
    }
}