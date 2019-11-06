public abstract class Decorator implements IComponent{

    private IComponent coreObject;

    public Decorator(IComponent component) {
        this.coreObject = component;
    }
    @Override
    public void decorate() {
        this.coreObject.decorate();
    }
}
