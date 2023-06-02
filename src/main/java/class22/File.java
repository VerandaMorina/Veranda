package class22;

abstract public class File {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    void edit() {
        System.out.println("Editing");
    }

    void close() {
        System.out.println("Closing");
    }

    abstract void open();

    void printInfo() {
        System.out.println(name + " " + size);
    }


}

class JavaFile extends File {
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To Open .java file we need notepad++ or sublime text");
    }
}

class WordFile extends File {
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}

class PdfFile extends File {
    public PdfFile(String name, int size) {
        super(name, size);
    }

    void open() {
        System.out.println("To open.pdf you need Microsoft Office");
    }

}

class FileTester {
    public static void main(String[] args) {
        File []files={new JavaFile("Animals",22)};
        for (File file:files){
            file.printInfo();
            file.open();
            file.edit();
            file.close();
        }

    }
}

