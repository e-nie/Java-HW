package homework.design_patterns.adapter.file_converter;

public class Main {
    static void main(String[] args) {
        DocProcessor docProcessor  = new DocProcessor();
        FileProcessor fileProcessor  = new PDFAdapter(docProcessor);
        fileProcessor.process("document.pdf");

        docProcessor.processDoc("document.doc");
    }
}
