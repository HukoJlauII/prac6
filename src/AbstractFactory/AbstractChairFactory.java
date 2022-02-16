package AbstractFactory;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}
