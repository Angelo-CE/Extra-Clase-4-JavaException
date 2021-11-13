import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExampleIVRegistrationService {
    List<String> registeredEmails = Arrays.asList("[email protected]","[email protected]");


    public void validateEmail(String email) throws ExampleIV{
        if(registeredEmails.contains(email)){
            throw new ExampleIV("Ya ha sido registrado");
        }

    }

}
