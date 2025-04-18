class Report {
    void printReport(String name) {
        System.out.println("Report for student: " + name);
    }

    void printReport(String name, int marks) {
        System.out.println(name + " scored: " + marks);
    }
}

public class ReportCard {
    public static void main(String[] args) {
        Report r = new Report();
        r.printReport("Aachal");
        r.printReport("Aachal", 100);
    }
}
