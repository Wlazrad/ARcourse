package KlasaAnonimowa;

public class FindTheMissingLetter {
    public static class Kata
    {
        private static int missing;
        public static char findMissingLetter(char[] array){

            for(int i = 0; i < array.length-1; i++){
                if(array[i]+1 != array[i+1])
                    missing = array[i]+1;
            }
            System.out.println((char)missing);
            return (char)missing;
        }
    }
}
