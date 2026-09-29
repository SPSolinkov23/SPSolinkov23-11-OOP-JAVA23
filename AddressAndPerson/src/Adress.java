    public class Address{
        String City;
        String Street;
        int number;

        Address(String City, String Street, int number){
            this.City = City;
            this.Street = Street;
            this.number = number;
        }

        void showAddress(String City, String Street, int number){
            System.out.println(String.format("City: " + City  + ", Street: " + Street + ", number: " + number));
        }
}