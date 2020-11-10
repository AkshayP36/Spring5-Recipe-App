public class Main {
    public static void main(String[] args){
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = "+printer.getPagesPrinted());
        int pagesPrinter = printer.printPages(8);
        System.out.println("Pages printer was = "+pagesPrinter + " new total counter for printer = "+printer.getPagesPrinted());
        pagesPrinter = printer.printPages(2);
        System.out.println("Pages printer was = "+pagesPrinter + " new total counter for printer = "+printer.getPagesPrinted());

    }

}
