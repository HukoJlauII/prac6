package Factory;

public class ChairFactory {


        public VictorianChair createVictorianChair() {
            return new VictorianChair(18);
        }

        public MagicChair createMagicianChair() {
            return new MagicChair();
        }

        public FunctionalChair createFunctionalChair() {
            return new FunctionalChair();
        }

}
