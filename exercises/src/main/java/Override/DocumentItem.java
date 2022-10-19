package Override;

public class DocumentItem extends Item{
//https://javappa.com/kurs-java/przeslanianie-metod

    @Override
    public String getName() {
        super.getName();
        return "Document Item";
    }
}
