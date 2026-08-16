package homework.design_patterns.abstract_fabric.furniture;

public class ClassicTable implements Table{
    @Override
    public void use() {
        System.out.println("Classic Table");
    }
}
