package homework.design_patterns.abstract_fabric.furniture;

public class ClassicChair implements Chair{
    @Override
    public void use() {
        System.out.println("Classic Chair");
    }
}
