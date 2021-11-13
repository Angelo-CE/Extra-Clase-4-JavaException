public class ExampleIVServiceClient {

    public static void main(String[] args) {
        ExampleIVRegistrationService service = new ExampleIVRegistrationService();
        try {
            service.validateEmail("[email protected]");
        } catch (ExampleIV e) {
            System.out.println("Intente de nuevo hacer su registro");
           // e.printStackTrace();
        }
    }
}
