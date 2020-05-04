public class ArrayTest{
    public static void main(final String[] args) {
        float[] yearOfBirth = {1976, 1996, 2001, 2003, 2005, 2008, 2010};
        float currentYear = 2020;
        String[] names = {"Saily Njie", "Foday Sanyang", "Muhammed Jeng"};
         String name = "";
        char[] nameCodes = {'S', 'F', 'M'};
        float[] age = new float[nameCodes.length];



        for(int i = 0; i < nameCodes.length; i++) {
            switch(nameCodes[i]){
                case 'S':
                age[i] = currentYear - yearOfBirth[i];
                name = names[i];
                // System.out.println(name);
                break;

                case 'F':
                age[i] = currentYear - yearOfBirth[i];
                name = names[i];
                // System.out.println(name);
                break;

                case 'M':
                age[i] = currentYear - yearOfBirth[i];
                name = names[i];
                // System.out.println(name);
                break;

                default:
                System.out.println("Invalid name code");
                age[i] = 0.0f; 
            }

            System.out.printf("%s: %s years \n", name, age[i] );
        }

        // for (String name : names) {
        //     System.out.printf(" %s", name) ;
            
        // }
        
       
    }
}