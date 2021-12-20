package document;

public class DocumentTest {
    public static void main(String[] args) {
        ExcelDocument excel = new ExcelDocument();
        Document excel1 = new ExcelDocument();

        Document pdf = new PdfDocument();

        pdf.getDescription();
        excel.getDescription();
        excel1.getDescription();

    }
}
