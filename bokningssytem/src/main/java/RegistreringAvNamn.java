public class RegistreringAvNamn {

    public boolean inhallerBokstaver(String namn) {

        return namn.matches(".*[a-zA-Z].*");

    }

    public boolean inhallerSiffror(String namn) {

        return namn.matches(".*[0-9].*");

    }
}
