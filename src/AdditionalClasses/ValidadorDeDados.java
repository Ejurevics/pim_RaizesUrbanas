package AdditionalClasses;

import java.util.regex.Pattern;

public class ValidadorDeDados {

    public boolean validarCPF(String cpf) {
        return Pattern.matches("\\d{11}", cpf);
    }

    public boolean validarEmail(String email) {
        String regex = "^[\\w-\\.]+@[\\w-\\.]+\\.[a-z]{2,3}$";
        return Pattern.matches(regex, email);
    }
}

