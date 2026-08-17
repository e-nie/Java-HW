package homework.design_patterns.adapter.file_converter;

public class PDFAdapter implements FileProcessor {
    private DocProcessor docProcessor;

    public PDFAdapter(DocProcessor docProcessor) {
        this.docProcessor = docProcessor;
    }

    @Override
    public void process(String fileName) {
        System.out.println("Converting PDF to Doc...");
        docProcessor.processDoc(fileName);
    }
}
