public class DocumentFactory {

    public DocumentItem create() {
        DocumentItem documentItem = new DocumentItem();
        documentItem.setName("test");
        return documentItem;
    }

    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        DocumentItem documentItem = documentFactory.create();
        System.out.println(documentItem.getName());
    }
}